package hu.nje.townsapp.web;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {

    private final UserDetailsManager users;      // this is your InMemoryUserDetailsManager bean
    private final PasswordEncoder encoder;

    public RegistrationController(UserDetailsManager users, PasswordEncoder encoder) {
        this.users = users;
        this.encoder = encoder;
    }

    @GetMapping("/register")
    public String registerForm(Model model) {
        model.addAttribute("error", null);
        return "register";
    }

    @PostMapping("/register")
    public String doRegister(@RequestParam String username,
                             @RequestParam String password,
                             Model model) {

        if (users.userExists(username)) {
            model.addAttribute("error", "Username already exists. Please choose another.");
            return "register";
        }

        users.createUser(
                User.withUsername(username)
                        .password(encoder.encode(password))
                        .roles("USER")              // new users get USER role
                        .build()
        );

        // after successful
        return "redirect:/login?registered";
    }
}

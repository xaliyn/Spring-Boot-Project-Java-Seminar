package hu.nje.townsapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Welcome to TownsApp");
        return "index";
    }

    //  New method for Task 3
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About TownsApp");
        return "about";
    }
}

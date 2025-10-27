package hu.nje.townsapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        // ✅ Everything is public now
                        .anyRequest().permitAll()
                )
                // ✅ Disable login form because everything is public
                .formLogin(form -> form.disable())
                // ✅ Allow logout but not needed
                .logout(logout -> logout.permitAll())
                // ✅ Disable CSRF for testing / demo
                .csrf(csrf -> csrf.disable());

        return http.build();
    }

    // Optional: only used for registration encoding
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

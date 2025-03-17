package com.GestionAsignaciondeViajes.Gav.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/").permitAll()

                )
                .httpBasic(Customizer.withDefaults())
                .csrf(csrf -> csrf.disable());  // Desactiva CSRF para evitar problemas con solicitudes de formularios
        //.rememberMe(Customizer.withDefaults());
        return http.build();

    }
}
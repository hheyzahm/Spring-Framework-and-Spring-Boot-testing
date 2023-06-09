package springFrameworkSpringBoot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @Created 30 03 2023 - 10:26 AM
 * @Author Hazeem Hassan
 */
@Configuration
public class SpringSecurityConfig {

    /*@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests()
                .anyRequest().authenticated().and()
                .oauth2ResourceServer().jwt();
        *//* .httpBasic(Customizer.withDefaults())
                .csrf().ignoringRequestMatchers("/api/**");*//*
        return httpSecurity.build();
    }*/
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .anyRequest().authenticated()
                .and().oauth2ResourceServer().jwt();

        return http.build();
    }
}





















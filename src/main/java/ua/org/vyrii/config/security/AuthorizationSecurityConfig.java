//package ua.org.vyrii.config.security;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import static org.springframework.http.HttpMethod.GET;
//import static org.springframework.http.HttpMethod.POST;
//import static org.springframework.http.HttpMethod.PUT;
//import static org.springframework.http.HttpMethod.DELETE;
//import static ua.org.vyrii.persistence.type.PermissionType.*;
//
//
//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity
//@RequiredArgsConstructor
//public class AuthorizationSecurityConfig {
//
//    private final AuthenticationProvider authenticationProvider;
//    private final JwtAuthenticationFilter jwtAuthenticationFilter;
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//        http
//                .csrf(AbstractHttpConfigurer::disable)
//                .authorizeHttpRequests(authorize -> authorize
//                        .requestMatchers("/api/open/**", "/api/auth/**", "/swagger-ui.html").permitAll()
////                        .requestMatchers("/api/personal/**", "/api/personal/cart/**").hasAnyRole(PERSONAL.name())
////                        .requestMatchers(GET, "/api/personal/**").hasAuthority(PERSONAL_READ.name())
////                        .requestMatchers(POST, "/api/personal/**").hasAuthority(PERSONAL_CREATE.name())
////                        .requestMatchers(PUT, "/api/personal/**").hasAuthority(PERSONAL_UPDATE.name())
////                        .requestMatchers(DELETE, "/api/personal/**").hasAuthority(PERSONAL_DELETE.name())
//                        .requestMatchers(GET, "/api/admin/**").hasAuthority(ADMIN_READ.name())
//                        .requestMatchers(POST, "/api/admin/**").hasAuthority(ADMIN_CREATE.name())
//                        .requestMatchers(PUT, "/api/admin/**").hasAuthority(ADMIN_UPDATE.name())
//                        .requestMatchers(DELETE, "/api/admin/**").hasAuthority(ADMIN_DELETE.name())
//                        .anyRequest().authenticated()
//                )
//                .authenticationProvider(authenticationProvider)
//                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
//
//        return http.build();
//    }
//}

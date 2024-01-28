//package ua.org.vyrii.config.security;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//import ua.org.vyrii.api.dto.request.auth.RegisterDto;
//import ua.org.vyrii.api.dto.response.auth.AuthDto;
//import ua.org.vyrii.persistence.entity.token.Token;
//import ua.org.vyrii.persistence.entity.user.Personal;
//import ua.org.vyrii.persistence.entity.user.User;
//import ua.org.vyrii.persistence.repository.token.TokenRepository;
//import ua.org.vyrii.persistence.repository.user.PersonalRepository;
//import ua.org.vyrii.persistence.repository.user.UserRepository;
//
//@Service
//@RequiredArgsConstructor
//public class AuthenticationService {
//
//    private final PasswordEncoder passwordEncoder;
//    private final PersonalRepository personalRepository;
//    private final UserRepository<User> userRepository;
//    private final TokenRepository tokenRepository;
//    private final JwtService jwtService;
//    private final AuthenticationManager authenticationManager;
//
//    public AuthDto register(RegisterDto dto) {
//        if (userRepository.existsByLogin(dto.getEmail())) {
//            throw new RuntimeException("This email is already exists");
//        }
//        Personal personal = new Personal();
//        personal.setLogin(dto.getEmail());
//        personal.setPassword(passwordEncoder.encode(dto.getPassword()));
//        personal = personalRepository.save(personal);
//        String jwtToken = jwtService.generateToken(personal);
//        Token token = new Token();
//        token.setToken(jwtToken);
//        token.setUser(personal);
//        tokenRepository.save(token);
//        return new AuthDto(jwtToken);
//    }
//
//    public AuthDto login(RegisterDto dto) {
//        authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(dto.getEmail(), dto.getPassword())
//        );
//        var user = userRepository.findByLogin(dto.getEmail()).orElseThrow();
//        String jwtToken = jwtService.generateToken(user);
//        Token token = new Token();
//        token.setToken(jwtToken);
//        token.setUser(user);
//        tokenRepository.save(token);
//        return new AuthDto(jwtToken);
//    }
//}
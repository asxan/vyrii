package ua.org.vyrii.persistence.repository.token;

import ua.org.vyrii.persistence.entity.token.Token;
import ua.org.vyrii.persistence.repository.BaseRepository;

import java.util.List;
import java.util.Optional;

public interface TokenRepository extends BaseRepository<Token> {
    Optional<Token> findByToken(String token);
    List<Token> findByUserId(Long userId);
}

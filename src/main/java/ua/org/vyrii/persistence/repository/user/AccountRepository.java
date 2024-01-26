package ua.org.vyrii.persistence.repository.user;

import org.springframework.stereotype.Repository;
import ua.org.vyrii.persistence.entity.user.Account;
import ua.org.vyrii.persistence.repository.BaseRepository;

@Repository
public interface AccountRepository extends BaseRepository<Account> {
}

package ua.org.vyrii;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.org.vyrii.persistence.repository.company.CompanyRepository;
import ua.org.vyrii.service.company.CompanyService;
import ua.org.vyrii.service.company.impl.CompanyServiceImpl;

@SpringBootApplication
public class VyriiApplication {

    public static void main(String[] args) {
        SpringApplication.run(VyriiApplication.class, args);
    }
}

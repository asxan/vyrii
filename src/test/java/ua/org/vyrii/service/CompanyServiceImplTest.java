package ua.org.vyrii.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import ua.org.vyrii.exception.EntityUnexistsException;
import ua.org.vyrii.exception.NotValidFieldDataException;
import ua.org.vyrii.persistence.entity.company.Company;
import org.springframework.boot.test.context.SpringBootTest;
import ua.org.vyrii.persistence.repository.company.CompanyRepository;
import ua.org.vyrii.service.company.impl.CompanyServiceImpl;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.time.YearMonth;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CompanyServiceImplTest {
    @InjectMocks
    private CompanyServiceImpl companyService;

    @Mock
    private CompanyRepository companyRepository;
//
//    @Test
//    public void createValidCompany() {
//        // Create a valid company
//        Company company = new Company();
//        company.setName("Test Company");
//        company.setDescription("Company Description");
//        company.setOwner("Company Owner");
//        company.setFoundingYear(YearMonth.of(2022, 1));
//
//        // Call the create method
//        companyService.create(company);
//
//        // Verify that the company is saved to the repository
//        verify(companyRepository, Mockito.times(1)).save(company);
//    }
//
//    @Test
//    void createNullCompany() {
//        // Call the create method with a null company
//        assertThrows(EntityUnexistsException.class, () -> companyService.create(null));
//    }
//
//    @Test
//    void createCompanyWithNullName() {
//        // Create a company with a null name
//        Company company = new Company();
//        company.setDescription("Company Description");
//        company.setOwner("Company Owner");
//        company.setFoundingYear(YearMonth.of(2022, 1));
//
//        // Call the create method with a company having a null name
//        assertThrows(NotValidFieldDataException.class, () -> companyService.create(company));
//    }
//
//    @Test
//    void createCompanyWithNullDescription() {
//        // Create a company with a null description
//        Company company = new Company();
//        company.setName("Test Company");
//        company.setOwner("Company Owner");
//        company.setFoundingYear(YearMonth.of(2022, 1));
//
//        // Call the create method with a company having a null description
//        assertThrows(NotValidFieldDataException.class, () -> companyService.create(company));
//    }
//
//    @Test
//    void createCompanyWithNullOwner() {
//        // Create a company with a null owner
//        Company company = new Company();
//        company.setName("Test Company");
//        company.setDescription("Company Description");
//        company.setFoundingYear(YearMonth.of(2022, 1));
//
//        // Call the create method with a company having a null owner
//        assertThrows(NotValidFieldDataException.class, () -> companyService.create(company));
//    }
//
//    @Test
//    void createCompanyWithNullFoundingYear() {
//        // Create a company with a null founding year
//        Company company = new Company();
//        company.setName("Test Company");
//        company.setDescription("Company Description");
//        company.setOwner("Company Owner");
//
//        // Call the create method with a company having a null founding year
//        NotValidFieldDataException exception = assertThrows(NotValidFieldDataException.class, () -> companyService.create(company));
//
//        assertThat(exception).isInstanceOf(NotValidFieldDataException.class);
////        assertThat(exception.getMessage()).isEqualTo("Company founding year cannot be null");
//    }
}

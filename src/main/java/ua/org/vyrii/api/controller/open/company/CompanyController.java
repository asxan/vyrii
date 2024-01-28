package ua.org.vyrii.api.controller.open.company;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.org.vyrii.api.dto.response.company.CompanyPdpDto;
import ua.org.vyrii.api.dto.response.company.CompanyPlpDto;
import ua.org.vyrii.facade.CompanyPdpFacade;
import ua.org.vyrii.facade.CompanyPlpFacade;


import java.util.List;

@RestController
@RequestMapping("/api/open/companies")
@AllArgsConstructor
public class CompanyController {
    private final CompanyPlpFacade companyPlpFacade;
    private final CompanyPdpFacade companyPdpFacade;

    @GetMapping("/plp")
    public ResponseEntity<List<CompanyPlpDto>> findAll(){
        return ResponseEntity.ok(companyPlpFacade.findAll());
    }

    @GetMapping("/pdp/{companyId}")
    public ResponseEntity<CompanyPdpDto> findVariantByCompany(@PathVariable Long companyId){
        return ResponseEntity.ok(companyPdpFacade.findByCompanyId(companyId));
    }
}

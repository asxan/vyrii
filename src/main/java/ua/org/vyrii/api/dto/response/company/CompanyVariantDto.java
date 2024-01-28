package ua.org.vyrii.api.dto.response.company;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Digits;
import lombok.Getter;
import lombok.Setter;
import ua.org.vyrii.api.dto.response.ResponseDto;
import ua.org.vyrii.persistence.entity.company.CompanyVariant;

import java.math.BigDecimal;
@Getter
@Setter
public class CompanyVariantDto extends ResponseDto {
    private String activityField;
    private String type;
    private String  employeesCount;
    private String capitalization;

    public CompanyVariantDto(CompanyVariant companyVariant){
        setId(companyVariant.getId());
        setActivityField(companyVariant.getActivityField());
        setType(companyVariant.getType());
        setEmployeesCount(companyVariant.getEmployeesCount().toString());
        setCapitalization(companyVariant.getCapitalization().toString());
    }
}

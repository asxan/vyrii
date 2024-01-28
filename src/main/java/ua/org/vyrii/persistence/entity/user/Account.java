//package ua.org.vyrii.persistence.entity.user;
//
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//import ua.org.vyrii.persistence.entity.BaseEntity;
//import ua.org.vyrii.persistence.entity.deal.Beneficiary;
//
//import java.time.YearMonth;
//import java.util.HashSet;
//import java.util.Set;
//
//@Getter
//@Setter
//@Entity
//@Table(name = "accounts")
//public class Account extends BaseEntity {
//
//    @Column(name = "age", nullable = false)
//    private Integer age;
//
//    @Column(name = "sex", nullable = false)
//    private String sex;
//
//    @Column(name = "ipn", nullable = false)
//    private Integer ipn;
//
//    @Column(name = "passport_number", nullable = false)
//    private Integer passportNumber;
//
//    @Column(name = "authority", nullable = false)
//    private Integer authority;
//
//    @Column(name = "issue_data", nullable = false)
//    private YearMonth issueDate;
//
//    @OneToMany
//    private Set<Beneficiary> beneficiaries;
//
//
//    public Account() {
//        this.beneficiaries = new HashSet<>();
//    }
//}

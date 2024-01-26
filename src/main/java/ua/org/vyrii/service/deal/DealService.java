package ua.org.vyrii.service.deal;

import ua.org.vyrii.persistence.entity.deal.Beneficiary;
import ua.org.vyrii.service.CrudService;
import ua.org.vyrii.service.FindAllService;

public interface DealService extends CrudService<Beneficiary>, FindAllService<Beneficiary> {
}

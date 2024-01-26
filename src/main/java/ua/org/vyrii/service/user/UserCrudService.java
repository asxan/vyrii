package ua.org.vyrii.service.user;

import ua.org.vyrii.persistence.entity.user.User;
import ua.org.vyrii.service.CrudService;
import ua.org.vyrii.service.FindAllService;

public interface UserCrudService<U extends User> extends CrudService<U>, FindAllService<U> {
}

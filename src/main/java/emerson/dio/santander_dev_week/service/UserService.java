package emerson.dio.santander_dev_week.service;

import emerson.dio.santander_dev_week.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}

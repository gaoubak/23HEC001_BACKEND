package com.application.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.application.model.Users;

public interface UsersRepository extends CrudRepository<Users, Long> {
    List<Users> findByEmail(String email);

    List<Users> findByPassword(String password);

    List<Users> findAll();

    List<Users> findById(Integer id);

    List<Users> findByFirstname(String firstname);
}

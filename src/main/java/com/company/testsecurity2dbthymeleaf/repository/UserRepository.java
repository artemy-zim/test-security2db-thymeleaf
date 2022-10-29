package com.company.testsecurity2dbthymeleaf.repository;

import com.company.testsecurity2dbthymeleaf.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}

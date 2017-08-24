package com.hiwan.test.user_eureka.repository;

import com.hiwan.test.user_eureka.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}

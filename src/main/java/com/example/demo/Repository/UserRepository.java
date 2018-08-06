package com.example.demo.Repository;

import com.example.demo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
    public User findById(long id);

    public Long deleteById(long id);
}

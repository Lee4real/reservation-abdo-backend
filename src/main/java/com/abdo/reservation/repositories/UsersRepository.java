package com.abdo.reservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.abdo.reservation.entites.User;

import java.util.List;

public interface UsersRepository extends JpaRepository<User,Long> {
    @Query("select u from User u where u.username like :name")
    List<User> searchUser(@Param("name") String keyword);
}

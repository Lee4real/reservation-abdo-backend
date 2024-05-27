package com.abdo.reservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abdo.reservation.entites.Session;

public interface SessionsRepository extends JpaRepository<Session,Long> {
}

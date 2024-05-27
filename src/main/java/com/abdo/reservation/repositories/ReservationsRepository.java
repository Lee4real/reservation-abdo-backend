package com.abdo.reservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abdo.reservation.entites.Reservation;

public interface ReservationsRepository extends JpaRepository<Reservation,Long> {
}

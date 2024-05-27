package com.abdo.reservation.services;

import com.abdo.reservation.dtos.ReservationDTO;
import com.abdo.reservation.dtos.SessionDTO;
import com.abdo.reservation.dtos.UserDTO;
import com.abdo.reservation.exceptions.ReservationNotFoundException;
import com.abdo.reservation.exceptions.SessionNotFoundException;
import com.abdo.reservation.exceptions.UserNotFoundException;

import java.util.List;

public interface ReservationService {
    // Consultation
    List<UserDTO> listUsers();
    List<ReservationDTO> ReservationList();
    List<SessionDTO> SessionList();

    // Get
    UserDTO getUser(Long userId) throws UserNotFoundException;
    ReservationDTO getReservation(Long reservationId) throws ReservationNotFoundException;
    SessionDTO getSession(Long sessionId) throws SessionNotFoundException;

    // Create
    UserDTO saveUser(UserDTO userDTO);
    ReservationDTO saveReservation(ReservationDTO reservationDTO);
    SessionDTO saveSession(SessionDTO sessionDTO);

    // Update
    UserDTO updateUser(UserDTO userDTO);
    ReservationDTO updateReservation(ReservationDTO reservationDTO);
    SessionDTO updateSession(SessionDTO sessionDTO);


    // Delete
    void deleteUser(Long userId);
    void deleteReservation(Long reservationId);
    void deleteSession(Long sessionId);

    UserDTO getJuryMember(Long sessionId, Long userId);
    //AccountHistoryDTO getAccountHistory(String accountId, int page, int size) throws BankAccountNotFoundException;
}

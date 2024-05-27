package com.abdo.reservation.mappers;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import com.abdo.reservation.dtos.ReservationDTO;
import com.abdo.reservation.dtos.SessionDTO;
import com.abdo.reservation.dtos.UserDTO;
import com.abdo.reservation.entites.Reservation;
import com.abdo.reservation.entites.Session;
import com.abdo.reservation.entites.User;

@Service
public class ReservationsMapperImpl {
    public UserDTO fromUser(User user){
        UserDTO userDTO=new UserDTO();
        BeanUtils.copyProperties(user,userDTO);
        return  userDTO;
    }
    public User fromUserDTO(UserDTO userDTO){
        User user=new User();
        BeanUtils.copyProperties(userDTO,user);
        return  user;
    }

    //Session mappers

    public SessionDTO fromSession(Session session){
        SessionDTO sessionDTO=new SessionDTO();
        BeanUtils.copyProperties(session,sessionDTO);
        return  sessionDTO;
    }
    public Session fromSessionDTO(SessionDTO sessionDTO){
        Session session=new Session();
        BeanUtils.copyProperties(sessionDTO,session);
        return  session;
    }

    //Reservation mappers

    public ReservationDTO fromReservation(Reservation reservation){
        ReservationDTO reservationDTO=new ReservationDTO();
        BeanUtils.copyProperties(reservation,reservationDTO);
        return  reservationDTO;
    }
    public Reservation fromReservationDTO(ReservationDTO reservationDTO){
        Reservation reservation=new Reservation();
        BeanUtils.copyProperties(reservationDTO,reservation);
        return  reservation;
    }
}

package com.abdo.reservation.dtos;

import lombok.Data;
@Data
public class ReservationDTO {
    private Long id;
    private UserDTO user;
    private SessionDTO session;
}

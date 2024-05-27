package com.abdo.reservation.dtos;

import lombok.Data;
import com.abdo.reservation.enums.Role;
import java.util.List;

@Data
public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private Role role;
    private List<SessionDTO> sessionsAsJury;

}

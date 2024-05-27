package com.abdo.reservation.web;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import com.abdo.reservation.dtos.UserDTO;
import com.abdo.reservation.services.ReservationService;

@RestController
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")
public class JuryMemberRestController {
    private ReservationService reservationService;

    @GetMapping("/juryMembers/{id}")
    public UserDTO getJuryMember(@PathVariable(name = "id") Long sessionId,
                                 @RequestParam(name = "userId",defaultValue = "")  Long userId) {
        return reservationService.getJuryMember(sessionId,userId);
    }

    /*@PostMapping("/juryMember")
    public UserDTO saveJuryMember(@RequestBody UserDTO userDTO){
        return reservationService.saveJuryMember(userDTO);
    }

    @PutMapping("/juryMembers/{juryMemberId}")
    public UserDTO updateJuryMember(@PathVariable Long userId, @RequestBody UserDTO userDTO){
        userDTO.setId(userId);
        return reservationService.updateJuryMember(userDTO);
    }

    @DeleteMapping("/juryMembers/{id}")
    public void deleteJuryMember(@PathVariable Long id){
        reservationService.deleteJuryMember(id);
    }*/
}

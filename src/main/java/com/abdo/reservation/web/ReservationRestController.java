package com.abdo.reservation.web;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import com.abdo.reservation.dtos.ReservationDTO;
import com.abdo.reservation.exceptions.ReservationNotFoundException;
import com.abdo.reservation.services.ReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")
public class ReservationRestController {
    private ReservationService reservationService;

    @GetMapping("/reservations")
    public List<ReservationDTO> ReservationList(){
        return reservationService.ReservationList();
    }
    @GetMapping("/reservations/{id}")
    public ReservationDTO getReservation(@PathVariable(name = "id") Long reservationId) throws ReservationNotFoundException {
        return reservationService.getReservation(reservationId);
    }

    @PostMapping("/reservation")
    public ReservationDTO saveReservation(@RequestBody ReservationDTO reservationDTO){
        return reservationService.saveReservation(reservationDTO);
    }

    @PutMapping("/reservations/{reservationId}")
    public ReservationDTO updateReservation(@PathVariable Long reservationId, @RequestBody ReservationDTO reservationDTO){
        reservationDTO.setId(reservationId);
        return reservationService.updateReservation(reservationDTO);
    }

    @DeleteMapping("/reservations/{id}")
    public void deleteReservation(@PathVariable Long id){
        reservationService.deleteReservation(id);
    }
}

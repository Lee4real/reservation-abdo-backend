package com.abdo.reservation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.abdo.reservation.dtos.UserDTO;
import com.abdo.reservation.enums.Role;
import com.abdo.reservation.services.ReservationService;

import java.util.stream.Stream;

@SpringBootApplication
public class ReservationBackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReservationBackEndApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ReservationService reservationService){
        return args -> {
            Stream.of("abdo","mohammed","khalid").forEach(name->{
                UserDTO user=new UserDTO();
                user.setUsername(name);
                user.setPassword("2323");
                user.setRole(Role.ADMIN);
                reservationService.saveUser(user);
            });
        };
    }

}

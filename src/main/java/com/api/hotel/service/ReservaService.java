package com.api.hotel.service;

import com.api.hotel.model.Huesped;
import com.api.hotel.model.Reserva;
import com.api.hotel.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    //mostrar Reserva
    public List<Reserva> getAllReservas(){
        return reservaRepository.findAll();
    }

    //crear Reserva
    public Reserva createReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    //Editar Reserva
    public Reserva updateReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    //Eliminar
    public void deleteReservaById(Long id){
        reservaRepository.deleteById(id);
    }
}

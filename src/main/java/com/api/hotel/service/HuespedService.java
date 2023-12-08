package com.api.hotel.service;

import com.api.hotel.model.Huesped;
import com.api.hotel.repository.HuespedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuespedService {

    @Autowired
    private HuespedRepository huespedRepository;

    //mostrar huesped
    public List<Huesped> getAllHuespedes(){
        return huespedRepository.findAll();
    }

    //crear huesped
    public Huesped createHuesped(Huesped huesped){
        return huespedRepository.save(huesped);
    }

    //Editar huesped
    public Huesped updateHuesped(Huesped huesped){
        return huespedRepository.save(huesped);
    }

    //Eliminar
    public void deleteHuespedById(Long id){
        huespedRepository.deleteById(id);
    }
}

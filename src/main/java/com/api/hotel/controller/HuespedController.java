package com.api.hotel.controller;


import com.api.hotel.model.Huesped;
import com.api.hotel.service.HuespedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/huespedes")
public class HuespedController {

    @Autowired
    private HuespedService huespedService;

    //Get
    @GetMapping
    public List<Huesped> listartodo(){
        return huespedService.getAllHuespedes();
    }

    //POST
    @PostMapping
    public Huesped crear(@RequestBody Huesped huesped){
        return huespedService.createHuesped(huesped);
    }

    //PUT
    @PostMapping("editar/{id}")
    public Huesped actualizar(@RequestBody Huesped huesped, @PathVariable Long id){
        huesped.setIdHuesped(id);
        return huespedService.updateHuesped(huesped);
    }

    //DELETE
    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable Long id){
        huespedService.deleteHuespedById(id);
    }
}

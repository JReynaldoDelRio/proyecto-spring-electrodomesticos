package com.inti.electrodomesticos.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.electrodomesticos.entities.Marca;
import com.inti.electrodomesticos.repository.MarcaRepository;
import com.inti.electrodomesticos.service.MarcaService;

@Service
public class MarcaServiceImpl implements MarcaService {

    @Autowired
    private MarcaRepository marcaRepo;

    @Override
    public List<Marca> listarMarcas() {
        // TODO Auto-generated method stub
        return marcaRepo.findAll();
    }

    @Override
    public Marca registrarMarca(Marca objMarca) {
        // TODO Auto-generated method stub
        return marcaRepo.save(objMarca);
    }

    @Override
    public Marca actualizarMarca(Marca objMarca) {
        // TODO Auto-generated method stub
        Marca marca = marcaRepo.findById(objMarca.getMarcaid()).orElse(null);

        marca.setNombremarca(objMarca.getNombremarca());
        marca.setPais(objMarca.getPais());

        return marcaRepo.save(objMarca);

    }

    @Override
    public void eliminarMarca(int objMarca) {
        // TODO Auto-generated method stub
        marcaRepo.deleteById(objMarca);
    }

}

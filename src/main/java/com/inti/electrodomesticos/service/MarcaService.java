package com.inti.electrodomesticos.service;

import java.util.List;

import com.inti.electrodomesticos.entities.Marca;

public interface MarcaService {

    public List<Marca> listarMarcas();

    public Marca registrarMarca(Marca objMarca);

    public Marca actualizarMarca(Marca objMarca);

    public void eliminarMarca(int objMarca);
}

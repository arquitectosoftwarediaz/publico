package com.example.hexagonal.dominio.puerto_persistencia.area;


import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.example.hexagonal.dominio.modelo.Area;


@Repository
public interface AreaPersistence {
	
    Stream<Area> BuscarTodas();

}

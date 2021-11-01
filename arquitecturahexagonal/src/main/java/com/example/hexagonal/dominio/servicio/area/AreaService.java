package com.example.hexagonal.dominio.servicio.area;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hexagonal.dominio.modelo.Area;
import com.example.hexagonal.dominio.puerto_persistencia.area.AreaPersistence;



@Service
public class AreaService {
	
	@Autowired
	private AreaPersistence areaPersistence;


	public Stream<Area> obtenerAreas() {

		return areaPersistence.BuscarTodas();
	}

}

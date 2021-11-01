package com.example.hexagonal.adaptadores.secundarios.oraclebd.persistencia;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.hexagonal.adaptadores.secundarios.oraclebd.dao.AreaRepository;
import com.example.hexagonal.dominio.modelo.Area;
import com.example.hexagonal.dominio.puerto_persistencia.area.AreaPersistence;

@Repository("areaPersistence")
public class AreaPersistenceOracle implements AreaPersistence{

	@Autowired
	private AreaRepository areaRepository;
	  

	
	@Override
	public Stream<Area> BuscarTodas() {

		return this.areaRepository.BuscarTodas().stream()
				.map(areaEntity -> areaEntity.toArea());
	}

}

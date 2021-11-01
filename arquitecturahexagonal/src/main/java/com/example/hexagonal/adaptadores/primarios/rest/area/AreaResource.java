package com.example.hexagonal.adaptadores.primarios.rest.area;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hexagonal.adaptadores.primarios.dto.AreaDto;
import com.example.hexagonal.dominio.servicio.area.AreaService;

@RestController
public class AreaResource {

	@Autowired
	private AreaService areaService;

	@GetMapping("/obtenerAreas")
	public Stream<AreaDto> obtenerAreas() {

		return areaService.obtenerAreas().map(AreaDto::new);

	}

}

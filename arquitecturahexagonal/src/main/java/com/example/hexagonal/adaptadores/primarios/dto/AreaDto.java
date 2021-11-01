package com.example.hexagonal.adaptadores.primarios.dto;

import com.example.hexagonal.dominio.modelo.Area;

public class AreaDto {

	private Long idArea;
	private String nombre;

	
	public AreaDto() {
	 // para el framework
	}
	
	public AreaDto(Area area) {
		this.idArea = area.getIdArea();
		this.nombre = area.getNombre();
	}

	public Long getIdArea() {
		return idArea;
	}

	public void setIdArea(Long idArea) {
		this.idArea = idArea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}


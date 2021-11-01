package com.example.hexagonal.adaptadores.secundarios.oraclebd.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.BeanUtils;

import com.example.hexagonal.dominio.modelo.Area;

/**
 *
 * @author Johan Diaz
 */
@Entity
@Table(name = "AF_AREA")
public class AreaEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID_AREA")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_AREA")
    @SequenceGenerator(name="SEQ_AREA", sequenceName="SEQ_AREA", allocationSize=1)
    private Long idArea;
    @Column(name = "NOMBRE")
    private String nombre;
    @JoinColumn(name = "ID_CIUDAD", referencedColumnName = "ID_CIUDAD")
    @ManyToOne
    private CiudadEntity idCiudad;
 

    public AreaEntity() {
    }

    public AreaEntity(Long idArea) {
        this.idArea = idArea;
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

    public CiudadEntity getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(CiudadEntity idCiudad) {
        this.idCiudad = idCiudad;
    }
    
    public Area toArea() {
        Area area = new Area();
        BeanUtils.copyProperties(this, area);
        return area;
    }


    
}


package com.example.hexagonal.adaptadores.secundarios.oraclebd.entity;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Johan Diaz
 */
@Entity
@Table(name = "AF_CIUDAD")
public class CiudadEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "ID_CIUDAD")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_CIUDAD")
    @SequenceGenerator(name="SEQ_CIUDAD", sequenceName="SEQ_CIUDAD", allocationSize=1)
    private Long idCiudad;
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(mappedBy = "idCiudad")
    private List<AreaEntity> afAreaList;

    public CiudadEntity() {
    }

    public CiudadEntity(Long idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Long getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Long idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<AreaEntity> getAfAreaList() {
        return afAreaList;
    }

    public void setAfAreaList(List<AreaEntity> afAreaList) {
        this.afAreaList = afAreaList;
    }
    
}

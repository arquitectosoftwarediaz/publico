package com.example.hexagonal.adaptadores.secundarios.oraclebd.dao;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

import com.example.hexagonal.adaptadores.secundarios.oraclebd.entity.AreaEntity;




public interface AreaRepository extends CrudRepository<AreaEntity,Long> {
	
	@Query(value="SELECT * FROM AF_AREA ", nativeQuery=true)
	List<AreaEntity> BuscarTodas();

}

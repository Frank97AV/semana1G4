package com.codigo.miprimeraapig4.repository;

import com.codigo.miprimeraapig4.entity.UsuariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UsuariosRepository extends JpaRepository<UsuariosEntity, Long> {


   List<UsuariosEntity> findByNombres(String nombres);

}

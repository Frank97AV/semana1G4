package com.codigo.miprimeraapig4.service;

import com.codigo.miprimeraapig4.entity.UsuariosEntity;

import java.util.List;

public interface UsuariosService {
    //Contrato
    UsuariosEntity crearUsuario(UsuariosEntity usuariosEntity);

    List<UsuariosEntity> getAllUsuarios();

    UsuariosEntity buscarPorId(Integer id);
}

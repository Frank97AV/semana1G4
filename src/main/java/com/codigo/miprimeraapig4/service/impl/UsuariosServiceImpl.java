package com.codigo.miprimeraapig4.service.impl;

import com.codigo.miprimeraapig4.entity.UsuariosEntity;
import com.codigo.miprimeraapig4.repository.UsuariosRepository;
import com.codigo.miprimeraapig4.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//notacion que convierte  beans
@Service
public class UsuariosServiceImpl implements UsuariosService {


    //inyectando a su repository_todo lo que quiera inyectar tiene que ser un bin

    private UsuariosRepository usuariosRepository;
    //@Autowired: para poner el contructor: en este caso esta aqui abajo en codigo por lo que no es necesario
    public UsuariosServiceImpl(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }

    //reponde el mismo objeto que se espera, excepto que ahi le dice lo que hara
    @Override
    public UsuariosEntity crearUsuario(UsuariosEntity usuariosEntity) {
        return usuariosRepository.save(usuariosEntity);
    }

    @Override
    public List<UsuariosEntity> getAllUsuarios() {
        return null;
    }

    @Override
    public UsuariosEntity buscarPorId(Integer id) {
        //finbiid este metodo ya existe en JPA
        return usuariosRepository.findById(Long.valueOf(id)).get();
    }
}

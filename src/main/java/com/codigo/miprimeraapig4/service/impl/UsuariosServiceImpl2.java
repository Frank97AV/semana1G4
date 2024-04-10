package com.codigo.miprimeraapig4.service.impl;

import com.codigo.miprimeraapig4.entity.UsuariosEntity;
import com.codigo.miprimeraapig4.repository.UsuariosRepository;
import com.codigo.miprimeraapig4.service.UsuariosService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class UsuariosServiceImpl2 implements UsuariosService {

    private final UsuariosRepository usuariosRepository;

    @Override
    public UsuariosEntity crearUsuario(UsuariosEntity usuariosEntity) {
        return null;
    }

    @Override
    public List<UsuariosEntity> getAllUsuarios() {
        return usuariosRepository.findAll();
    }

    @Override
    public UsuariosEntity buscarPorId(Integer id) {
        return null;
    }
}

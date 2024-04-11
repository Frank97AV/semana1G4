package com.codigo.miprimeraapig4.service.impl;

import com.codigo.miprimeraapig4.entity.UsuariosEntity;
import com.codigo.miprimeraapig4.repository.UsuariosRepository;
import com.codigo.miprimeraapig4.service.UsuariosService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<UsuariosEntity> buscarPorNombre(String nombres) {
        return usuariosRepository.findByNombres(nombres);
    }

    @Override
    public UsuariosEntity updateUsuario(Long id, UsuariosEntity request) {
        //Primero valido que exista el usuario
        boolean existe = usuariosRepository.existsById(id);
        if(existe){
            //recupero mi usuario
            Optional<UsuariosEntity> usuario = usuariosRepository.findById(id);

            // setear datos a actualizar spcrearusuario(?,?,?,?,?)
            //
            //actualizar
            UsuariosEntity usuariosEntity = usuariosRepository.save(getUpdate(usuario.get(),request));

            return usuariosEntity;
        }
        return null;
    }
    //seteo los datos a cambiar
    private UsuariosEntity getUpdate(UsuariosEntity usuarioRecuperado, UsuariosEntity usuarioDesdeController){
        usuarioRecuperado.setNombres(usuarioDesdeController.getNombres());
        usuarioRecuperado.setApellidos(usuarioDesdeController.getApellidos());
        usuarioRecuperado.setEstado(usuarioDesdeController.getEstado());
        return usuarioRecuperado;
    }

    @Override
    public UsuariosEntity deleteUusuario(Long id) {
        Optional<UsuariosEntity> usuario = usuariosRepository.findById(id);
        if(usuario.isPresent()){
            usuario.get().setEstado(0);
            return usuariosRepository.save(usuario.get());
        }

        return null;
    }
    /*
    //seteo los datos a cambiar
    private UsuariosEntity getUpdate(UsuariosEntity update, UsuariosEntity request){
        update.setNombres(request.getNombres());
        update.setApellidos(request.getApellidos());
        update.setEstado(request.getEstado());
        return update;
    }

    @Override
    public UsuariosEntity deleteUusuario(Long id) {
        Optional<UsuariosEntity> usuario = usuariosRepository.findById(id);
        if(usuario.isPresent()){
            usuario.get().setEstado(0);
            return usuariosRepository.save(usuario.get());
        }
        return null;
    }

     */

}

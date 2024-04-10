package com.codigo.miprimeraapig4.controller;

import com.codigo.miprimeraapig4.entity.UsuariosEntity;
import com.codigo.miprimeraapig4.service.UsuariosService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/g4")
//@AllArgsConstructor
public class UsuariosController {

    //INYECCION: PONE A DISPOSICION AL SERIVICIO NO CREA INSTANCIA
    //private final UsuariosService usuariosService;
    //cuando existe 2 implementaciuones
    @Qualifier("usuariosServiceImpl")
    @Autowired
    private UsuariosService usuariosService;
    //hasta aqui se define la implementacion que se quiera usar

    @Qualifier("usuariosServiceImpl2")
    @Autowired
    private UsuariosService usuariosService2;

    /*api/v1/g4/crearusuario*/
    //Metodo de tipo post
    //esto es un endpoint ( la funcionalidad)
    @PostMapping("/crearusuario")
    public ResponseEntity<UsuariosEntity> crear(@RequestBody UsuariosEntity entity){
        UsuariosEntity usuariosEntity = usuariosService.crearUsuario(entity);
        return ResponseEntity.ok(usuariosEntity);
    }

    //Metodo de tipo post
    @GetMapping("/todos")
    public ResponseEntity<List<UsuariosEntity>> getAll(){
        List<UsuariosEntity> usuariosEntity = usuariosService2.getAllUsuarios();
        return ResponseEntity.ok(usuariosEntity);
    }

    //GET : DEVUELVE UNA INFORMACION
    @GetMapping("/buscarxid/{id}")
    public ResponseEntity<UsuariosEntity>  buscarxid(@PathVariable Integer id){
        UsuariosEntity usuario = usuariosService.buscarPorId(id);
        return ResponseEntity.ok(usuario);
    }

}

package com.codigo.miprimeraapig4.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name= "usuarios")
// Para definir  getter and setter como @data o @getter @setter
@Data
public class UsuariosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Nombre es requerido")

    //si el nombre del atributo en java esta con otro nombre en la base de datos
    //se utiliza el @Column(name="nombres_emp", nullable=false, length=100)
    // para hacer referencia al de la base de datos, que no sea null, y el tamanio de 100
    private String nombres;

    private String apellidos;
    private Integer estado;


}


package co.edu.uniquindio.model.entities;

import co.edu.uniquindio.model.enums.Estado;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProyecto;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private LocalDate fechaInicio;

    @Column(nullable = false)
    private LocalDate fechaFin;

    @Column(nullable = false)
    private Estado estadoProyecto;

    @OneToOne(mappedBy = "proyecto")
    private Solicitud idSolicitud;

    @OneToMany(mappedBy = "proyecto")
    private List<Documento> listaDocumentos;


}
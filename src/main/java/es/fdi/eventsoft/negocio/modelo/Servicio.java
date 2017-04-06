package es.fdi.eventsoft.negocio.modelo;

import es.fdi.eventsoft.negocio.modelo.enumerados.TiposServicio;

import java.util.Date;

public class Servicio {
    private Long id;
    private TiposServicio tipo;
    private String nombre;
    private String descripcion;
    private Date fechaRegistro;
}

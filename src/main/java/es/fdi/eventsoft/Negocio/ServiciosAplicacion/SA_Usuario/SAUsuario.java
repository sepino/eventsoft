package es.fdi.eventsoft.Negocio.ServiciosAplicacion.SA_Usuario;

import es.fdi.eventsoft.Negocio.Entidades.Usuario.Usuario;
import es.fdi.eventsoft.Negocio.__excepcionNegocio.ExcepcionNegocio;

/**
 * Created by Rodrigo de Miguel on 06/05/2017.
 */
public interface SAUsuario {

    public int crearUsuario(Usuario usuarioNuevo) throws ExcepcionNegocio;
}

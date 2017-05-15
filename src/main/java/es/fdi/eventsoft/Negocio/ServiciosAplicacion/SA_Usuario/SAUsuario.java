package es.fdi.eventsoft.Negocio.ServiciosAplicacion.SA_Usuario;

import es.fdi.eventsoft.Negocio.Comandos.EventosNegocio;
import es.fdi.eventsoft.Negocio.Entidades.Usuario.Usuario;
import es.fdi.eventsoft.Negocio.__excepcionNegocio.ExcepcionNegocio;

/**
 * Created by Rodrigo de Miguel on 06/05/2017.
 */
public interface SAUsuario {

    EventosNegocio crearUsuario(Usuario usuarioNuevo);

    Usuario buscarUsuarioByID(Long id);

    Usuario buscarUsuarioByEmail(String email);

    public void eliminarUsuario(Usuario usuarioNuevo) throws ExcepcionNegocio;

    public void modificarUsuario(Usuario usuarioNuevo) throws ExcepcionNegocio;


}

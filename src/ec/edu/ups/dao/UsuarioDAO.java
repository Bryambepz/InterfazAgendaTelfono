/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.dao.IDAOUsuario;
import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author braya
 */
public class UsuarioDAO implements IDAOUsuario{
    private List<Usuario> listaUsuarios;
    private Usuario usuario;

    public UsuarioDAO() {
        listaUsuarios = new ArrayList<>();
    }
    
    
    @Override
    public void crearUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }
    
    @Override
    public Usuario leerUsuarios(String cedula) {
        for (Usuario usuario : listaUsuarios) {
            if(usuario.getCedula().equals(cedula)){
                return usuario;
            }
        }
        return null;
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario us = listaUsuarios.get(i);
            if (us.getApellido() == usuario.getCedula()) {
                listaUsuarios.set(i, usuario);
                break;
            }
        }
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario us = listaUsuarios.get(i);
            if (us.getApellido() == usuario.getCedula()) {
                listaUsuarios.remove(listaUsuarios.get(i));
                break;
            }
        }
    }

    @Override
    public List<Usuario> findAll() {
        return listaUsuarios;
    }
    
    public Usuario comprobarUsuario(String correo, String contraseña){
        for (Usuario usuario : listaUsuarios) {
            if(usuario.getCorreo().equals(correo) && usuario.getContraseña().equals(contraseña)){
                return usuario;
            }
        }
        return null;
    }
}

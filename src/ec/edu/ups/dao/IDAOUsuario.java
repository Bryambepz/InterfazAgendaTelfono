/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Usuario;
import java.util.List;

/**
 *
 * @author braya
 */
public interface IDAOUsuario {
    public void crearUsuario(Usuario usuario);
    public Usuario leerUsuarios(String cedula);
    public void actualizarUsuario(Usuario usuario);
    public void eliminarUsuario(Usuario usuario);
    public List<Usuario> findAll();
    
}

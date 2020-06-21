/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.IDAOTelefono;
import ec.edu.ups.dao.IDAOUsuario;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;

/**
 *
 * @author braya
 */
public class ControladorUsuario {
    //modelo
    private Usuario usuario;
    private Telefono telefono;
    //DAO
    private IDAOUsuario daoUs;
    private IDAOTelefono daotelf;

    public ControladorUsuario(IDAOUsuario daoUs, IDAOTelefono daotelf) {
        this.daoUs = daoUs;
        this.daotelf = daotelf;
    }
    
    public void registrarUsuario(Usuario usuario){
        this.usuario = usuario;
        daoUs.crearUsuario(usuario);
    }
    
    public void verUsuario(){
        
    }
    
    public void actualizarUsuario(){
        
    }
    
    public void eliminarUsuario(){
        
    }
    
    //Agregacion
    public void agregarTelefono(int codigo){
        telefono = daotelf.leerTelefono(codigo);
        usuario.agregarTelefono(telefono);
        daoUs.actualizarUsuario(usuario);
    }
    
}

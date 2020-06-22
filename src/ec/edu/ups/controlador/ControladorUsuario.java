/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.IDAOTelefono;
import ec.edu.ups.dao.IDAOUsuario;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;
import java.util.List;

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
    
    public void registrarUsuario(String cedula, String nombre, String apellido, String correo, String contraseña){
        //this.usuario = usuario;
        usuario = new Usuario(cedula, nombre, apellido, correo, contraseña);
        daoUs.crearUsuario(usuario);
    }
    
    public void verUsuario(){
        
    }
    
    public void actualizarUsuario(){
        
    }
    
    public void eliminarUsuario(){
        
    }
    
    //Agregacion
    public void agregarTelefono(int codigo, String numero, String tipo, String operadora){
        telefono = new Telefono(codigo, numero, tipo, operadora);   
        daotelf.crearTelefono(telefono);
        usuario.agregarTelefono(telefono);
        daoUs.actualizarUsuario(usuario);
    }
    
    public List<Telefono> listarTelefono(){
        return usuario.getListaTelefonos();
    }
    
    public boolean comprobar(String contraseña, String correo){
        if(usuario != null){
            return true;
        }else{
            return false;
        }
    }
}

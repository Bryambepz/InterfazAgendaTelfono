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
    
    private int contadorTelf;

    public ControladorUsuario(IDAOUsuario daoUs, IDAOTelefono daotelf) {
        this.daoUs = daoUs;
        this.daotelf = daotelf;
        
        contadorTelf = 0;
    }
    
    public void registrarUsuario(String cedula, String nombre, String apellido, String correo, String contraseña){
        //this.usuario = usuario;
        usuario = new Usuario(cedula, nombre, apellido, correo, contraseña);
        daoUs.crearUsuario(usuario);
    }
    
    public Usuario verUsuario(){
        return usuario;
    }
    
    public void actualizarUsuario(){
        
    }
    
    public void eliminarUsuario(){
        
    }
    
    //Agregacion
    public void agregarTelefono(String numero, String tipo, String operadora){
        telefono = new Telefono(numero, tipo, operadora);   
        daotelf.crearTelefono(telefono);
        usuario.agregarTelefono(telefono);
        daoUs.actualizarUsuario(usuario);
    }
    
    public void actualizarTelefono(String numero, String tipo, String operadora, int codigo){
        telefono = new Telefono(codigo, numero, tipo, operadora);
        daotelf.actualizarTelefono(telefono);
        usuario.actualizarTelefono(telefono);
        daoUs.actualizarUsuario(usuario);
    }
    
    public void eliminarTelefono(int codigo){
        telefono = daotelf.leerTelefono(codigo);
        if(telefono != null){
            daotelf.eliminarTelefono(telefono);
            usuario.eliminarTelefono(telefono);
            daoUs.actualizarUsuario(usuario);
            //telef
        }
    }
    
    public List<Telefono> listarTelefono(){
        return usuario.getListaTelefonos();
    }
    
    public int codigoTelefono(){
        int cont = daotelf.codigoTelefono();
        return cont++;
    }
    
    public boolean comprobar(String contraseña, String correo){
        if(usuario != null){
            return true;
        }else{
            return false;
        }
    }
}

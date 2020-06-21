/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.IDAOTelefono;
import ec.edu.ups.modelo.Telefono;

/**
 *
 * @author braya
 */
public class ControladorTelefono {
    //modelo
    //private Usuario usuario;
    private Telefono telefono;
    //DAO
    //private IDAOUsuario daoUs;
    private IDAOTelefono daotelf;

    public ControladorTelefono(IDAOTelefono daotelf) {
        this.daotelf = daotelf;
    }
    
    public void registrarUsuario(Telefono telefono){
        this.telefono = telefono;
        daotelf.crearTelefono(telefono);
    }
    
    public void verTelefono(){
        
    }
    
    public void actualizarTelefono(){
        
    }
    
    public void eliminarTelefono(){
        
    }
    
}

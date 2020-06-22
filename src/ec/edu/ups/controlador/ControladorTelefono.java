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
    private Telefono telefono;
    //DAO
    private IDAOTelefono daotelf;
    
    public ControladorTelefono(IDAOTelefono daotelf) {
        this.daotelf = daotelf;
    }
    
//    public void registrarTelefono(String numero, String tipo, String operadora){
//        //this.telefono = telefono;
//        telefono = new Telefono(numero, tipo, operadora);
//        daotelf.crearTelefono(telefono);
//        //codigo++;
//    }
    
    public void crearTelefono(Telefono telefono){
        daotelf.crearTelefono(telefono);
    }
    
    public Telefono buscarTelefono(int codigo){
        telefono = daotelf.leerTelefono(codigo);
        return telefono;
    }
    
}

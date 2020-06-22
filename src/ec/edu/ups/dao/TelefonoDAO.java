/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.dao.IDAOTelefono;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author braya
 */
public class TelefonoDAO implements IDAOTelefono{
    private List<Telefono> listaTelefonos;
    private int codigo;
    
    public TelefonoDAO() {
        listaTelefonos = new ArrayList<>();
        codigo = 0;
    }
    
    @Override
    public void crearTelefono(Telefono telefono) {
        telefono.setCodigo(codigo++);
        listaTelefonos.add(telefono);
    }

    @Override
    public Telefono leerTelefono(int codigo) {
        for (Telefono telefono : listaTelefonos) {
            if(telefono.getCodigo() == codigo){
                return telefono;
            }
        }
        return null;
    }

    @Override
    public void actualizarTelefono(Telefono telefono) {
        for (int i = 0; i < listaTelefonos.size(); i++) {
            Telefono telf = listaTelefonos.get(i);
            if(telf.getCodigo() == telefono.getCodigo()){
                listaTelefonos.set(i, telefono);
                break;
            }
        }
    }

    @Override
    public void eliminarTelefono(Telefono telefono) {
        for (int i = 0; i < listaTelefonos.size(); i++) {
            Telefono telf = listaTelefonos.get(i);
            if(telf.getCodigo() == telefono.getCodigo()){
                listaTelefonos.remove(listaTelefonos.get(i));
                break;
            }
        }
    }

    @Override
    public List<Telefono> findAll() {
        return listaTelefonos;
    }

    @Override
    public int codigoTelefono(){
        return codigo;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;
import java.util.List;

/**
 *
 * @author braya
 */
public interface IDAOTelefono {
    public void crearTelefono(Telefono telefono);
    public Telefono leerTelefono(int codigo);
    public void actualizarTelefono(Telefono telefono);
    public void eliminarTelefono(Telefono telefono);
    public int codigoTelefono();
    public List<Telefono> findAll();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica_negocio;

import datos.BD_Articulo;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Equipo
 */
public class BL_Articulo {

    BD_Articulo bd = new BD_Articulo();
    public HashMap<String, HashSet<String>> dataCategorias;
    public HashMap<String, HashSet<String>> dataSubCategorias;
    /**
     * Metodo para el llenado del ComboBox Categoria
     * @param conexion
     * @return
     * @throws SQLException 
     */
    public DefaultComboBoxModel modelCategoria(Connection conexion) throws SQLException {
        DefaultComboBoxModel listaCategorias;
        System.out.println("Entra BL_Articulo");
        try {
            Object[] data = bd.listarCategorias(conexion);
            DefaultComboBoxModel model = (DefaultComboBoxModel) data[0];
            this.dataCategorias = (HashMap<String, HashSet<String>>) data[1];
            listaCategorias = model;
        } catch (SQLException ex) {
            listaCategorias = new DefaultComboBoxModel();
            throw new SQLException(ex.getMessage());
        }
        return listaCategorias;
    }
    /**
     * Metodo para el llenado del ComboBox SubCategoria
     * @param conexion
     * @param id
     * @return
     * @throws SQLException 
     */
    public DefaultComboBoxModel listarSubCategoria(Connection conexion, String id) throws SQLException {
        DefaultComboBoxModel listaSubCat;  
        System.out.println("Entra a subcategoria");
        System.out.println("Lectura del ID: ["+id+"] SubCategoria");
        Object idCat = id;
        try {
            Object[] data = bd.listarSubCategorias(conexion, idCat);
            DefaultComboBoxModel model = (DefaultComboBoxModel) data [0];
            this.dataSubCategorias = (HashMap<String, HashSet<String>>) data[1];
            listaSubCat = model;
        } catch (SQLException e) {
            listaSubCat = new DefaultComboBoxModel();
            throw new SQLException(e.getMessage());
        }
        return listaSubCat;
    }
    public void llenarJTable(Connection conexion){
        
    }
}

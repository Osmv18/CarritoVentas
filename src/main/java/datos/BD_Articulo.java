/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Articulo;
import entidades.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Equipo
 */
public class BD_Articulo {

    HashMap<String, HashSet<String>> hashCategorias = new HashMap<>();
    /**
     * Metodo para Llenar ComboBox de Categorias
     * @Connection conexion
     * @return
     * @throws SQLException 
     */
    public Object[] listarCategorias(Connection conexion) throws SQLException {
        DefaultComboBoxModel listaCategorias = new DefaultComboBoxModel();
        try {
            PreparedStatement query;
            query = conexion.prepareStatement("SELECT idCategoria,nombreCategoria  FROM categoriaarticulo");
            ResultSet datos = query.executeQuery();
            while (datos.next()) {
                String categoria = datos.getString("nombreCategoria");
                String id = datos.getString("idCategoria");
                listaCategorias.addElement(categoria);
                if (!hashCategorias.containsKey(id)) {
                    HashSet<String> cacheCategorias = new HashSet<>();
                    cacheCategorias.add(categoria);
                    hashCategorias.put(id, cacheCategorias);
                } else {
                    hashCategorias.get(id).add(categoria);
                }
            }
            datos.close();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }

        return new Object[]{listaCategorias, hashCategorias};
    }
    /**
     * Incluye Conexion y listar SubCategoria
     * @Connection conexion
     * @Object id
     * @return
     * @throws SQLException 
     */
    public Object[] listarSubCategorias(Connection conexion, Object id) throws SQLException {
        DefaultComboBoxModel listaSubCat = new DefaultComboBoxModel();
        HashMap<String, HashSet<String>> hashSubCategorias = new HashMap<>();
        try {
            PreparedStatement query;
            query = conexion.prepareStatement("SELECT idSubcategoria, nombreSubcategoria FROM subcategoriaarticulo\n"
                    + "WHERE idCategoria = " + id);
            ResultSet datos = query.executeQuery();
            while (datos.next()) {
                String subCateg = datos.getString("nombreSubcategoria");
                String idSubcat = datos.getString("idSubcategoria");
                listaSubCat.addElement(subCateg);
                if(!hashSubCategorias.containsKey(idSubcat)){
                    HashSet<String> cacheSubCategorias = new HashSet<>();
                    cacheSubCategorias.add(subCateg);
                    hashSubCategorias.put(idSubcat, cacheSubCategorias);
                }else{
                    hashSubCategorias.get(idSubcat).add(subCateg);
                }
            }
            datos.close();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
        return new Object[]{listaSubCat,hashSubCategorias};
    }
    
}

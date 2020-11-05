/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Equipo
 */
public class Categoria {

  private String idCategoria;
  private String nombreCateg;

  public Categoria(String idCategoria, String nombreCateg) {
    this.idCategoria = idCategoria;
    this.nombreCateg = nombreCateg;
  }

  public String getIdCategoria() {
    return idCategoria;
  }

  public void setIdCategoria(String idCategoria) {
    this.idCategoria = idCategoria;
  }

  public String getNombreCateg() {
    return nombreCateg;
  }

  public void setNombreCateg(String nombreCateg) {
    this.nombreCateg = nombreCateg;
  }

}

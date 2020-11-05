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
public class Subcategoria {

  private int idSubcategoria;
  private int idCategoria;
  private String nombreSubcategoria;

  public Subcategoria(int idSubcategoria, int idCategoria, String nombreSubcategoria) {
    this.idSubcategoria = idSubcategoria;
    this.idCategoria = idCategoria;
    this.nombreSubcategoria = nombreSubcategoria;
  }

  public int getIdSubcategoria() {
    return idSubcategoria;
  }

  public void setIdSubcategoria(int idSubcategoria) {
    this.idSubcategoria = idSubcategoria;
  }

  public int getIdCategoria() {
    return idCategoria;
  }

  public void setIdCategoria(int idCategoria) {
    this.idCategoria = idCategoria;
  }

  public String getNombreSubcategoria() {
    return nombreSubcategoria;
  }

  public void setNombreSubcategoria(String nombreSubcategoria) {
    this.nombreSubcategoria = nombreSubcategoria;
  }

}

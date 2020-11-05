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
public class Distrito {

  private int idDistrito;
  private String nomDistrito;
  private int idCanton;

  public Distrito(int idDistrito, String nomDistrito, int idCanton) {
    this.idDistrito = idDistrito;
    this.nomDistrito = nomDistrito;
    this.idCanton = idCanton;
  }

  public int getIdDistrito() {
    return idDistrito;
  }

  public void setIdDistrito(int idDistrito) {
    this.idDistrito = idDistrito;
  }

  public String getNomDistrito() {
    return nomDistrito;
  }

  public void setNomDistrito(String nomDistrito) {
    this.nomDistrito = nomDistrito;
  }

  public int getIdCanton() {
    return idCanton;
  }

  public void setIdCanton(int idCanton) {
    this.idCanton = idCanton;
  }

}

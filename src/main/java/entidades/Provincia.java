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
public class Provincia {

  private int idProvincia;
  private String nomProvincia;

  public Provincia(int idProvincia, String nomProvincia) {
    this.idProvincia = idProvincia;
    this.nomProvincia = nomProvincia;
  }

  public int getIdProvincia() {
    return idProvincia;
  }

  public void setIdProvincia(int idProvincia) {
    this.idProvincia = idProvincia;
  }

  public String getNomProvincia() {
    return nomProvincia;
  }

  public void setNomProvincia(String nomProvincia) {
    this.nomProvincia = nomProvincia;
  }

}

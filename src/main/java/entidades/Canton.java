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
public class Canton {
    private int idCanton;
    private String nomCanton;
    private int idProvincia;

  public Canton(int idCanton, String nomCanton, int idProvincia) {
    this.idCanton = idCanton;
    this.nomCanton = nomCanton;
    this.idProvincia = idProvincia;
  }

  public int getIdCanton() {
    return idCanton;
  }

  public void setIdCanton(int idCanton) {
    this.idCanton = idCanton;
  }

  public String getNomCanton() {
    return nomCanton;
  }

  public void setNomCanton(String nomCanton) {
    this.nomCanton = nomCanton;
  }

  public int getIdProvincia() {
    return idProvincia;
  }

  public void setIdProvincia(int idProvincia) {
    this.idProvincia = idProvincia;
  }
  
}

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
public class Articulo {

  //Atributos
  private int id;
  private String nomArticulo;
  private int idSubcat;
  private int precio;
  private int cantExist;
  private int cantMinPedido;
  private String fecha;
  private int estado;

  //Constructor por defecto
  public Articulo() {
  }

  public Articulo(int id, String nomArticulo, int idSubcat, int precio, int cantExist, int cantMinPedido, String fecha, int estado) {
    this.id = id;
    this.nomArticulo = nomArticulo;
    this.idSubcat = idSubcat;
    this.precio = precio;
    this.cantExist = cantExist;
    this.cantMinPedido = cantMinPedido;
    this.fecha = fecha;
    this.estado = estado;
  }

  //Metodos encapsulados
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNomArticulo() {
    return nomArticulo;
  }

  public void setNomArticulo(String nomArticulo) {
    this.nomArticulo = nomArticulo;
  }

  public int getIdSubcat() {
    return idSubcat;
  }

  public void setIdSubcat(int idSubcat) {
    this.idSubcat = idSubcat;
  }

  public int getPrecio() {
    return precio;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  public int getCantExist() {
    return cantExist;
  }

  public void setCantExist(int cantExist) {
    this.cantExist = cantExist;
  }

  public int getCantMinPedido() {
    return cantMinPedido;
  }

  public void setCantMinPedido(int cantMinPedido) {
    this.cantMinPedido = cantMinPedido;
  }

  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public int getEstado() {
    return estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }

}

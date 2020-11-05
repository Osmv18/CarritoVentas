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
public class Carrito {

  private int numOrdenCompra;
  private int idCarrito;
  private int idArticulo;
  private int cantUnidades;

  public Carrito(int numOrdenCompra, int idCarrito, int idArticulo, int cantUnidades) {
    this.numOrdenCompra = numOrdenCompra;
    this.idCarrito = idCarrito;
    this.idArticulo = idArticulo;
    this.cantUnidades = cantUnidades;
  }

  public int getNumOrdenCompra() {
    return numOrdenCompra;
  }

  public void setNumOrdenCompra(int numOrdenCompra) {
    this.numOrdenCompra = numOrdenCompra;
  }

  public int getIdCarrito() {
    return idCarrito;
  }

  public void setIdCarrito(int idCarrito) {
    this.idCarrito = idCarrito;
  }

  public int getIdArticulo() {
    return idArticulo;
  }

  public void setIdArticulo(int idArticulo) {
    this.idArticulo = idArticulo;
  }

  public int getCantUnidades() {
    return cantUnidades;
  }

  public void setCantUnidades(int cantUnidades) {
    this.cantUnidades = cantUnidades;
  }

}

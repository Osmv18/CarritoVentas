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
public class Orden {

  private int numOrdenCompra;
  private String fechaCompra;
  private String nickName;
  private Double total;
  private String tarjeta;

  public Orden(int numOrdenCompra, String fechaCompra, String nickName, Double total, String tarjeta) {
    this.numOrdenCompra = numOrdenCompra;
    this.fechaCompra = fechaCompra;
    this.nickName = nickName;
    this.total = total;
    this.tarjeta = tarjeta;
  }

  public int getNumOrdenCompra() {
    return numOrdenCompra;
  }

  public void setNumOrdenCompra(int numOrdenCompra) {
    this.numOrdenCompra = numOrdenCompra;
  }

  public String getFechaCompra() {
    return fechaCompra;
  }

  public void setFechaCompra(String fechaCompra) {
    this.fechaCompra = fechaCompra;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public String getTarjeta() {
    return tarjeta;
  }

  public void setTarjeta(String tarjeta) {
    this.tarjeta = tarjeta;
  }

}

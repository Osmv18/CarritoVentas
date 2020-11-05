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
public class Cliente {

  private String nickName;
  private String nombreCompleto;
  private String apellido1;
  private String apellido2;
  private int provincia;
  private int canton;
  private int distrito;
  private String codigoPostal;
  private String otrasSenhas;
  private String telefono1;
  private String telefono2;
  private String correoElectronico;
  private String contrasena;

  public Cliente(String nickName, String nombreCompleto, String apellido1, String apellido2, int provincia, int canton, int distrito, String codigoPostal, String otrasSenhas, String telefono1, String telefono2, String correoElectronico, String contrasena) {
    this.nickName = nickName;
    this.nombreCompleto = nombreCompleto;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
    this.provincia = provincia;
    this.canton = canton;
    this.distrito = distrito;
    this.codigoPostal = codigoPostal;
    this.otrasSenhas = otrasSenhas;
    this.telefono1 = telefono1;
    this.telefono2 = telefono2;
    this.correoElectronico = correoElectronico;
    this.contrasena = contrasena;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public String getNombreCompleto() {
    return nombreCompleto;
  }

  public void setNombreCompleto(String nombreCompleto) {
    this.nombreCompleto = nombreCompleto;
  }

  public String getApellido1() {
    return apellido1;
  }

  public void setApellido1(String apellido1) {
    this.apellido1 = apellido1;
  }

  public String getApellido2() {
    return apellido2;
  }

  public void setApellido2(String apellido2) {
    this.apellido2 = apellido2;
  }

  public int getProvincia() {
    return provincia;
  }

  public void setProvincia(int provincia) {
    this.provincia = provincia;
  }

  public int getCanton() {
    return canton;
  }

  public void setCanton(int canton) {
    this.canton = canton;
  }

  public int getDistrito() {
    return distrito;
  }

  public void setDistrito(int distrito) {
    this.distrito = distrito;
  }

  public String getCodigoPostal() {
    return codigoPostal;
  }

  public void setCodigoPostal(String codigoPostal) {
    this.codigoPostal = codigoPostal;
  }

  public String getOtrasSenhas() {
    return otrasSenhas;
  }

  public void setOtrasSenhas(String otrasSenhas) {
    this.otrasSenhas = otrasSenhas;
  }

  public String getTelefono1() {
    return telefono1;
  }

  public void setTelefono1(String telefono1) {
    this.telefono1 = telefono1;
  }

  public String getTelefono2() {
    return telefono2;
  }

  public void setTelefono2(String telefono2) {
    this.telefono2 = telefono2;
  }

  public String getCorreoElectronico() {
    return correoElectronico;
  }

  public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
  }

  public String getContrasena() {
    return contrasena;
  }

  public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
  }

}

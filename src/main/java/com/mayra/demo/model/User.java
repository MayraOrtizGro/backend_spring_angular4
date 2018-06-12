package com.mayra.demo.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
@Access(AccessType.FIELD)
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "usuario_id", unique = true, nullable = false)
	private Long usuario_id;
	
	@Column(name="nombre", nullable=false, length=50)
	private String nombre;
	
	@Column(name="apaterno", nullable=true, length=50)
	private String aPaterno;
	
	@Column(name="amaterno", nullable=true, length=50)
	private String aMaterno;
	
	@Column(name="usuario", nullable=false, length=20)
	private String usuario;
	
	@Column(name="password", nullable=false, length=20)
	private String password;
	
	@Column(name="perfil", nullable=false, length=20)
	private String perfil;
	
	@Column(name="activo", nullable=false, length=11)
	private String activo;
	
	/*@Column(name="creado", nullable=false)
	private String creado;
	
	@Column(name="creado_por", nullable=false)
	private String creadoPor;
	
	@Column(name="actualizado", nullable=false)	
	private String actualizado;
	
	@Column(name="actualizado_por", nullable=false)
	private String actualizadoPor;
	*/
	
	public Long getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(Long usuario_id) {
		this.usuario_id = usuario_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getaPaterno() {
		return aPaterno;
	}
	public void setaPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}
	public String getaMaterno() {
		return aMaterno;
	}
	public void setaMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public String getActivo() {
		return activo;
	}
	public void setActivo(String activo) {
		this.activo = activo;
	}
	
	/*public String getCreado() {
		return creado;
	}
	public void setCreado(String creado) {
		this.creado = creado;
	}
	public String getCreadoPor() {
		return creadoPor;
	}
	public void setCreadoPor(String creadoPor) {
		this.creadoPor = creadoPor;
	}
	public String getActualizado() {
		return actualizado;
	}
	public void setActualizado(String actualizado) {
		this.actualizado = actualizado;
	}
	public String getActualizadoPor() {
		return actualizadoPor;
	}
	public void setActualizadoPor(String actualizadoPor) {
		this.actualizadoPor = actualizadoPor;
	}*/
}
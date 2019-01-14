package com.ceiba.estacionamiento.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Estacionamiento")
public class Estacionamiento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEstacionamiento;
	private int cantEstacionamientoMotos = 10;
	private int cantEstacionamientoCarros = 20;
	
	public Estacionamiento() {

	}	
	
	public Estacionamiento(int cantEstacionamientoMotos, int cantEstacionamientoCarros) {
		this.cantEstacionamientoMotos = cantEstacionamientoMotos;
		this.cantEstacionamientoCarros = cantEstacionamientoCarros;
	}
	

	public int getIdEstacionamiento() {
		return idEstacionamiento;
	}

	public void setIdEstacionamiento(int idEstacionamiento) {
		this.idEstacionamiento = idEstacionamiento;
	}

	public int getCantEstacionamientoMotos() {
		return cantEstacionamientoMotos;
	}

	public void setCantEstacionamientoMotos(int cantEstacionamientoMotos) {
		this.cantEstacionamientoMotos = cantEstacionamientoMotos;
	}

	public int getCantEstacionamientoCarros() {
		return cantEstacionamientoCarros;
	}

	public void setCantEstacionamientoCarros(int cantEstacionamientoCarros) {
		this.cantEstacionamientoCarros = cantEstacionamientoCarros;
	}
	
	public Boolean validarCantPuestosMoto(int cantidadMotos) {
		if (cantidadMotos < cantEstacionamientoMotos) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Boolean validarCantPuestosCarro(int cantidadCarros) {
		if (cantidadCarros < cantEstacionamientoCarros) {
			return true;
		}
		else {
			return false;
		}
	}
}

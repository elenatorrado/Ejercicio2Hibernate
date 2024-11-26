package es.studium.Ejercicio2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
//@Table(name="Persona")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idPersona")
	private int idPersona;
	private String nombre;

	//Constructor vacio
	public Persona() {
		this.idPersona=0;
		this.nombre="";
	}
	//Constructor por parametros 

	public Persona(int id, String n) {
		this.idPersona = id;
		this.nombre = n;
	}

	//Getter and Setters

	public Persona(int i) {
		this.idPersona=i;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}

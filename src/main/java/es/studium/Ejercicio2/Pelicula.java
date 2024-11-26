package es.studium.Ejercicio2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
//@Table(name="Pelicula")
public class Pelicula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idPelicula")
	private int idPelicula;
	private String titulo;
	private int anio;
	private int duracion;
	//Persona director;

	//Constructor Vacio
	public Pelicula() {
		this.idPelicula=0;
		this.titulo="";
		this.anio=0;
		this.duracion=0;
	//	this.director=new Persona();
	}
	//Constructor por parametros

	public Pelicula(int idPelicula, String titulo, int anio, int duracion) {
		this.idPelicula = idPelicula;
		this.titulo = titulo;
		this.anio = anio;
		this.duracion = duracion;
	}
	//Getter and Setters

	public Pelicula(int i) {
		this.idPelicula=i;
	}

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	


}

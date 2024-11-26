package es.studium.Ejercicio2;


public class Principal {

	public static void main(String[] args) {
		/*Creamos un objeto de tipo Usuario utilizando el
		constructor por parámetros*/
			//Persona persona1 = new Persona(0,"Elena");
			//Pelicula pelicula1 = new Pelicula(0,"El Silencio de los Corderos",1978,120);
		
		
		/*Llamamos la método crear(usuario1) de la clase
		* FactoryCRUD para que se cree el objeto pelicula o persona 1 en la
		* base de datos*/
		
		
		//FactoryCRUD.crear(Persona o pelicula 1);
		//FactoryCRUD.crearPersona(persona1);
		//FactoryCRUD.crearPelicula(pelicula1);
		
////		FactoryCRUD.actualizar(usuario2);
//		Persona persona2=new Persona(1,"Antonio");
//		Pelicula pelicula2=new Pelicula(1,"Efecto Mariposa",1985,200);
////		
//		FactoryCRUD.actualizarPersona(persona2);
//		FactoryCRUD.actualizarPelicula(pelicula2);
////		FactoryCRUD.leer();
//		FactoryCRUD.leerPersona();
//		FactoryCRUD.leerPelicula();
//		FactoryCrud.Eliminar();
		Persona persona3=new Persona(2);
		Pelicula pelicula3=new Pelicula(2);
		FactoryCRUD.eliminarPersona(persona3);
		FactoryCRUD.eliminarPelicula(pelicula3);
//		

	}

}

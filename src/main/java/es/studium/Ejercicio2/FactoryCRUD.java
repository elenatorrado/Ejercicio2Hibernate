package es.studium.Ejercicio2;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;







public class FactoryCRUD {
	//Creamos la sesion 
	private static Session getSession() {
		SessionFactory sessionFactory = new
				Configuration().addAnnotatedClass(Persona.class).configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		return session;


	}
	 public static void crearPersona(Persona per) {
		 Session sessionObj = getSession();

			//Iniciamos la transaccion de la sesion
			Transaction tx = sessionObj.beginTransaction();
			//Persist marca el objeto 
			sessionObj.persist(per);
			//El commit confirma y guarda los cambios
			tx.commit();
			sessionObj.close();
			System.out.println(
					"Persona con ID: " + per.getIdPersona()+ " -  Su Nombre:" + per.getNombre() +
					" - se ha insertado correctamente en la tabla Persona de la base de datos adt3_hibernate.");

		 
	 }
	 public static void crearPelicula(Pelicula p){
		 Session sessionObj = getSession();

			//Iniciamos la transaccion de la sesion
			Transaction tx = sessionObj.beginTransaction();
			//Persist marca el objeto 
			sessionObj.persist(p);
			//El commit confirma y guarda los cambios
			tx.commit();
			sessionObj.close();
			System.out.println(
					"Pelicula con ID: " + p.getIdPelicula()+ " -  Su Titulo:" + p.getTitulo() +" - Su año "+p.getAnio()+" - y dura "+p.getDuracion()+
					" - se ha insertado correctamente en la tabla Pelicula de la base de datos adt3_hibernate.");

	 }
	 public static List<Pelicula> leerPelicula(){
		//Hace la consulta desde la clase Usuario
			String consulta = "FROM " + Pelicula.class.getName();

			//Obtenemos la sesion
			Session sessionObj = getSession();

			//Con la sesion llamamos al metodo createQuery y este a su vez tiene el metodo list
			List<Pelicula> listaResultadoPelicula =
					sessionObj.createQuery(consulta, Pelicula.class).list();
			for(Pelicula p : listaResultadoPelicula) {
				System.out.println(p.getIdPelicula() + " - " +
						p.getTitulo() + " - " + p.getAnio()+"-"+p.getDuracion() );
			}
			sessionObj.close();
			return listaResultadoPelicula;
	 }
	 public static List<Persona> leerPersona(){
		 //Hace la consulta desde la clase Usuario
			String consulta = "FROM " + Persona.class.getName();

			//Obtenemos la sesion
			Session sessionObj = getSession();

			//Con la sesion llamamos al metodo createQuery y este a su vez tiene el metodo list
			List<Persona> listaResultadoPersona =
					sessionObj.createQuery(consulta, Persona.class).list();
			for(Persona per : listaResultadoPersona) {
				System.out.println(per.getIdPersona() + " - " +
						per.getNombre() );
			}
			sessionObj.close();
			return listaResultadoPersona;
	 }
		 
	 public static void actualizarPelicula(Pelicula p){
		 Session sessionObj = getSession();
			Transaction transObj = sessionObj.beginTransaction();
			/* Actualizamos el objeto */
			sessionObj.merge(p);//merge marca para que se actualice el usuario
			transObj.commit();//Aqui se actualiza
			sessionObj.close();
			System.out.println(
					"Actualizado correctamente la pelicula de id: " + p.getIdPelicula());
		 
	 }
	 public static void actualizarPersona(Persona per){
		 Session sessionObj = getSession();
			Transaction transObj = sessionObj.beginTransaction();
			/* Actualizamos el objeto */
			sessionObj.merge(per);//merge marca para que se actualice el usuario
			transObj.commit();//Aqui se actualiza
			sessionObj.close();
			System.out.println(
					"Actualizado correctamente la persona de id: " + per.getIdPersona());
	 }
	 public static void eliminarPelicula(Pelicula p){
		 Session sessionObj = getSession();
			Transaction transObj = sessionObj.beginTransaction();//Es como un objeto que actualiza la info
			sessionObj.remove(p);
			transObj.commit();//Confirma el transaction
			sessionObj.close();
			System.out.println("Eliminado correctamente la pelicula de id:" + p.getIdPelicula());
	 }
	 public static void eliminarPersona(Persona per){
		 Session sessionObj = getSession();
			Transaction transObj = sessionObj.beginTransaction();//Es como un objeto que actualiza la info
			sessionObj.remove(per);
			transObj.commit();//Confirma el transaction
			sessionObj.close();
			System.out.println("Eliminado correctamente la persona de id:" + per.getIdPersona());
	 }

}

package ejercicio;





import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory eFactory = Persistence.createEntityManagerFactory("persistencia");
		EntityManager eManager = eFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		
		eTrans.begin();
		Departamento d1 = new Departamento();
		d1.setDept_no(10);
		d1.setDnombre("Informática");
		d1.setLoc("Burgos");
		eManager.persist(d1);
//		Empleado e1 = new Empleado();
//		e1.setApellido("López");
//		e1.setOficio("CEO");
//		e1.setDirector(e1);
//		e1.setFecha_alta(new Date());
//		e1.setSalario(2000.25f);
//		e1.setComision(20.00f);
//		e1.setDepartamento(d1);
//		
//		eManager.persist(e1);
		
		eTrans.commit();

	}

}

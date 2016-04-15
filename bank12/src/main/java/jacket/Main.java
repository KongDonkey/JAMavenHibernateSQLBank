package jacket;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
//		Department department1 = new Department("Lviv", 55);
//		Department department2 = new Department("Kiev",22);
//		Department department3 = new Department("Kiev",35);
//		Department department4 = new Department("Kiev",70);
//		Department department5 = new Department("Lviv",12);
//		Department department6 = new Department("Rivno",20);
//		List<Client> clients1 = new ArrayList<Client>();
//		List<Client> clients2 = new ArrayList<Client>();
//		List<Client> clients3 = new ArrayList<Client>();
//		List<Client> clients4 = new ArrayList<Client>();
//		List<Client> clients5 = new ArrayList<Client>();
//		List<Client> clients6 = new ArrayList<Client>();
//		clients1.add(new Client("Taras", "Olegovi4", "full", "KV257703", "Lviv", 22));
//		clients1.add(new Client("Maras", "Ulegovi4", "2full", "KV257703", "Kiev", 23));
//		clients1.add(new Client("Karas", "Alegovi4", "full", "KV257703", "Uzgorod", 25));
//		clients2.add(new Client("Bogdan", "Olegovi4", "full", "KV257703", "Rivno", 19));
//		clients3.add(new Client("Vasil", "Olegovi4", "full", "KV257703", "Kiev", 60));
//		clients3.add(new Client("Oleg", "Olegovi4", "2full", "KV257703", "Lviv", 55));
//		clients3.add(new Client("Karapet", "Olegovi4", "2full", "KV257703", "Lviv", 18));
//		clients3.add(new Client("Andrii", "Olegovi4", "full", "KV257703", "Kiev", 36));
//		clients4.add(new Client("Oleg", "Olegovi4", "full", "KV257703", "Kiev", 40));
//		clients4.add(new Client("Nadya", "Olegovi4", "2full", "KV257703", "Kiev", 27));
//		clients5.add(new Client("Yurii", "Olegovi4", "full", "KV257703", "Mukachevo", 22));
//		clients6.add(new Client("Andrii", "Olegovi4", "full", "KV257703", "Dnepropetrovsk", 22));
//		clients6.add(new Client("Bogdan", "Olegovi4", "full", "KV257703", "Lviv", 45));
//		clients6.add(new Client("Bogdan", "Olegovi4", "full", "KV257703", "Lviv", 31));
//		clients6.add(new Client("Volodimir", "Olegovi4", "full", "KV257703", "Sumy", 20));
//		clients6.add(new Client("Sergii", "Olegovi4", "full", "KV257703", "Kharkiv", 52));
//		department1.setClients(clients1);
//		department2.setClients(clients2);
//		department3.setClients(clients3);
//		department4.setClients(clients4);
//		department5.setClients(clients5);
//		department6.setClients(clients6);
//		session.persist(department1);
//		session.persist(department2);
//		session.persist(department3);
//		session.persist(department4);
//		session.persist(department5);
//		session.persist(department6);
		
//		Client client = session.get(Client.class, 1);
//		client.setIdDepartment(session.get(Department.class, 2));
//		session.update(client);
//		client = session.get(Client.class, 2);
//		client.setIdDepartment(session.get(Department.class, 1));
//		session.update(client);
//		client = session.get(Client.class, 3);
//		client.setIdDepartment(session.get(Department.class, 3));
//		session.update(client);
//		client = session.get(Client.class, 4);
//		client.setIdDepartment(session.get(Department.class, 1));
//		session.update(client);
//		client = session.get(Client.class, 5);
//		client.setIdDepartment(session.get(Department.class, 5));
//		session.update(client);
//		client = session.get(Client.class, 6);
//		client.setIdDepartment(session.get(Department.class, 4));
//		session.update(client);
//		client = session.get(Client.class, 7);
//		client.setIdDepartment(session.get(Department.class, 6));
//		session.update(client);
//		client = session.get(Client.class, 8);
//		client.setIdDepartment(session.get(Department.class, 6));
//		session.update(client);
//		client = session.get(Client.class, 9);
//		client.setIdDepartment(session.get(Department.class, 4));
//		session.update(client);
		
//		bankDepartmentPersist(10, 1, session);
//		bankDepartmentPersist(11, 2, session);
//		bankDepartmentPersist(12, 2, session);
//		bankDepartmentPersist(13, 6, session);
//		bankDepartmentPersist(14, 3, session);
//		bankDepartmentPersist(15, 3, session);
//		bankDepartmentPersist(16, 3, session);
//		
		System.out.println("check");
		System.out.println("check");
		System.out.println("check");
		session.getTransaction().commit();
		session.close();
		factory.close();

	}
	public static void bankDepartmentPersist(int clientId, int departmentId, Session session){
		Client client = session.get(Client.class, clientId);
		client.setIdDepartment(session.get(Department.class, departmentId));
		session.update(client);
	}

}


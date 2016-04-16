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
		

		
		session.getTransaction().commit();
		session.close();
		factory.close();

	}

	public static void addClient(Session session, int clientAge, String clientCity, String clientEdukation,
			String clientFirstName, String clientLastName, String clientPassport, int departmentNumber) {
		Client client = new Client();
		client.setAge(clientAge);
		client.setCity(clientCity);
		client.setEducation(clientEdukation);
		client.setFirstName(clientFirstName);
		client.setLastName(clientLastName);
		client.setPassport(clientPassport);
		session.save(client);
		client.setIdDepartment(session.get(Department.class, departmentNumber));
	}

	public static void bankDepartmentPersist(int clientId, int departmentId, Session session) {
		Client client = session.get(Client.class, clientId);
		client.setIdDepartment(session.get(Department.class, departmentId));
		session.update(client);
	}

	public static void addApplication(Session session, String creditState, String currency, int sum, int idClient) {
		Application app = new Application();
		app.setCreditState(creditState);
		app.setCurrency(currency);
		app.setSum(sum);
		session.save(app);
		app.setIdClient(session.get(Client.class, idClient));
	}
	public static void packageDepAll(Session session){
		 Department department1 = new Department("Lviv", 55);
		 Department department2 = new Department("Kiev",22);
		 Department department3 = new Department("Kiev",35);
		 Department department4 = new Department("Kiev",70);
		 Department department5 = new Department("Lviv",12);
		 Department department6 = new Department("Rivno",20);
		 List<Client> clients1 = new ArrayList<Client>();
		 List<Client> clients2 = new ArrayList<Client>();
		 List<Client> clients3 = new ArrayList<Client>();
		 List<Client> clients4 = new ArrayList<Client>();
		 List<Client> clients5 = new ArrayList<Client>();
		 List<Client> clients6 = new ArrayList<Client>();
		 clients1.add(new Client("Taras", "Olegovi4", "full", "KV257703",
		 "Lviv", 22));
		 clients1.add(new Client("Maras", "Ulegovi4", "2full", "KV257703",
		 "Kiev", 23));
		 clients1.add(new Client("Karas", "Alegovi4", "full", "KV257703",
		 "Uzgorod", 25));
		 clients2.add(new Client("Bogdan", "Olegovi4", "full", "KV257703",
		 "Rivno", 19));
		 clients3.add(new Client("Vasil", "Olegovi4", "full", "KV257703",
		 "Kiev", 60));
		 clients3.add(new Client("Oleg", "Olegovi4", "2full", "KV257703",
		 "Lviv", 55));
		 clients3.add(new Client("Karapet", "Olegovi4", "2full", "KV257703",
		 "Lviv", 18));
		 clients3.add(new Client("Andrii", "Olegovi4", "full", "KV257703",
		 "Kiev", 36));
		 clients4.add(new Client("Oleg", "Olegovi4", "full", "KV257703",
		 "Kiev", 40));
		 clients4.add(new Client("Nadya", "Olegovi4", "2full", "KV257703",
		 "Kiev", 27));
		 clients5.add(new Client("Yurii", "Olegovi4", "full", "KV257703",
		 "Mukachevo", 22));
		 clients6.add(new Client("Andrii", "Olegovi4", "full", "KV257703",
		 "Dnepropetrovsk", 22));
		 clients6.add(new Client("Bogdan", "Olegovi4", "full", "KV257703",
		 "Lviv", 45));
		 clients6.add(new Client("Bogdan", "Olegovi4", "full", "KV257703",
		 "Lviv", 31));
		 clients6.add(new Client("Volodimir", "Olegovi4", "full", "KV257703",
		 "Sumy", 20));
		 clients6.add(new Client("Sergii", "Olegovi4", "full", "KV257703",
		 "Kharkiv", 52));
		 department1.setClients(clients1);
		 department2.setClients(clients2);
		 department3.setClients(clients3);
		 department4.setClients(clients4);
		 department5.setClients(clients5);
		 department6.setClients(clients6);
		 session.persist(department1);
		 session.persist(department2);
		 session.persist(department3);
		 session.persist(department4);
		 session.persist(department5);
		 session.persist(department6);
		 
		 Client client = session.get(Client.class, 1);
		 client.setIdDepartment(session.get(Department.class, 2));
		 session.update(client);
		 client = session.get(Client.class, 2);
		 client.setIdDepartment(session.get(Department.class, 1));
		 session.update(client);
		 client = session.get(Client.class, 3);
		 client.setIdDepartment(session.get(Department.class, 3));
		 session.update(client);
		 client = session.get(Client.class, 4);
		 client.setIdDepartment(session.get(Department.class, 1));
		 session.update(client);
		 client = session.get(Client.class, 5);
		 client.setIdDepartment(session.get(Department.class, 5));
		 session.update(client);
		 client = session.get(Client.class, 6);
		 client.setIdDepartment(session.get(Department.class, 4));
		 session.update(client);
		 client = session.get(Client.class, 7);
		 client.setIdDepartment(session.get(Department.class, 6));
		 session.update(client);
		 client = session.get(Client.class, 8);
		 client.setIdDepartment(session.get(Department.class, 6));
		 session.update(client);
		 client = session.get(Client.class, 9);
		 client.setIdDepartment(session.get(Department.class, 4));
		 session.update(client);

		 bankDepartmentPersist(10, 1, session);
		 bankDepartmentPersist(11, 2, session);
		 bankDepartmentPersist(12, 2, session);
		 bankDepartmentPersist(13, 6, session);
		 bankDepartmentPersist(14, 3, session);
		 bankDepartmentPersist(15, 3, session);
		 bankDepartmentPersist(16, 3, session);
	}

	public static void packageClient(Session session) {
		addClient(session, 50, "Kiev", "full", "Viktor", "Pokatila", "21111", 4);
		addClient(session, 22, "Kiev", "2full", "Vladimir", "Lita", "SD21111", 5);
		addClient(session, 17, "Lviv", "2full", "Kiril", "Karlovi4", "AA21111", 3);
		addClient(session, 29, "Lviv", "full", "Taras", "Mitin", "QZ21111", 3);
		addClient(session, 23, "Kiev", "full", "Abram", "Golin", "PP21111", 1);
	}

	public static void packageApp(Session session) {
		addApplication(session, "Refunded", "dollar", 550, 1);
		addApplication(session, "Refunded", "dollar", 2200, 2);
		addApplication(session, "Refunded", "dollar", 347, 1);
		addApplication(session, "Refunded", "dollar", 11000, 5);
		addApplication(session, "Refunded", "hryvnia", 500, 12);
		addApplication(session, "Not refunded", "hryvnia", 23400, 3);
		addApplication(session, "Not refunded", "dollar", 3500, 4);
		addApplication(session, "Not refunded", "dollar", 8900, 10);
		addApplication(session, "Refunded", "dollar", 9815, 4);

		addApplication(session, "Not refunded", "hryvnia", 550, 16);
		addApplication(session, "Refunded", "hryvnia", 2200, 12);
		addApplication(session, "Refunded", "dollar", 347, 15);
		addApplication(session, "Refunded", "hryvnia", 11000, 4);
		addApplication(session, "Refunded", "dollar", 500, 11);
		addApplication(session, "Not refunded", "dollar", 400, 2);
		addApplication(session, "Refunded", "dollar", 350, 8);
		addApplication(session, "Refunded", "dollar", 8900, 10);
		addApplication(session, "Not refunded", "hryvnia", 985, 5);

		addApplication(session, "Refunded", "dollar", 5550, 9);
		addApplication(session, "Refunded", "dollar", 22500, 9);
		addApplication(session, "Refunded", "dollar", 1347, 11);
		addApplication(session, "Refunded", "dollar", 11000, 15);
		addApplication(session, "Refunded", "hryvnia", 5050, 1);
		addApplication(session, "Not refunded", "hryvnia", 2400, 4);
		addApplication(session, "Not refunded", "dollar", 3500, 8);
		addApplication(session, "Not refunded", "dollar", 900, 6);
		addApplication(session, "Refunded", "dollar", 19815, 6);

		addApplication(session, "Not refunded", "hryvnia", 550, 6);
		addApplication(session, "Refunded", "hryvnia", 2200, 15);
		addApplication(session, "Refunded", "dollar", 347, 12);
		addApplication(session, "Refunded", "hryvnia", 11000, 14);
		addApplication(session, "Refunded", "dollar", 500, 2);
		addApplication(session, "Not refunded", "dollar", 23400, 2);
		addApplication(session, "Refunded", "dollar", 3500, 3);
		addApplication(session, "Refunded", "dollar", 8900, 16);
		addApplication(session, "Not refunded", "hryvnia", 9815, 3);
	}

}

package jacket;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDepartment;
	private String departmentCity;
	private int countWorkers;
	@OneToMany(mappedBy = "idDepartment", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private List<Client> clients = new ArrayList<Client>();

	public Department() {
	}

	public Department(String departmentCity, int countWorkers) {
		this.departmentCity = departmentCity;
		this.countWorkers = countWorkers;
	}

	public int getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(int idDepartment) {
		this.idDepartment = idDepartment;
	}

	public String getDepartmentCity() {
		return departmentCity;
	}

	public void setDepartmentCity(String departmentCity) {
		this.departmentCity = departmentCity;
	}

	public int getCountWorkers() {
		return countWorkers;
	}

	public void setCountWorkers(int countWorkers) {
		this.countWorkers = countWorkers;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	@Override
	public String toString() {
		return "Department [idDepartment=" + idDepartment + ", departmentCity=" + departmentCity + ", countWorkers="
				+ countWorkers + "]";
	}

}


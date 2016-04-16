package jacket;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idClient;
	private String firstName;
	private String lastName;
	private String education;
	private String passport;
	private String city;
	private int age;
	@OneToMany(mappedBy = "idClient", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private List<Application> aplications = new ArrayList<Application>();
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private Department idDepartment;

	public Client() {
	}

	public Client(String firstName, String lastName, String education, String passport, String city, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.education = education;
		this.passport = passport;
		this.city = city;
		this.age = age;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Application> getAplications() {
		return aplications;
	}

	public void setAplications(List<Application> aplications) {
		this.aplications = aplications;
	}

	public Department getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(Department idDepartment) {
		this.idDepartment = idDepartment;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", firstName=" + firstName + ", lastName=" + lastName + ", education="
				+ education + ", passport=" + passport + ", city=" + city + ", age=" + age + "]";
	}

}


package jacket;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Application {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idApplication;
	private String CreditState;
	private String Currency;
	private int sum;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private Client idClient;

	public Application() {
	}

	public int getIdAplication() {
		return idApplication;
	}

	public void setIdAplication(int idAplication) {
		this.idApplication = idAplication;
	}

	public String getCreditState() {
		return CreditState;
	}

	public void setCreditState(String creditState) {
		CreditState = creditState;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public Client getIdClient() {
		return idClient;
	}

	public void setIdClient(Client idClient) {
		this.idClient = idClient;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getIdApplication() {
		return idApplication;
	}

	public void setIdApplication(int idApplication) {
		this.idApplication = idApplication;
	}

	@Override
	public String toString() {
		return "Application [idApplication=" + idApplication + ", CreditState=" + CreditState + ", Currency=" + Currency
				+ ", sum=" + sum + "]";
	}

	

}

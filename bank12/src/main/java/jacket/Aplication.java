package jacket;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Aplication {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAplication;
	private String CreditState;
	private String Currency;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private Client idClient;

	public Aplication() {
	}

	public Aplication(String creditState, String currency) {
		super();
		CreditState = creditState;
		Currency = currency;
	}

	public int getIdAplication() {
		return idAplication;
	}

	public void setIdAplication(int idAplication) {
		this.idAplication = idAplication;
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

	@Override
	public String toString() {
		return "Aplication [idAplication=" + idAplication + ", CreditState=" + CreditState + ", Currency=" + Currency
				+ "]";
	}

}

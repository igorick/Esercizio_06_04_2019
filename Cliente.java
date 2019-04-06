
public class Cliente {
	private String ID;
	private String Cognome;
	private String Nome;
	private String Telefono;
	private int gradoSoddisfazione;
	
	public Cliente() {
		
	}
	
	public Cliente (String iD, String cognome, String nome, String telefono, int gradoSoddisfazione) {
		ID = iD;
		Cognome = cognome;
		Nome = nome;
		Telefono = telefono;
		this.gradoSoddisfazione = gradoSoddisfazione;
	}
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public int getGradoSoddisfazione() {
		return gradoSoddisfazione;
	}

	public void GradoSoddisfazione(int gradoSoddisfazione) {
		if(gradoSoddisfazione>0 && gradoSoddisfazione<11)
		this.gradoSoddisfazione = gradoSoddisfazione;
		else {
			if(gradoSoddisfazione<1)
				this.gradoSoddisfazione = 1;
			else
				this.gradoSoddisfazione = 10;
		}
	}
	
	public void ModificaDati(String cognome, String nome, String telefono, int gradoSoddisfazione) {
		setCognome(cognome);
		setNome(nome);
		setTelefono(telefono);
		GradoSoddisfazione(gradoSoddisfazione);
	}
	
	@Override
	public String stampa() {
		return "Cliente [ID=" + ID + ", Cognome=" + Cognome + ", Nome=" + Nome + ", Telefono=" + Telefono
				+ ", gradoSoddisfazione=" + gradoSoddisfazione + ", getID()=" + getID() + ", getCognome()="
				+ getCognome() + ", getNome()=" + getNome() + ", getTelefono()=" + getTelefono()
				+ ", getGradoSoddisfazione()=" + getGradoSoddisfazione() + "]";
	}
	
}
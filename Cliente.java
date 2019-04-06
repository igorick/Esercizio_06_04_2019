
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
	
}
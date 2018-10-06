package composicao;

public class Casa {

	private Edificio edificio;
	private int numQuartos;
	
	public Edificio getEdificio() {
		return edificio;
	}
	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}
	public int getNumQuartos() {
		return numQuartos;
	}
	public void setNumQuartos(int numQuartos) {
		this.numQuartos = numQuartos;
	}
	@Override
	public String toString() {
		return "Casa [edificio=" + edificio + ", numQuartos=" + numQuartos + "]";
	}
	
	
}

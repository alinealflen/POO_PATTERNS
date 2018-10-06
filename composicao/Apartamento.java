package composicao;

public class Apartamento {
	
	private Edificio edificio;
	private int numAndares;
	private int numApartamentos;
	
	public int getNumAndares() {
		return numAndares;
	}
	public void setNumAndares(int numAndares) {
		this.numAndares = numAndares;
	}
	public int getNumApartamentos() {
		return numApartamentos;
	}
	public void setNumApartamentos(int numApartamentos) {
		this.numApartamentos = numApartamentos;
	}
	public Edificio getEdificio() {
		return edificio;
	}
	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}
	@Override
	public String toString() {
		return "Apartamento [edificio=" + edificio + ", numAndares=" + numAndares + ", numApartamentos="
				+ numApartamentos + "]";
	}
	
	
}

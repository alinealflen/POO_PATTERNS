package composicao;

public class Edificio {

	private int matricula;
	private String endereco;

	public Edificio(int matricula, String endereco) {
		this.matricula = matricula;
		this.endereco = endereco;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Edificio [matricula=" + matricula + ", endereco=" + endereco + "]";
	}

}

package strategy;

public abstract class Empresa {

	protected String cnpj;
	protected double valorImpostos;
	protected double valorRenda;
	
	
	public abstract void calcularImposto();

	public Empresa(String cnpj, double valorRenda) {
		this.cnpj = cnpj;
		this.valorRenda = valorRenda;
	}



	public Empresa(String cnpj, double valorImpostos, double valorRenda) {
		this(cnpj, valorRenda);
		this.valorImpostos = valorImpostos;
	}



	public String getCnpj() {
		return cnpj;
	}



	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}



	public double getValorImpostos() {
		return valorImpostos;
	}



	public void setValorImpostos(double valorImpostos) {
		this.valorImpostos = valorImpostos;
	}



	public double getValorRenda() {
		return valorRenda;
	}



	public void setValorRenda(double valorRenda) {
		this.valorRenda = valorRenda;
	}

	@Override
	public String toString() {
		return "Empresa [cnpj=" + cnpj + ", valorImpostos=" + valorImpostos + ", valorRenda=" + valorRenda + "]";
	}
}

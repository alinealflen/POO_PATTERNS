package strategy;

public class EmpresaDeGrandePorte extends Empresa {

	private int numeroDeFuncionarios;

	public EmpresaDeGrandePorte(String cnpj, double valorRenda, int numeroDeFuncionarios) {
		super(cnpj, valorRenda);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public void calcularImposto() {
		this.valorImpostos = (this.valorRenda*0.22);
		
	}
	
	
	
}

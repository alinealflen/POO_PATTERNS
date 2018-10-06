package strategy;

public class MicroEmpreendedor extends Empresa {

	
	
	public MicroEmpreendedor(String cnpj, double valorRenda) {
		super(cnpj, valorRenda);
		
	}

	@Override
	public void calcularImposto() {
		this.valorImpostos = (this.valorRenda*0.15);
		
	}

	
	
		
}

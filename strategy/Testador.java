package strategy;

public class Testador {
	
	public static void main(String[] args) {

	Empresa microEmpreendedor = new MicroEmpreendedor("002.888.5000/0001-5", 5000.0);
	
	Empresa grandePorte = new EmpresaDeGrandePorte("005.5588.9999/00001-0",200000.0, 756);
	
	CalculadoraDeImpostos cimp = new CalculadoraDeImpostos();
	
	cimp.calcularImposto(microEmpreendedor);
	System.out.println(microEmpreendedor);
	cimp.calcularImposto(grandePorte);
	System.out.println(grandePorte);
	}
}

package factory.builder;


public class Testador {

	public static void main(String[] args) {
		
		PizzaFactory pz = new PizzaFactory();
		
		Pizzaria pp = new Pizzaria(pz);
	
		IPizza pizza1 = pp.montar("Quatro Queijos");
	
		System.out.println(pizza1.getSabor() +" - Ingredientes: "+ pizza1.getIngredientes());
	}

}

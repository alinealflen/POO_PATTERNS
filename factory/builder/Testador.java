package factory.builder;

import java.io.File;

public class Testador {

	public static void main(String[] args) {
		
		PizzaFactory pz = new PizzaFactory();
		
		Pizzaria pp = new Pizzaria(pz);
	
		IPizza pizza1 = pp.montar("Quatro Queijos");
	
		System.out.println(pizza1.getSabor() +" - Ingredientes: "+ pizza1.getIngredientes());
		
		//builder:
		
		Pedido pedido = new Pedido(pizza1, "Gabriel", "R$ 30,00");
		PedidoBuilder pb = new PedidoBuilder(pedido);
		
		pb
			.endereco("Rua das Flores")
			.observacao("Cliente chato")
			.pizza(pizza1);
		
		System.out.println(pedido);
	
	}

}

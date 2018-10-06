package composicao;

public class Testador {

	public static void main(String[] args) {
		
		Edificio ed1 = new Edificio (12456, "Rua JGS256");

		Casa c1 = new Casa();
		c1.setNumQuartos(3);
		c1.setEdificio(ed1);
		
		System.out.println(c1.getEdificio().getMatricula());
		
		Edificio ed2 = new Edificio (5829, "Rua Natalia Schiochet,520");
		
		Apartamento apto = new Apartamento();
		apto.setNumAndares(6);
		apto.setNumApartamentos(12);
		apto.setEdificio(ed2);
		
		System.out.println(apto.getEdificio().getMatricula());
	}

}

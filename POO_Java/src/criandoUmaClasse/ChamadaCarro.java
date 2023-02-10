package criandoUmaClasse;

public class ChamadaCarro {
	
public static void main(String[] args) {
		
		//Utilizando o get
		Carro carro = new Carro("Vermelho", "Fusca", 10);
		System.out.println("A cor do carro é: "+carro.getCor());
		System.out.println("O modelo do carro é: "+carro.getModelo());
		System.out.println("O tanque do carro tem capacidade para: "+carro.getCapacidadeTanque()+" Litros\n");
		
		//Utilizando o set
		carro.setCapacidadeTanque(20);
		carro.setCor("Amarelo");
		carro.setModelo("Lamborgini");
		
		//Chamando os valores atualizados
		System.out.println("A cor do carro é: "+carro.getCor());
		System.out.println("O modelo do carro é: "+carro.getModelo());
		System.out.println("O tanque do carro tem capacidade para: "+carro.getCapacidadeTanque()+" Litros\n");
		
		//Utilizando o método de negócio
		System.out.println("valor total do tanque: "+carro.totalValorTanque(5)+" Litros");
	}
}

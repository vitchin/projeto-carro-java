package criandoUmaClasse;
//criando objetos
//carro carro = new Carro();

//Criando a classe
class Carro {
	//Criando os atributos
	String cor;
	String modelo;
	int capacidadeTanque;
	
	//Criando métodos
	
	//Construtor sempre abaixo dos atributos
	//Contstutor da classe
	Carro(String cor, String modelo, int capacidadeTanque){
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}
	void setCor(String cor) {
		this.cor = cor;//coloca um valor no atributo
	}
	String getCor() {
		return cor;//retorna o valor do método
	}
	void setModelo(String modelo) {
		this.modelo = modelo;//coloca um valor no atributo
	}
	String getModelo() {
		return modelo;//retorna o valor do método
	}
	void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;//coloca um valor no atributo
	}
	
	int getCapacidadeTanque() {
		return capacidadeTanque;//retorna o valor do método
	}
	
	//método de negócios com expressão
	double totalValorTanque(double valorCombutivel) {
		return capacidadeTanque * valorCombutivel;
	}
	
}


public class Medicamento extends Produto {
	
	// 3 atributos exclusivos da classe Medicamento.No total possui 10 atributos, já que 7 são herdados da classe produto.
	
	private String substanciaAtiva; // ex: paracetamol, dipirona, loratadina
	private double dosagem; //qualquer número positivo
	private String apresentacao; // comprimidos, drágeas, cápsulas, supositórios, óvulos, creme
	
	
	// Construtor de medicamento, realizando a chamada do construtor da classe Produto na primeira linha.
	public Medicamento(String codigoDeBarras, String nomeProduto, double qntApresentacao, String unidadeMedida, String fabricante, double preco, String substanciaAtiva, double dosagem, String apresentacao) {
		
		super(codigoDeBarras, nomeProduto, qntApresentacao, unidadeMedida, fabricante, preco);
		
		this.substanciaAtiva = substanciaAtiva;
		this.dosagem = dosagem;
		this.apresentacao = apresentacao;
	}

 
	// métodos get e set
	public String getSubstanciaAtiva() {
		return substanciaAtiva;	
	}
	
	public void setSubstanciaAtiva(String substanciaAtiva) {
		this.substanciaAtiva = substanciaAtiva;
	}
	
	public double getDosagem() {
		return dosagem;
	}
	
	public void setDosagem(double dosagem) {
		this.dosagem = dosagem;
	}
	
	
	public String getApresentacao() {
		return apresentacao;
	}
	
	public void setApresentacao(String apresentacao) {
		this.apresentacao = apresentacao;
	}
	
	
	//função exibedados da superclasse será sobrescrita quando chamada
	
	public void ExibeDados() {
		System.out.println("Nome do produto: " + getNomeProduto());
		System.out.println("Fabricante:" + getFabricante());
		System.out.println("Substancia ativa: " + getSubstanciaAtiva());
		System.out.println("Dosagem:" + getDosagem() + " " + getUnidadeMedida());
		System.out.println("Apresentacao: " + getQnt() + " " +  getApresentacao());
	}
		
}
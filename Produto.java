public class Produto {
		
	//Atributos da superclasse
	
	private String codigoDeBarras;
	private String nomeProduto;
	private String fabricante;
	private double qnt; //quanto vem de produto
	private String unidadeMedida; // unidade de medida da quantidade mg, mL, g, mcg
	private String validade; // modelo: dd/mm/aaaa
	private double preco;
	
	//Construtor da superclasse
	
	public Produto(String codigoDeBarras, String nomeProduto, double qnt, String unidadeMedida, String fabricante, double preco){
		this.codigoDeBarras = codigoDeBarras;
		this.nomeProduto = nomeProduto;
		this.qnt = qnt;
		this.unidadeMedida = unidadeMedida;
		this.fabricante = fabricante;
		this.preco = preco;
	}
	
	//metodos get e set
	
	public String getCodigoDeBarras() {
		return codigoDeBarras;	
	}
	
	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public double getQnt() {
		return qnt;
	}
	
	public void setQnt(double qntApresentacao) {
		this.qnt = qntApresentacao;
	}
	
	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getValidade() {
		return validade;
	}
	
	public void setValidade(String validade) {
		this.validade = validade;
	}

	//método da superClasse
	
	public void ExibeDados() {
		System.out.println("Produto: " + getNomeProduto());
		System.out.println("Quantidade de produto: " + getQnt() + getUnidadeMedida() );
		System.out.println("Fabricante: " + getFabricante());
		System.out.println("Valor: " + getPreco());
	}
	
}
	
	


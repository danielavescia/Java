import java.util.Scanner;

public class Cidade {

	//ATRIBUTOS
	private int codigo;
	private String descricao;
	private String uf;
	private int qntEstudantes;
	
	//CONSTRUTOR CIDADE
	public Cidade(int codigo, String descricao, String uf) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.uf = uf;
	}
	
	public Cidade() {}
	
	//METODOS GET E SET
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
		
	public void adicionaNovoEstudante() {
			qntEstudantes =  qntEstudantes + 1;
		}
	
	
	//METODO EXIBE INFOS DA CLASSE
	public void ExibeDados() {
	System.out.println("Dados da cidade cadastrada:");
	System.out.println("Codigo = " + getCodigo());
	System.out.println("Descricao = " + getDescricao());
	System.out.println("UF = " + getUf());
	
}

	public void CadastrarCidades() {
			
			Scanner input = new Scanner(System.in);	
			
			System.out.println("Digite o codigo (numero inteiro) da cidade: ");
			this.setCodigo(input.nextInt());
			input.nextLine();
			
			System.out.println("Digite a descricao: ");
			this.setDescricao(input.nextLine());		
			
			System.out.println("Digite a Unidade Federativa(UF): ");		
			this.setUf(input.nextLine());		
			
			this.ExibeDados();	
			System.out.println();
			input.close();
		}
	
}

	

	

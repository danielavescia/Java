import java.util.Scanner;

public class Estudante {

	//ATRIBUTOS
	private int codigo;
	private String nome;
	private String dataNascimento;
	private String email;
	private String senha;
	private Cidade cidade;
	
	
	//CONSTRUTOR ESTUDANTE
	public Estudante(int codigo, String nome, String dataNascimento, String email,String senha, Cidade cidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.senha = senha;
		this.cidade = cidade;
		cidade.adicionaNovoEstudante();
	}
	
	public Estudante() {}
	//METODOS GET E SET
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade =  cidade;
	}

	public void exibeDados() {
		
		System.out.println("Dados do aluno:");
		System.out.println("Codigo: " + getCodigo());
		System.out.println("Nome: " + getNome());
		System.out.println("Data de nascimento: " + getDataNascimento());
		System.out.println("Email: " + getEmail());
		System.out.println("Senha: " + getSenha());
	}
	
	
	public  void CadastrarEstudantes() {
		
		Scanner input = new Scanner(System.in);	
		
		System.out.println("Digite o codigo (numero inteiro) do estudante: ");
		this.setCodigo(input.nextInt());
		input.nextLine();
		
		System.out.println("Digite seu nome completo: ");
		this.setNome(input.nextLine());		
		
		System.out.println("Digite sua data de nascimento: ");
		this.setDataNascimento(input.nextLine());		
	
		System.out.println("Digite seu e-mail: ");
		this.setEmail(input.nextLine());	
		
		System.out.println("Digite sua senha: ");
		this.setSenha(input.nextLine());
				
		
	}
	
	public void BlocoCadastroEstudante() {
			System.out.println("Cadastrando estudante:");
			this.CadastrarEstudantes();
			System.out.println("Dados do estudante:");
			this.exibeDados();
			System.out.println();
			System.out.println("Alterando dados do estudante:");
			this.AlterarDados();
			
		} 
	 
	
	public  void AlterarDados() {
		Scanner input = new Scanner(System.in);	
		boolean estaativo = true;
		
		System.out.println("Gostaria de alterar algum dado do estudante? (Nao = digite 0 || Sim = 1)");
		int resposta = (input.nextInt());
		
		if (resposta == 1) {
			
			while(estaativo) {			
				
				System.out.println("Gostaria de alterar qual dado do estudante: 1- Código 2- Nome 3- Data de Nascimento 4- Email 5- Senha 6- Sair");
				int codigo = input.nextInt();
				
				switch (codigo) {
				
				case 1:
					
					 System.out.println("Digite o código do estudante:");
					 int resposta1 = input.nextInt();
					 this.setCodigo(resposta1);
					 break;
				
				case 2:
					
					 System.out.println("Digite o nome do estudante:");
					 String resposta2 = input.next();
					 this.setNome(resposta2);
					 break;
					 
				case 3:
					 System.out.println("Digite o código do estudante:");
					 String resposta3 = input.next();
					 this.setDataNascimento(resposta3);
					 break;
					 
				case 4:
					 System.out.println("Digite o email do estudante:");
					 String resposta4 = input.next();
					 this.setEmail(resposta4);
					 break;
					 
				case 5:
					
					CadastrarSenha();
					break;
					
				case 6:
					
					estaativo = false;
					System.out.println("Encerrando alteração de dados do estudante");
					break;
					
				default: break;	
			}			
			System.out.println("Dados do estudante:");	
			exibeDados();
			
			}
			
		}
	}
		
	
	public void CadastrarSenha() {
			
			Scanner input = new Scanner(System.in);	
			
			String senhaAtual = this.getSenha();
			System.out.println("Digite sua senha atual: ");
			String senhaCompara = input.next();
			String senhatemporaria = " ", senhatemporaria2 = " ";
			boolean comparacaoSenha = senhaAtual.equals(senhaCompara);
			
		
		
			do {
				if(comparacaoSenha == true) {
					System.out.println("Por favor, digite sua nova senha: ");
					senhatemporaria = input.next();
				} else {
					System.out.println("Senha incorreta! ");
					CadastrarSenha();
				} 		
			}	while(comparacaoSenha != true);
			
			System.out.println("Por favor, repita sua nova senha: ");
			senhatemporaria2 = input.next();
			
			boolean comparacaoTemporaria = senhatemporaria.equals(senhatemporaria2);
			
			do {
		
			if (comparacaoTemporaria == true) {
				this.setSenha(senhatemporaria2);
				System.out.println("Senha cadastrada com sucesso!");
				return;
			} else {
				System.out.println("As senhas nao batem, por favor repita!");
				comparacaoTemporaria = true;
				CadastrarSenha();
			}
			} while(comparacaoTemporaria != true);
			
		}
	}

		






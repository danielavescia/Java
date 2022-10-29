import java.util.Scanner;

public class Teste {
	
	static Medicamento medicamento;
	static Produto produto;
	
	static String substanciaAtiva,unidadeMedida, apresentacao, codigoDeBarras, nomeProduto, fabricante; 
	static double dosagem, qntApresentacao, preco; 

	public static void main(String[] args) {
		int resposta = 3;
		Scanner input = new Scanner(System.in);
		
			
			boolean eativo = true;
			
			while(eativo) {
				
				System.out.println("Cadastramento de produtos");
				System.out.println("-------------------------------------------------------------------------------------------------------------");
				System.out.println();
				System.out.println("Qual categoria de produto voce  gostaria de cadastrar? 1 - Medicamento | 2 - Outro  | 3 - Sair");
				resposta = input.nextInt();
				
				switch (resposta) {
				
				case 1: 
					
					CadastraMedicamento();
					System.out.println();
					System.out.println("Dados do medicamento cadastrado:");
					System.out.println("-------------------------------------------------------------------------------------------------------------");
					System.out.println("Medicamento cadastrado com sucesso! Gostaria de exibir os dados do medicamento cadastrado? 1 - Sim | 2 - Sair");
					System.out.println("-------------------------------------------------------------------------------------------------------------");
					resposta = input.nextInt();
					
					if(resposta == 1) {
						System.out.println("-------------------------------------------------------------------------------------------------------------");
						medicamento.ExibeDados();
						System.out.println("-------------------------------------------------------------------------------------------------------------");
					}else if(resposta == 2) {
						System.out.println("Encerrando cadastro..");
					}else { 
						System.out.println("Digite uma opcao valida!");
					}	
					break;
					
					
					case 2:
			
					CadastraProduto();
					System.out.println();
					System.out.println("-------------------------------------------------------------------------------------------------------------");
					System.out.println("Produto cadastrado com sucesso! Gostaria de exibir os dados do produto cadastrado? 1 - Sim | 2 - Sair");
					System.out.println("-------------------------------------------------------------------------------------------------------------");
					resposta = input.nextInt();
					
					if(resposta == 1) {
						System.out.println();
						System.out.println("Dados do produto cadastrado:");
						System.out.println("-------------------------------------------------------------------------------------------------------------");
						produto.ExibeDados();
						System.out.println("-------------------------------------------------------------------------------------------------------------");
					}else if(resposta == 2) {
						System.out.println("Encerrando cadastro de produto..");	
					}else {
							System.out.println("Digite uma opcao valida!");		
					}
					break;
					
					
				case 3:
					
					System.out.println("Encerrando cadastro..");
					eativo = false;
					break;
				
				default:
					System.out.println("Digite uma opcao valida!");
					break;
				}		
			}	
			input.close();
	}
		//funcao cadastra medicamento
		public static void CadastraMedicamento() {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Digite o codigo de barras do produto:");
			codigoDeBarras = input.next();
			System.out.print("Digite o nome do medicamento:");
			nomeProduto = input.next();
			limpaBuffer(input);
			System.out.println("Digite o fabricante:");
			fabricante = input.next();
			System.out.println("Digite o preco do produto:");
			preco = input.nextDouble();
			limpaBuffer(input);
			System.out.println("Substancia ativa:");
			substanciaAtiva = input.next();
			System.out.println("Dosagem do medicamento:");
			dosagem = input.nextDouble();
			limpaBuffer(input);
			System.out.println("Medida utilizada na dosagem (mg, mcg, g, mL, L):");
			unidadeMedida = input.next();;
			System.out.println("Apresentacao do medicamento (comprimidos, solucao, suspensao, creme, ovulo, capsula, dragea): ");
			apresentacao = input.next();
			System.out.println("Quantidade da apresentacao(quantidade de comprimidos, volume do liquido..):");
			qntApresentacao = input.nextDouble();
			limpaBuffer(input);
			
			medicamento = new Medicamento(codigoDeBarras, nomeProduto, qntApresentacao, unidadeMedida, fabricante, preco, substanciaAtiva, dosagem,  apresentacao);
			
		}
		
		//funcao cadastra produto
		public static void CadastraProduto(){

			Scanner input = new Scanner(System.in);

			System.out.print("Digite o codigo de barras do produto:");
			codigoDeBarras = input.next();
			System.out.print("Digite o nome do produto:");
			nomeProduto = input.next();
			limpaBuffer(input);
			System.out.println("Digite o fabricante:");
			fabricante = input.next();
			System.out.println("Digite a quantidade de produto que a embalagem contem: ");
			qntApresentacao = input.nextDouble();
			limpaBuffer(input);
			System.out.println("Unidade de medida da quantidade de produto (g, mL, mg, L): ");
			unidadeMedida = input.next();
			System.out.println("Digite o preco do produto:");
			preco = input.nextDouble();
			limpaBuffer(input);
			
			produto = new Produto(codigoDeBarras, nomeProduto, qntApresentacao, unidadeMedida, fabricante, preco);
			
		}
		//funcao limpa buffer
		public static void limpaBuffer(Scanner input) {
	        if (input.hasNextLine()) {
	            input.nextLine();
	        }
		}
}




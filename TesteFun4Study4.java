import java.util.Scanner;

public class TesteFun4Study4 {
	
	public static Cidade cidade;
	public static Estudante estudante;

	public static void main(String [] args) {
		
		cidade = new Cidade();			
		estudante = new Estudante();		
		
		int resposta = 0;
		int contadorCidade = 0;
		int contadorEstudante = 0;		
		boolean querCadastrarCidade = true;
		boolean querCadastrarEstudante = true;
		
		Scanner input = new Scanner(System.in);	
		
		while(querCadastrarCidade) {
			
			contadorCidade++;
			System.out.println("Cadastrar cidade:");			
			System.out.println();				
						
			cidade.CadastrarCidades();
			
			querCadastrarEstudante = true;
			
			while (querCadastrarEstudante) {
				
				estudante.BlocoCadastroEstudante();
				contadorEstudante++;
				
				if (contadorEstudante >=4) {
					
					System.out.println("Gostaria de cadastrar mais um estudante? (Nao = digite 0 || Sim = 1)");
					resposta = input.nextInt();	
					
					if(resposta == 0) {
						querCadastrarEstudante = false;
						contadorEstudante = 0;
					} else {
							querCadastrarEstudante = true;
					}
					
				}
			}
			
			
			if (contadorCidade >=2) {
				System.out.println("Gostaria de cadastrar mais uma cidade? (Nao = digite 0 || Sim = 1)");
				resposta = input.nextInt();	
				
				if(resposta == 0) 
					querCadastrarCidade = false;
					else {
						querCadastrarCidade = true;
				}	
			}		
			
			
		}				
			
	}
		
}
	



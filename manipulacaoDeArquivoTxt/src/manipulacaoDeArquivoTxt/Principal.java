package manipulacaoDeArquivoTxt;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int loop = 1;
		
		while (loop == 1) {
            System.out.println("\nMenu:");
            System.out.println("1 - Inserir nome no arquivo");
            System.out.println("2 - Exibir todos os nomes do arquivo");
            System.out.println("3 - Apagar todo arquivo");
            System.out.print("Escolha uma opção: ");
            int op = teclado.nextInt();
            
            switch(op) {
            case 1:{
            	Opcoes.opcao1();
            	break;
            }
            case 2:{
            	Opcoes.opcao2();
            	break;
            }
            case 3:{
            	Opcoes.opcao3();
            	break;
            }
            default:{
            	System.out.println("Opção inválida");
            	break;
            }
            }
            
            if(loop != 0) {
            	System.out.println("\nDigite '1' para voltar ao menu, ou '0' para encerrar o programa.");
            	loop = teclado.nextInt();
            }
		}
	teclado.close();
	}
}

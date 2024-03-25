package manipulacaoDeArquivoTxt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);
		int loop = 1;
		
		while(loop == 1) {
		
            System.out.println("\nMenu:");
            System.out.println("1 - Inserir nome no arquivo");
            System.out.println("2 - Exibir todos os nomes do arquivo");
            System.out.println("3 - Apagar todo arquivo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int op = teclado.nextInt();
            
            switch(op) {
            case 1:{
            	Path path = Path.of("C:\\Users\\mrobe\\eclipse-workspace\\manipulacaoDeArquivoTxt\\texto.txt");
        		
        		if(Files.notExists(path)) {
        			Files.createFile(path);
        		}
        		
        		Scanner teclado1 = new Scanner(System.in);
        		String texto;
        		
        		System.out.println("Escreva o que você deseja inserir no arquivo: ");
        		texto = teclado1.nextLine();
        		
        		Files.writeString(path, texto);
            	break;
            }
            case 2:{
            	
            	break;
            }
            case 3:{
            	
            	break;
            }
            case 4:{
            	loop = 0;
            	System.out.println("Saindo...");
            	break;
            }
            default:{
            	System.out.println("Opção inválida");
            	break;
            }
            }
            
		}
	teclado.close();
	}

}

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		MinhaString teste;
		char caractere;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a sua frase:");
		teste = new MinhaString(input.nextLine());
		
		System.out.println("Insira o seu caractere:");
		caractere = input.next().charAt(0);
		
		if(teste.indexOf(caractere) >= 0) {
			
			System.out.printf("O primeiro indice do caractere \'%c\' na frase \"%s\": %d.%n%n", caractere, teste, teste.indexOf(caractere));
			
		}else {
			
			System.out.printf("A frase \"%s\" não possui o caractere \'%c\' %n%n", teste, caractere);
			
		}
		
		if(teste.lastIndexOf(caractere) >= 0) {
			
			System.out.printf("O último indice do caractere \'%c\' na frase \"%s\": %d.%n%n", caractere, teste, teste.lastIndexOf(caractere));
			
		}else {
			
			System.out.printf("A frase \"%s\" não possui o caractere \'%c\' %n%n", teste, caractere);
			
		}

	}

}

package vetor;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Quantos nomes serão digitados ?");
		 int qntNomes = sc.nextInt();
		 
		 String name[] = new String[qntNomes];
		 
		 for (int i = 0; i < name.length; i++) {
		 System.out.println("Digite o nome: ");
		 
		 name[i] = sc.next();
		 }
		 for (int i = 0; i < name.length; i++) {
			 System.out.print(name[i] + " ");
			 }
		 }
}

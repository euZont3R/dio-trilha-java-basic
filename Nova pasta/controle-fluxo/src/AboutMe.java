import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = scanner.next();
        
        System.out.println("Digite sua idade: ");
        String idade = scanner.nextInt();
        
        System.out.println("Digite sua altura: ");
        String altura = scanner.nextDouble();

        //imprimindo dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome.touUpperCase() + " " + sobrenome + "cm ");
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " cm ");

        
        
    }
}

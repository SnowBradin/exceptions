import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class TratamentoExceptions {
    public static void main(String[] args) {
        try {
        //criando o objeto scanner
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        //imprimindo os dados do usuário
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();

        //java.lang.NullPointException - quando tentamos obter alguma informação de uma variável nula
        //java.lang.ArithmeticException - quando tentamos dividir um valor por zero
        //java.sql.SQLException - Quando existe algum erro relacionado a interação com banco de dados
        //java.io.FileNotFoundException - quando tentamos ler ou escrever em um arquivo que não existe
        } 
    catch (InputMismatchException e) {
        System.out.println("Os itens idade e altura precisam ser numéricos");
    }
    }
}

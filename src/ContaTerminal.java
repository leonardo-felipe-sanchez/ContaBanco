import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH)) {

            System.out.println("Por favor, digite a agencia!");
            String agencia = scanner.nextLine(); 
            
            System.out.println("Por favor, digite o numero!");
            int numero = scanner.nextInt(); 
            scanner.nextLine();
            System.out.println("Por favor, digite a Nome!");
            String nomeCliente = scanner.nextLine(); 
            
            System.out.println("Por favor, digite o saldo!");
            Double saldo = scanner.nextDouble(); 

            System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
        }
    }
}

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //criando o objet scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.print("Por favor, digite o número da Conta: ");
        int conta = scanner.nextInt();

        System.out.print("Por favor, digite seu saldo disponível: ");
        double saldo = scanner.nextDouble();


            //imprimir dados obtidos pelos usuarios
            System.out.println("Ola, me chamo " + nome + " " );
            System.out.println("O número da minha Agência é: " + agencia );
            System.out.println("O número da minha conta é: " + conta );
            System.out.println("O valor do meu saldo é: " + saldo );

            // Exibindo a mensagem formatada com as informações fornecidas
            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta " + conta + ", e seu saldo: " + saldo + " já está disponível para saque" );
    }
}
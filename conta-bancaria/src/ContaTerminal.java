import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor digite o numero da agencia: ");
        String Agencia = scanner.nextLine();

        System.out.println("Por favor digite o numero da conta: ");
        int NumeroConta = scanner.nextInt();

        System.out.println("Por favor insira o seu nome: ");
        String NomeCliente = scanner.next();

        System.out.println("Por favor insira o saldo: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá "+ NomeCliente + ",obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta " +NumeroConta+" e seu saldo "+saldo+"já está disponível para saque.");

    }
}

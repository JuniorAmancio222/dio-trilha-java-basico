import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência !");
        var agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta !");
        var numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente !");
        var nome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo !");
        var saldo = scanner.nextFloat();

        System.out.println("Olá " + nome +  
        ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + 
        " já está disponível para saque");
        
        scanner.close();

    }

}

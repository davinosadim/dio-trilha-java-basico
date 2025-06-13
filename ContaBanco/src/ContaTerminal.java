
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

             
        var scanner = new Scanner(System.in);
        System.out.println("Por favor, informe o número da conta");
        var conta = scanner.nextInt();
        

        var scanner1 = new Scanner(System.in);
        System.out.println("Insira o número da agência");
        var agencia = scanner1.next();
    

        var scanner2 = new Scanner(System.in);
        System.out.println("Digite seu nome");
        var nome = scanner2.next();
       

        var scanner3 = new Scanner(System.in);
        System.out.println("Digite seu Saldo");
        var saldo = scanner3.nextDouble();
    

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta: %s e seu saldo %s já está disponível para saque", nome, agencia, conta, saldo);

        scanner.close();

    
    }
}

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite o seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.print("Digite o número da sua conta:  ");

        int numeroDaConta = teclado.nextInt();

        System.out.print("Digite o número da sua agência (Ex:067-8): ");
         String agencia = teclado.next();

        System.out.print("Digite o saldo da sua conta: ");
        float saldo = teclado.nextFloat();

        System.out.printf("Olá %s! Obrigado por abrir uma conta em nosso banco. O número da sua conta é: %d sua agência é: %s e seu saldo atual é: R$ %.2f",nome,numeroDaConta,agencia,saldo);
    }
}

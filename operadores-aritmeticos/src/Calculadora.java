import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        String op;
        System.out.println("O que você deseja fazer?\n 1 - Soma\n 2 - Subtração\n 3 - Multiplicação\n 4 - Divisão");
        op = leitor.nextLine();
        float n1;
        float n2;
        switch (op) {
            case "1":
            System.out.println( "Digite o primeiro número da soma");
            n1 = leitor.nextFloat();
            System.out.println( "Digite o segundo número da soma");
            n2 = leitor.nextFloat();
            System.out.printf("Resultado da soma = %.2f",n1+n2);
            break;
            case "2":
            System.out.println( "Digite o primeiro número da subtração");
            n1 = leitor.nextFloat();
            System.out.println( "Digite o segundo número da subtração");
            n2 = leitor.nextFloat();
            System.out.printf("Resultado da subtração = %.2f",n1-n2);
            break;
            case "3":
            System.out.println( "Digite o primeiro número da multiplicação");
            n1 = leitor.nextFloat();
            System.out.println( "Digite o segundo número da multiplicação");
            n2 = leitor.nextFloat();
            System.out.printf("Resultado da multiplicação = %.2f",n1*n2);
            break;
            case "4":
            System.out.println( "Digite o numerador");
            n1 = leitor.nextFloat();
            System.out.println( "Digite o denominador");
            n2 = leitor.nextFloat();
            System.out.printf("Resultado da divisão = %.2f",n1/n2);
            break;

            default:
                break;
        }




    }
}

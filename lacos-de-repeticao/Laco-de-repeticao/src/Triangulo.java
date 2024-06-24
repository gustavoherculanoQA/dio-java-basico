import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numeroLinhas;
        System.out.println("tipo caracter");
        String j = ler.nextLine();
        System.out.println("Quantas linhas?");
        numeroLinhas = ler.nextInt();
      
            for(int i = 1; i<=numeroLinhas;i++){
                for(int k = 1; k<=i;k++){
                    System.out.print(j);
                }
                System.out.println("");
            }
              
        }
    }

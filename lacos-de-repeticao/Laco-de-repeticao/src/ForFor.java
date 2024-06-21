import java.util.Scanner;

public class ForFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número que você deseja saber o fatorial? ");
        int numero = sc.nextInt();
        int fatorial = 1;
        int res;
            for(int j = numero; j>=1;j--){
           fatorial = fatorial * j;
            }
            for(int d = numero; d >1;d--){
                System.out.print(d+"x");
            }
            System.out.println("1 ="+fatorial);
    }
}
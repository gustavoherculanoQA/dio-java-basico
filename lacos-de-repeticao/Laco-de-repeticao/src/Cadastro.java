import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome[] = new String [2];
        String sobrenome[] = new String [2];
        int idade[] = new int[2];
        String sexo[] = new String [2];
        


        for(int i = 0; i<nome.length;i++){
            System.out.println("Digite o seu nome: ");
            nome[i] = ler.next();
            System.out.println("Digite o seu sobrenome: ");
            sobrenome[i] = ler.next();
            System.out.println("Digite a sua idade: ");
            idade[i] = ler.nextInt();
            System.out.println("Digite o seu sexo: ");
            sexo[i] = ler.next();
        }
        System.out.println(" ");
        for(int d = 0 ; d<nome.length;d++){
            System.out.println("Nome: " + nome[d]);
            System.out.println("Sobrenome: "+sobrenome[d]);
            System.out.println("Idade: "+idade[d]);
            System.out.println("Sexo: "+sexo[d]);
            System.out.println(" ");
        }
    }
}

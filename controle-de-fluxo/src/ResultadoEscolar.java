import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nome do Aluno: ");
        String nomeAluno = ler.nextLine();

        System.out.print("Digite a primeira nota do aluno: ");
        float nota1 = ler.nextFloat();

        System.out.print("Digite a 2º nota do aluno: ");
        float nota2 = ler.nextFloat();
        
        System.out.print("Digite a 3º nota do aluno: ");
        float nota3 = ler.nextFloat();

        float media = (nota1+nota2+nota3)/3;

        System.out.printf("Média do aluno = %.2f",media);
        
        System.out.println(" ");
        if(media >= 7 && media <=10){
            System.out.printf("Aluno %s Aprovado",nomeAluno);
        }else if( media >=5 && media <7){
            System.out.printf("Aluno %s está de Avaliação Final",nomeAluno);
        }
        else{
            System.out.printf("Aluno %s está reprovado",nomeAluno);
        }
    }
}


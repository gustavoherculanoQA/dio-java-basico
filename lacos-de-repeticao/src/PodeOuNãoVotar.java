import java.util.Scanner;

public class PodeOuNãoVotar {
   
    public static void main(String[] args) {
        Scanner lei = new Scanner(System.in);
        
    
        System.out.println("Digite o nome da primeira pessoa: ");
        String nomeUm = lei.nextLine();
        System.out.println("Digite a idade do(a) " + nomeUm);
        int idadeUm = lei.nextInt();

        System.out.println("Digite o nome da segunda pessoa: ");
        String nome2 = lei.next();
        System.out.println("Digite a idade do(a) " + nome2);
        int idade2 = lei.nextInt();

        System.out.println("Digite o nome da terceira pessoa: ");
        String nome3 = lei.next();
        System.out.println("Digite a idade do(a) " + nome3);
        int idade3 = lei.nextInt();

       

        if(idadeUm <16){
         System.out.println(nomeUm +" não pode votar pois tem "+idadeUm+  " anos");
        }
            else{
                if(idadeUm >= 16 && idadeUm <18){
                    System.out.println(nomeUm +" tem "+idadeUm+" anos e o voto é opcional.");
                }
                else{
                    if(idadeUm >= 18 && idadeUm <= 70){
                        System.out.println(nomeUm+ " tem "+idadeUm+ " anos e o voto é obrigatório");
                    }else{
                        if(idadeUm > 70){
                            System.out.println(nomeUm + " não precisa votar pois já é maior de 70 anos");
                        }
                    }
                }  

        }

        if(idade2 < 16){
            System.out.println(nome2 + " não pode votar pois tem " +idade2+" anos");
        }   else{
                if(idade2 >= 16 && idade2 <18){
                    System.out.println(nome2+" tem "+ idade2+ " anos e o voto é opcional.");
                }
            }
            if(idade2 >= 18 && idade2 < 70){
                System.out.println(nome2 + " tem" + idade2 + " anos e o voto é obrigatório");
                }else{
                    if(idade2 > 70){
                        System.out.println(nome2 + " não precisa votar pois já é maior de 70 anos");
                    }
                }

        if(idade3 < 16){
            System.out.println(nome3 + " não pode votar pois tem "+idade3+" anos");
        }else{
            if(idade3 >= 16 && idade3 <18){
                System.out.println(nome3 + " tem" +idade3+" anos e o voto é opcional.");
            }
            else{
                if(idade3 >= 18 && idade3 <70){
                    System.out.println(nome3 + " tem " +idade3+" anos e o voto é obrigatório");
                
                }
                
            }
                if(idade3> 70){
                    System.out.println(nome3+ " não precisa votar pois já é maior de 70 anos");
                }
        } 
    }
}   

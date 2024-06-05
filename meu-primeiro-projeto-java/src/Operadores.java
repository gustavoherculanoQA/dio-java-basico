public class Operadores {
    public static void main (String[]args){

        String concatenacao = "PROGRAMA" + "JAVA";

        System.out.println(concatenacao);

        concatenacao = 1 + 1 +" + 1" ;

        System.out.println(concatenacao);
        
        //somando números | subtraindo

        byte numeroUm = 1;
        byte numeroDois = 2;
        byte soma;

        soma = (byte) (numeroUm + numeroDois);

        System.out.println(soma);

        // multiplicando numeros | dividindo

        int n1 = 3;
        int n2 = 7;
        int mult;
        mult = n1 * n2;
        System.out.println(mult);

        // operador logico 

        boolean var = true;
            //primeiro negando 
            System.out.println(!var);
            //Não há mudança 
            System.out.println(var);
            // há mudança
            var = !var;
            System.out.println(var);


    }
    
}

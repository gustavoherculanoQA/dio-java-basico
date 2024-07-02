public class App {
    public static void main(String[] args) {
        //Enviando por parametro
        Carro carro1 = new Carro("Azul", "Compass", "SUV", 2.0, "Diesel");
        carro1.status();
        System.out.println("\n");

        //Usando o método Construtor
        Carro carro2 = new Carro(null, null, null, 0, null);
        carro2.status();
        System.out.println("\n");
        
        //Enviando pelo método set
        Carro carro3 = new Carro(null, null, null, 0, null);
        carro3.setCombustivel("Gasolina");
        carro3.setCor("Branco");
        carro3.setModelo("Corolla");
        carro3.setTipo("Sedan");
        carro3.setMotor(2.0);
        carro3.status();
    }
    
}

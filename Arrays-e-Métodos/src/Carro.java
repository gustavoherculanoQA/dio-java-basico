public class Carro {

    public String cor;
    public String modelo;
    public String tipo;
    public double motor;
    public String combustivel;

    public Carro (String c, String m, String t, double mo,String co) {
        this.cor = "Amarelo";
        this.modelo = "Renegade";
        this.tipo = "SUV";
        this.motor = 2.0;
        this.combustivel = "Diesel";  
    }
    public void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Motor: "+this.motor);
        System.out.println("Combustível: "+this.combustivel);
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getMotor() {
        return motor;
    }
    public void setMotor(double motor) {
        this.motor = motor;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
     
    

}

public class SmartTv {
    boolean ligada = false;
    int canal = 10;
    int volume = 25;

    public void aumentarVolume(){
         volume++;
    }
    public void baixarVolume(){
        volume--;
   }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;   
    }
}

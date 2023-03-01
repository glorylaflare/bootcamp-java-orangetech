public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // Métodos
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Reduzido o volume para: " + volume);
    }

    public void proxCanal() {
        canal++;
    }

    public void voltaCanal() {
        canal--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
}

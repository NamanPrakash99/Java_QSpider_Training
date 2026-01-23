package Encapsulation;

public class Task4 {

    private double volume;

    public void setVolume(double volume) {
        if (volume > 0 && volume<100) {
            this.volume = volume;
        }
    }

    public double getVolume() {
        return volume;
    }

    public static void main(String[] args) {
       
    }
}
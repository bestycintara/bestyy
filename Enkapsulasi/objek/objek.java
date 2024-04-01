package objek;
import enkapsulasi.kelas;

public class objek {
     public static void main(String[] args) {
        kelas LCD = new kelas();
        LCD.setTurnon();
        LCD.setVolume();
        LCD.setVolumeUp();
        LCD.setBrightness();
        LCD.setBrightnessDown();
        LCD.setCable(kelas.cableType.HDMI);
        LCD.Display();
    }

}
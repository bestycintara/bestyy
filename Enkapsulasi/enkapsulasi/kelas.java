package enkapsulasi;

import java.util.Scanner;

public class kelas {

    private String Status; 
    private int Volume;
    private int Brightness;
    private String Cable;
     
     public kelas () {
        this.Status = "off";
        this.Volume = 50;
        this.Brightness = 30;
        this.Cable = "None";
    }

    // LCD Status //
    public void setTurnoff (){
        this.Status = "off";
    }
    public void setTurnon (){
        this.Status = "on";
    }
    public void setfreeze (){
        this.Status = "freeze";
    }

    // LCD Volume //
    public void setVolume (){
        Scanner input = new Scanner(System.in);
        System.out.println("input Volume : ");
        Volume = input.nextInt();

        if (this.Volume >= 0 && this.Volume <= 100){
            this.Volume = Volume;
        } else {
            System.out.println("please set your Volume between 0 - 100");
        }
    }
    public void setVolumeUp (){
        if (this.Status.equalsIgnoreCase("on")){
            this.Volume ++;
        }
    }
    public void setVolumeDown (){
        if (this.Status.equalsIgnoreCase("on")){
            this.Volume --;
        }
    }
    
    // LCD Brightness //
    public void setBrightness (){
        Scanner input = new Scanner(System.in);
        System.out.println("input Brightness : ");
        Brightness = input.nextInt();

        if (this.Brightness >= 0 && this.Brightness <= 100){
            this.Brightness = Brightness;
        } else {
            System.out.println("please set your Brightness between 0 - 100");
        }
    }
    public void setBrightnessUp (){
        if (this.Status.equalsIgnoreCase("on")){
            this.Brightness ++;
        }
    }
    public void setBrightnessDown (){
        if (this.Status.equalsIgnoreCase("on")){
            this.Brightness --;
        }
    }

    // LCD Cable //
    public enum cableType {
        HDMI, VGA, DVI, DisplayPort;
    }
    public void setCable (cableType kabel) {
        this.Cable = kabel.name();
    }

    // Display System //
    public void Display (){
        System.out.println("LCD Status: " + this.Status);
        System.out.println("Volume: " + this.Volume);
        System.out.println("Brightness: " + this.Brightness);
        System.out.println("Cable: " + this.Cable);
    }

}
package Secundary;

import java.util.Random;

public class Dogs {
    private int emotion;
    private int limit;

    public Dogs(){
        Random rand= new Random();
        emotion = rand.nextInt(10)-5;
        limit= rand.nextInt(20)*-1;
    }

    public int getEmotion() {
        return emotion;
    }

    public void setEmotion(int emotion) {
        this.emotion = emotion;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void bite(){
        System.out.println("El perro se siente amenazado, ha mordido a la persona");
    }

    public void bark(){
        System.out.println("El perro se siente en peligro, esta ladrando");
    }

    public void move_tail(){
        System.out.println("El perro se siente feliz, esta moviendo la cola");
    }
}

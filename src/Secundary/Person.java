package Secundary;


import java.util.Random;
/*
datos necesarios:
trust = la confianza inicial que tendra el/la voluntari@
cookie= el estado de la galleta(cuando la tiene y cuando ya no la tiene)
 */
public class Person {
    private int trust;
    private boolean cookie;

    public Person(){
        Random rand= new Random();
        trust= rand.nextInt(9)+1;
        cookie= true;
    }

    public int getTrust() {
        return trust;
    }

    public void setTrust(int trust) {
        this.trust = trust;
    }

    public boolean isCookie() {
        return cookie;
    }

    public void setCookie(boolean cookie) {
        this.cookie = cookie;
    }

//la persona rie al ver al perro feliz
    public void laugh(){
        System.out.println("La persona voluntaria esta riendo");
    }

    //la persona se asusta cuando el perro ladra
    public void scared(){
        System.out.println("La persona voluntaria se ha asustado");
    }

//la persona llora cuando el perro la muerde
    public void hurt(){
        System.out.println("La persona voluntaria ha sido herida, esta llorando");
    }

    public void quit(){
        System.out.println("La persona ha renunciado a su puesto de voluntariado");
    }
}

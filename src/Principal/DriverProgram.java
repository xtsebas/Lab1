package Principal;
import Secundary.Dogs;
import Secundary.Person;

import java.lang.ref.Cleaner;
import java.util.Scanner;


public class DriverProgram {
    public static void main(String[] args) {
        int opcion=0;
        int seguir=1;

        System.out.println("Bienvenido al entrenamiento de voluntarios de la perrera");
        while (seguir==1){
            System.out.println("1. Nueva persona \n2. Nuevo Perro \n3. Sacar Galleta \n4. Interactuar \n5. Salir \nOpcion:");
            Scanner scan= new Scanner(System.in);
            opcion=scan.nextInt();
            if (opcion==1){
                newperson();
            } else if (opcion==2) {
                newdog();
            } else if (opcion==3) {
                givecookie(newperson());
            } else if (opcion==4) {
                movementofDog(newperson(), newdog());
            } else if (opcion==5) {
                System.out.println("Gracias por utilizar nuestro programa de entrenamiento");
                break;
            }else {
                System.out.println("Elija una de las opciones del programa");
            }
        }
    }

    public static void Show_Person(Person persona) {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Persona:");
        System.out.println("Confianza: " + persona.getTrust());
        System.out.println("Galleta: " + persona.isCookie());
        System.out.println("-----------------------------------------------------------------------");
    }

    public static void Show_Dog(Dogs perro) {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Perro:");
        System.out.println("Estado de animo: " + perro.getEmotion());
        System.out.println("Limite de estado de animo: " + perro.getLimit());
        System.out.println("-----------------------------------------------------------------------");
    }

    public static Person newperson() {
        Person person = new Person();
        Show_Person(person);
        return person;
    }

    public static Dogs newdog() {
        Dogs dog = new Dogs();
        Show_Dog(dog);
        return dog;
    }

    public static int givecookie(Person person) {
        if (person.isCookie()) {
            System.out.println("La persona voluntaria le ha dado la galleta al perro");
            return 5;
        } else {
            System.out.println("La persona voluntaria ya ha usado su unica galleta.");
            return 0;
        }
    }

    public static void movementofDog(Person person, Dogs dog) {
        if (dog.getEmotion() < dog.getLimit()) {
            dog.bite();
            person.hurt();
            person.setTrust(person.getTrust() - 5);
            if (person.getTrust() < 0) {
                person.quit();
                Show_Person(person);
                Show_Dog(dog);
            } else {
                person.hurt();
                Show_Person(person);
                Show_Dog(dog);
            }
        }

        if ((dog.getEmotion() < 0) && (dog.getEmotion() > dog.getLimit())) {
            dog.bark();
            person.scared();
            person.setTrust(person.getTrust() - 5);
            if (person.getTrust() < 0) {
                person.quit();
                Show_Person(person);
                Show_Dog(dog);
            }
        }

        if (dog.getEmotion()>0){
            dog.move_tail();
            person.laugh();
            Show_Person(person);
            Show_Dog(dog);
        }
    }
}

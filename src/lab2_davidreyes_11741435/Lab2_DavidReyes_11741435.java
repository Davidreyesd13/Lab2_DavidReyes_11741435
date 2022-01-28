package lab2_davidreyes_11741435;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_DavidReyes_11741435 {

    public static void main(String[] args) {
        Animal cl = new Animal();
        Scanner sc = new Scanner(System.in);
        int opcion;
        ArrayList lista = new ArrayList();
        lista.add(new Animal("Pantera", "Pantera", "Selva", "Serpiente", "Peluda,pelo negro,ojos amarillos", "Amazonas", 100));
        lista.add(new Animal("Cocodrilo", "Cocodrilo", "selva", "Pantera", "Tiene cara blanca", "Amazonas", 250));
        lista.add(new Animal("Serpiente", "serpiente de rio", "Selva", "Mono", "Se arrastran", "Amazonas", 75));
        while (true) {
            System.out.println("1.Crear animal\n2.Listar animales\n3.Eliminar animales\n4.Modificar animales\n5.Alimentar animales\n0.Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre cientifico");
                    String nombrec = sc.next();
                    System.out.println("Ingrese el nombre comun");
                    String nombrecomun=sc.next();
                    System.out.println("Ingrese el habitad ");
                    String habitad=sc.next();
                    System.out.println("Ingrese el alimento");
                    String comida=sc.next();
                    System.out.println("Ingrese descripcion de rasgos");
                    String descrip=sc.next();
                    System.out.println("Ingrese la ubicacion geografica");
                    String geo = sc.next();
                    System.out.println("Ingrese la cantidad de vida");
                    int vida = sc.nextInt();
                    lista.add(new Animal(nombrec, nombrec, habitad, habitad, descrip, geo, vida));
                    System.out.println("Animal agregado");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    
                    break;
                case 0:
                   System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }

    }

}

package lab2_davidreyes_11741435;

import java.util.ArrayList;
import java.util.Scanner;
import javax.sound.sampled.Clip;
import sun.security.util.AlgorithmDecomposer;

public class Lab2_DavidReyes_11741435 {

    public static void main(String[] args) {
        Animal al = new Animal();
        Scanner sc = new Scanner(System.in);
        int opcion;
        ArrayList lista = new ArrayList();
        lista.add(new Animal("pantera", "Pantera", "Selva", "Serpiente", "Peluda,pelo negro,ojos amarillos", "Amazonas", 100));
        lista.add(new Animal("cocodrilo", "Cocodrilo", "selva", "Pantera", "Tiene cara blanca", "Amazonas", 250));
        lista.add(new Animal("serpiente", "serpiente de rio", "Selva", "Mono", "Se arrastran", "Amazonas", 75));
        while (true) {
            System.out.println("1.Crear animal\n2.Listar animales\n3.Eliminar animales\n4.Modificar animales\n5.Alimentar animales\n0.Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre cientifico");
                    String nombrec = sc.next();
                    nombrec = nombrec.toLowerCase();
                    for (Object x : lista) {
                        if (x instanceof Animal) {
                            if (((Animal) x).nombrec.contentEquals(nombrec)) {
                                System.out.println("Ingrese el nombre cientifico");
                                nombrec = sc.next();
                            }
                        }
                    }
                    System.out.println("Ingrese el nombre comun");
                    String nombrecomun = sc.next();
                    System.out.println("Ingrese el habitad ");
                    String habitad = sc.next();
                    System.out.println("Ingrese el alimento");
                    String comida = sc.next();
                    System.out.println("Ingrese descripcion de rasgos");
                    String descrip = sc.next();
                    System.out.println("Ingrese la ubicacion geografica");
                    String geo = sc.next();
                    System.out.println("Ingrese la cantidad de vida");
                    int vida = sc.nextInt();
                    while (vida <= 0) {
                        System.out.println("Ingrese la cantida de vida");
                        vida = sc.nextInt();
                    }
                    lista.add(new Animal(nombrec, nombrec, habitad, habitad, descrip, geo, vida));
                    System.out.println("Animal agregado");
                    break;
                case 2:

                    System.out.println("1.mostrar lista completa\n2.imprimir por nombre cientifico");
                    int imp = sc.nextInt();
                    switch (imp) {
                        case 1:
                            for (Object x : lista) {
                                System.out.println(lista.indexOf(x) + "." + x);
                            }
                            break;
                        case 2:
                            for (Object x : lista) {
                                if (x instanceof Animal) {
                                    System.out.println(lista.indexOf(x) + "." + ((Animal) x).nombrec);
                                }
                            }
                            break;
                        default:

                            System.out.println("Opcion no valida");
                    }

                    break;
                case 3:
                    for (Object x : lista) {
                        System.out.println(lista.indexOf(x) + "." + x);
                    }
                    break;
                case 4:
                    for (Object x : lista) {
                        if (x instanceof Animal) {
                            System.out.println(((Animal) x).nombrec+".");
                        }
                    }
                    System.out.println("Ingrese el animal que va a eliminar");
                    String enc = sc.next();
                    
                    break;
                case 5:
                    for (Object x : lista) {
                        System.out.println(lista.indexOf(x) + "." + x);
                    }
                    System.out.println("Que animal desea alimentar");
                    int pos=sc.nextInt();
                    System.out.println("Animal que desea sacrificar");
                    int posa=sc.nextInt();
                    ((Animal)lista.get(pos)).setVida(((Animal)lista.get(pos)).getVida()+((Animal)lista.get(posa)).getVida());
                    lista.remove(posa);
                    System.out.println(((Animal)lista.get(pos)).nombrec+" Fue Alimentado");
                    for (Object object : lista) {
                        System.out.println(lista.indexOf(object)+"."+object);
                    }
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

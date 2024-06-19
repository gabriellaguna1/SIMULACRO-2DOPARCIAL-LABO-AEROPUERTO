import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException, CustomException {

        GestionDeAeropuerto g= new GestionDeAeropuerto();
        g.mostrarAeropuertos();

        System.out.println("EJERCICIO 2");
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese capacidad: ");
        Integer cap= sc.nextInt();
        g.pasarAListaConCapacidadX(cap);
        for(Aeropuerto a: g.getAeropuertoXCapacidad()){
            System.out.println(a);
        }
        System.out.println("EJERCICIO 3");
        ClaseGenerica<String> cg= new ClaseGenerica<>();

        for(Aeropuerto a: g.getListaDeAeropuertos()){
            for(Avion av: a.getAviones()){
                cg.adherirTipo(av.getPiloto());
            }
        }
        ClaseGenerica<String>cd= new ClaseGenerica<>();
        for(Aeropuerto a: g.getListaDeAeropuertos()){
            for (String etiqueta: a.getEtiquetas()){
                cd.adherirTipo(etiqueta);
              }
        }

        System.out.println("MOSTRANDO TANTO PILOTOS COMO ETIQUETAS");
        for(String s: cg.getPilotosYTags()){
            System.out.println(s);
        }
        for(String s: cd.getPilotosYTags()){
            System.out.println(s);
        }

        System.out.println("/n");
        System.out.println("/n");
        System.out.println("/n");
        System.out.println("/n");

        System.out.println("EJERCICIO 4");

        Set<String>set= new HashSet<>();

        for(String s: cd.pilotosYTags){
            set.add(s);
        }

        System.out.println("MOSTRAR HASHSET");
        for(String s: set){
            System.out.println(s);
        }


    }
}
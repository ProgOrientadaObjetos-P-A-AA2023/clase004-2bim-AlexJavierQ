/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Ciudad c1 = new Ciudad("Loja");
        Ciudad c2 = new Ciudad("Cuenca");
        Persona p1 = new Persona("Alex", 18, c1);
        Persona p2 = new Persona("Jean", 19, c2);

        OperacionesEstudiantes op1 = new OperacionesEstudiantes();
        ArrayList<Persona> miLista = new ArrayList<>();
        miLista.add(p1);
        miLista.add(p2);
        op1.establecerEstudiante(miLista);
        op1.obtenerPromedioEdades();

  
        System.out.printf("%.2f\n" + "", op1.obtenerPromedioEdades());
        System.out.printf("Reporte del Programa\n"
                + "Nomrbre p1: %s\n" + "Nombre p2: %s\n"
                + "Edad p1: %d\n" + "Edad p2: %d\n"
                + "Promedio de Edades: %.2f\n"
                + "Edad Minima: %.2f\n"
                + "Edad Maxima: %.2f\n"
                + "Lista de Ciudades: %S\n",
                p1.obtenerNombre(),
                p2.obtenerNombre(),
                p1.obtenerEdad(),
                p2.obtenerEdad(),
                op1.obtenerPromedioEdades(),
                op1.obtenerEdadMinima(),
                op1.obtenerEdadMaxima(),
                op1.obtenerListaCiudadesEstudiantes());
    }
}

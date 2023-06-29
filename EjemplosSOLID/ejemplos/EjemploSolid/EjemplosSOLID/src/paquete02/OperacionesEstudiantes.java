/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private double edadminima;
    private int edadmaxima;
    private String listaCiudadesEstudiantes;

    public String obtenerListaCiudadesEstudiantes() {
        return listaCiudadesEstudiantes;
    }

    public double obtenerEdadMinima() {
        return edadminima;
    }

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();

        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public double obtenerPromedioEdades() {

        return promedioEdades;
    }

    public double obtenerEdadMaxima() {

        return edadmaxima;
    }

    public void establecerEdadminima() {
        edadminima = estudiantes.get(0).obtenerEdad();
        for (Persona e : estudiantes) {
            int edadActual = e.obtenerEdad();
            if (edadActual < edadminima) {
                edadminima = edadActual;
            }

        }
    }

    public void establecerEdadMaxima() {
        edadmaxima = estudiantes.get(0).obtenerEdad();
        for (Persona e : estudiantes) {
            int edadActual = e.obtenerEdad();
            if (edadActual > edadmaxima) {
                edadmaxima = edadActual;
            }
        }
    }

    public void establecerListaCiudadesEstudiantes() {
        String mensaje = " ";
        for (Persona e : estudiantes){
        mensaje = mensaje + e.obetnerCiudad().obtenerCiudad();
        }
        listaCiudadesEstudiantes = mensaje;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author alexj
 */
public class TransporteTransvia {

    private String cooperativaTransvia;
    public double tarifa;

    public void establecerCooperativaTransvia(String n) {
        cooperativaTransvia = n;
    }

    public void establecerTarifa() {
        tarifa = 20 + 0.10;
    }

    public String obtenerCooperativaAereo() {
        return cooperativaTransvia;
    }

    public double obtenerTarifa() {
        return tarifa;
    }
}

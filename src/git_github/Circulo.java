/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_github;

import java.util.ArrayList;

/**
 * Ejemplo: círculos.
 *
 * @author fperalta
 * @version 21-02-2025
 */
public class Circulo {

    /**
     * coordenada x del centro del círculo
     */
    private double centroX;
    /**
     * coordenada x del centro del círculo
     */
    private double centroY;
    /**
     * coordenada x del centro del círculo
     */
    private double radio;

    /**
     * Constructor.
     *
     * @param x centro: coordenada X.
     * @param y centro: coordenada Y.
     * @param r radio.
     */
    public Circulo(double x, double y, double r) {
        centroX = x;
        centroY = y;
        radio = r;
    }

    /**
     * Getter.
     *
     * @return centro: coordenada X.
     * 
     */
    public double getCentroX() {
        return centroX;
    }

    /**
     * Calcula la longitud de la circunferencia (perímetro del círculo).
     *
     * @return perímetro.
     */
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    /**
     * Desplaza el círculo a otro lugar.
     *
     * @param despX movimiento en el eje X.
     * @param despY movimiento en el eje Y.
     */
    public void mueve(double despX, double despY) {
        centroX = centroX + despX;
        centroY = centroY + despY;
    }
}


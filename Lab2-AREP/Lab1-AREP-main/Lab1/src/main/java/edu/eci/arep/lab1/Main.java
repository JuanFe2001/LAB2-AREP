/*
 * Clase principal para iniciar la aplicación del servidor de películas.
 */
package edu.eci.arep.lab1;

import java.io.IOException;

import edu.eci.arep.lab1.Server.MovieServer;

import com.google.gson.*;

/**
 * Clase principal para iniciar la aplicación del servidor de películas.
 * 
 * @author Juan Felipe Vivas
 */
import edu.eci.arep.lab1.Server.MovieServer;

import java.io.IOException;

/**
 * Clase principal para iniciar el servidor de películas.
 * 
 * @author Juan Felipe Vivas
 */
public class Main {

    /**
     * Constructor por defecto de la clase Main.
     */
    public Main() {
         
    }

    /**
     * Método principal para iniciar la aplicación.
     * 
     * @param args argumentos para iniciar la aplicación
     */
    public static void main(String[] args) {
        try {
            MovieServer.startServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

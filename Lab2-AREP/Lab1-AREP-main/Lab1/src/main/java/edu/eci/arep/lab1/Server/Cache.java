/*
 * Clase para la gestión de la caché de películas
 */
package edu.eci.arep.lab1.Server;

import java.util.concurrent.ConcurrentHashMap;
import com.google.gson.*;

/**
 * Clase para gestionar la caché de películas.
 * 
 * @author Juan Felipe Vivas Manrique
 */
public class Cache {
    private ConcurrentHashMap<String, JsonObject> movieCache;
    private static Cache cache = null;

    /**
     * Constructor de la clase Cache.
     */
    public Cache(){
        movieCache = new ConcurrentHashMap<String, JsonObject>();
    }

    /**
     * Método que retorna la instancia de la clase Cache.
     * 
     * @return la instancia actual de la caché
     */
    public static Cache getInstance(){
        if(cache == null){
            cache = new Cache();
        }

        return cache;
    }

    /**
     * Método que retorna la información de una película desde la caché.
     * 
     * @param name nombre de la película a buscar
     * @return todos los datos de la película
     */
    public JsonObject getMovie(String name){
        return movieCache.get(name);
    }

    /**
     * Método que verifica si una película está en la caché.
     * 
     * @param name nombre de la película a buscar en la caché
     * @return un booleano que indica si la película está en la caché
     */
    public boolean movieInCache(String name){
        return movieCache.containsKey(name);
    }

    /**
     * Agrega una consulta de una película a la caché.
     * 
     * @param name nombre de la película
     * @param movieInfo información JSON sobre la película
     */
    public void addMovieToCache(String name, JsonObject movieInfo){
        movieCache.putIfAbsent(name, movieInfo);
    }
}

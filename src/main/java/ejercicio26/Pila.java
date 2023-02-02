/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio26;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Crear una clase pila genérica que almacene cualquier tipo de dato
 */
public class Pila<T> {
    
    private List<T> lista;
    private int tamanio;
    
    public Pila(int tamanio){
        this.tamanio = Math.abs(tamanio);
        
        this.lista = new ArrayList<>(this.tamanio);
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
    public void push(T objeto){
        if (lista.size() < this.tamanio) {
            this.lista.add(objeto);
        }
    }
    
    public void pop(){
        this.lista.remove(lista.get(lista.size() - 1));
    }
    
    //Saber si la lista está vacía
    public boolean estaVacia(){
        return this.lista.isEmpty();
    }
    
    //Saber si la lista está llena
    public boolean estaLlena(){
        return lista.size() == this.tamanio;
    }
    
    public int numeroElementos(){
        return this.lista.size();
    }
    
    public void mostrarElementos(){
        
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.println(lista.get(i));
        }
    }
    
    public Pila rellenarConArray(T[] array){
        this.lista.clear();
        Pila aux = new Pila(array.length);
        
        for (int i = 0; i < array.length; i++) {
            aux.push(array[1]);
        }
        
        return aux;
    }
    
    //Saca los elementos de la pila y los devuelve en un array de T
    //Después de queda vacía
    public T[] sacarElementos(){
        T[] aux = (T[]) this.lista.toArray();
        this.lista.clear();
        
        return aux;
    }
}

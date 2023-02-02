/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio26;

/**
 *
 * @author alejandro
 */
public class Main {
    public static void main(String[] args) {
        
        Pila pila = new Pila(4);
        pila.push("Tortuga mediterránea");
        pila.push("Tortuga de orejas rojas");
        pila.push("Tortuga Laúd");
        pila.push("Tortuga rusa");
        pila.push("Tortuga caimán"); //no se añade ya que la pila está llena
        
        pila.mostrarElementos();
        
        System.out.println("--------------------------------");
        System.out.println("Borrar un objeto de la pila:");
        System.out.println("");
        pila.pop();
        pila.mostrarElementos();
        
        System.out.println("--------------------------------");
        System.out.println("¿La pila está vacía?: " + pila.estaVacia());
        
        System.out.println("--------------------------------");
        System.out.println("¿La pila está llena?: " + pila.estaLlena());
        
        System.out.println("--------------------------------");
        System.out.println("Número de elementos: " + pila.numeroElementos());
        
        System.out.println("--------------------------------");
        Integer[] auxiliar = {1, 2, 3, 4, 5};
        pila.rellenarConArray(auxiliar);
        pila.mostrarElementos();
    }
}

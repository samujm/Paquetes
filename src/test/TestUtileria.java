
package test;

//import mx.com.globalmentoring.Utileria;

//Importar todas las clases de ese paquete, no se carga la memoria, las clases se cargan en memoria cuando se utilizan
//import mx.com.globalmentoring.*;

//Exportar el metodo statico de la clase

import static mx.com.globalmentoring.Utileria.imprimir; //paquete.clase.metodo;

public class TestUtileria {
    public static void main(String[] args) {
        //Utileria.imprimir("Saludos");
        imprimir("Adios"); //Ctrl + clic para acceder a la definición de ese metodo para saber que es un metodo statico
        
        //nombre completamente calificado
        //no se ocupa import pero debe estar todo el nombre
        mx.com.globalmentoring.Utileria.imprimir("adios"); //anteponer el nombre de la clase, NO ES MUY RECOMENDABLE UTILIZARLO
        
    }
} 
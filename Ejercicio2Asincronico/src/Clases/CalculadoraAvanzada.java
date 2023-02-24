
package Clases;

import java.util.Scanner;

public class CalculadoraAvanzada {
    //Atributos

    int numero1;
    int numero2;
    int factorial = 1;
    int potencia;

    //Metodos
    public void leerNumeros() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite su numero factorial: ");
        numero1 = leer.nextInt();
        System.out.println("Digite la potencia  a la que sera elevada: ");
        numero2 = leer.nextInt();
    }
    public void factorial(){
        for(int i = 1; i<=numero1; i++){
            factorial = factorial * i;
        }
    }
    
    public void MostrarResultados(){
        System.out.println("El factorial de: "+numero1+" Es: " + factorial);
        System.out.println("La potencia del primer numero es: "+ Math.pow(numero1,numero2));
    }
}

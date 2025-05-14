import java.util.Scanner;

//Creo la clase ParImpar y le aplico la estructura main para ejecutar el programa
public class ParImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Crea un objeto scanner para leer datos desde el teclado (System.in).
        System.out.println("Ingresa número");//pedir número
//next int: leer número
        int numero = scanner.nextInt();
// % es el operador módulo, devuelve el residuo de una división.
        if (numero % 2 == 0) {
//Si numero % 2 == 0, entonces es par (sin residuo).
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
//Si no, es impar.
        scanner.close();
//Cierra el objeto scanner para liberar recursos.
    }
}
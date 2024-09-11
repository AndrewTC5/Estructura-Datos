package ActividadArreglos;

import java.util.Arrays;
import java.util.Scanner;

public class Arreglo {

    //Concatenar 2 Arreglos
    public void concatenar() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] result = new int[arr1.length + arr2.length];

        System.out.println("Arreglo 1: " + Arrays.toString(arr1));
        System.out.println("Arreglo 2: " + Arrays.toString(arr2));


        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        System.out.println("\nArreglo 3: " + Arrays.toString(result));

    }

    //Promediar numeros
    public void promedio(){
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[10];
        int suma=0;
        float promedio;
        for (int i = 0; i < numero.length; i++) {
            System.out.println("\nIngrese un valor: ");
            numero[i] = sc.nextInt();

            suma += numero[i];
        }
        promedio = (float) suma /numero.length;
        System.out.println("\nEl promedio es: " + promedio);
    }

    //Encontrar un valor dentro de un arreglo
    public void encontrar(){
        Scanner sc = new Scanner(System.in);
        int[] numero = {23, 5, 67, 7, 8, 10, 34, 6, 9, 28};
        boolean encontrado = false;
        int posicion = -1;

        System.out.println("\nIngrese el valor que quieres buscar: ");
        int valor = sc.nextInt();

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] == valor) {
                encontrado = true;
                posicion = i;
            }
        }
        if (encontrado) {
            System.out.println("\nEl numero " + valor + " se en encuentra en la posición " + posicion+1);
        } else {
            System.out.println("Valor no encontrado");
        }
    }

    //Mayusculas y minusculas de una cadena
        public void manMin() {
            Scanner entrada = new Scanner(System.in);
            String cadena = "\nHola Compañeros";

            System.out.println("\n¿Quiere convertir a mayúsculas (M) o minúsculas (m): ");
            char op = entrada.nextLine().charAt(0);
            if (op == 'M'|| op == 'm') {
                cadena = (op == 'M') ? cadena.toUpperCase() : cadena.toLowerCase();
                System.out.println("\nCadena convertida : " + cadena);
            } else {
                System.out.println("Elija 'M' o 'm'");
            }

        }

        //Numeros primos de una cadena
    public void primo() {
        Scanner sc = new Scanner(System.in);
        byte numero;
        byte i= 1;
        byte divisiones = 0;
        System.out.print("\nIntroduzca un número: ");
        numero = sc.nextByte();
        while (i <= numero) {
            if (numero % i == 0) {
                divisiones++;
            }
            i++;
        }
        if (divisiones == 2) {
            System.out.println("El número " + numero + " es primo");
        }else{
            System.out.println("El número " + numero + " no es primo");
        }
    }

    //Calcular el factorial de un numero
    public  void factorial() {
        Scanner sc = new Scanner(System.in);
        long factorial;
        int numero;
        System.out.print("\nIntroduzca un número: ");
        numero = sc.nextInt();
        factorial = 1;
        for (int i = numero; i >0; i--) {
            factorial= factorial * i;
        }
        System.out.println("\nEl factorial de "+ numero +" es " + factorial);
    }

    //Imprimir los numeros "n"
    public void naturales() {
        byte i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    //Arreglo invertido
    public void invertirArreglo() {
        int[] numeros ={2, 4, 6, 5, 6, 6, 8, 9};

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        for (int i = 0; i < numeros.length / 2; i++) {
            int temporal = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temporal;
        }
        System.out.println("\nArreglo invertida");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }

    //Dato maximo y minimo de un arreglo de numeros
    public void mm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de digitos a analizar:");
        int numeroDigitos = sc.nextInt();
        int[] arreglo = new int[numeroDigitos];
        int maximo = arreglo[0];
        int minimo = arreglo[0];
        for (int i = 0; i < numeroDigitos; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ":");
            arreglo[i] = sc.nextInt();
        }

        for (int i = 0; i < numeroDigitos; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }
        for (int i = 0; i < numeroDigitos; i++) {
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];

            }
        }
        System.out.println("El maximo es: " + maximo);
        System.out.println("El minimo es: " + minimo);
    }

    //Ascendencia o descendencia de un arreglo
    public void ascdesc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos dígitos se analizarán?");
        int digitos = sc.nextInt();

        if (digitos <= 0) {
            System.out.println("Por favor, ingrese un número positivo de dígitos.");
            return;
        }

        int[] arreglo = new int[digitos];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Digite el número " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt();
        }

        boolean ascendiente = true;
        boolean descendente = true;

        for (int i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] < arreglo[i + 1]) {
                descendente = false;
            } else if (arreglo[i] > arreglo[i + 1]) {
                ascendiente = false;
            }
        }
        if (ascendiente) {
            System.out.println("Los números están en orden ascendente.");
        } else if (descendente) {
            System.out.println("Los números están en orden descendente.");
        } else {
            System.out.println("Los números no están en orden ascendente ni descendente.");
        }

        sc.close();
    }

}

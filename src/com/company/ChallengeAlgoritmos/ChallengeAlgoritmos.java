package com.company.ChallengeAlgoritmos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChallengeAlgoritmos {
    static Scanner sc = new Scanner(System.in);

    public static void ejecutarChallengeAlgoritmos(){
        System.out.println("BIENVENIDO AL CHALLENGE DE ALGORITMOS");
        char rsa = 's';
        do{
            System.out.println("Que ejercicio desea Consultar? (1 al 5)");
            int rta = sc.nextInt();
            ejecutarMenuAlgoritmo(rta);
            System.out.println("Desearia probar otro ejercicio? s/n");
            rsa = sc.next().charAt(0);
        }while(rsa =='s');
    }

    public static void ejecutarMenuAlgoritmo(int rta){
        switch(rta){
            case 1:
                System.out.println("1. Pide un número por teclado e indica si es un número primo o no. Un número primo es\n" +
                        "aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que\n" +
                        "25 es divisible entre 5, sin embargo, 17 si es primo.");
                ej1();
                break;
            case 2:
                System.out.println("2. Escribe una aplicación que solicite al usuario que ingrese una contraseña cualquiera.\n" +
                        "Después se le pedirá que ingrese nuevamente la contraseña, con 3 intentos. Cuando\n" +
                        "acierte ya no pedirá más la contraseña y mostrará un mensaje diciendo “Felicitaciones,\n" +
                        "recordás tu contraseña”. Si falla luego de 3 intentos se mostrará el mensaje “Tenes que\n" +
                        "ejercitar la memoria”. Los mensajes quedarán en pantalla a la espera que el usuario\n" +
                        "presione una tecla, luego de esto se cerrará el programa.");
                ej2();
                break;
            case 3:
                System.out.println("3. Por teclado se ingresa el valor hora de un empleado. Posteriormente se ingresa el\n" +
                        "nombre del empleado, la antigüedad y la cantidad de horas trabajadas en el mes. Se\n" +
                        "pide calcular el importe a cobrar teniendo en cuenta que al total que resulta de\n" +
                        "multiplicar el valor hora por la cantidad de horas trabajadas. Además, si el empleado\n" +
                        "tiene más de 10 años de antigüedad hay que sumarle la cantidad de años trabajados\n" +
                        "multiplicados por $30. Imprimir en pantalla el nombre, la antigüedad y el total a cobrar.");
                ej3();
                break;
            case 4:
                System.out.println("4. Generar un número aleatorio comprendido entre 0 y 1000. Pedir, a continuación, al\n" +
                        "usuario adivinar el número escogido por el ordenador. Para ello, debe introducir un\n" +
                        "número comprendido entre 0 y 1000. Se compara el número introducido con el\n" +
                        "calculado por el ordenador y se muestra en la consola \"es mayor\" o \"es menor\" en\n" +
                        "función del caso. Se repite la operación hasta que el usuario encuentra el número");
                ej4();
                break;
            case 5:
                System.out.println("5. Pedir al usuario que ingrese un número repetidamente hasta que ingrese un -1 y en ese\n" +
                        "caso se terminará el programa.\n" +
                        "Al terminar, mostrará lo siguiente:\n" +
                        "a. – mayor número introducido\n" +
                        "b. – menor número introducido\n" +
                        "c. – suma de todos los números\n" +
                        "d. – suma de los números");
                ej5();
                break;
            default:
                System.out.println("Opcion Incorrecta");
                break;
        }
    }

    //EJERCITACION
    public static void ej1(){
        System.out.println("Ingrese un numero: ");
        int val = sc.nextInt();
        boolean res = true;
        for(int i=2; i<val; i++){
            if(val % i == 0){
                res = false;
            }
        }
        if(res){
            System.out.println("El numero Ingresado es PRIMO");
        }else{
            System.out.println("El numero Ingresado NO es PRIMO");
        }
    }

    public static void ej2(){
        System.out.println("Ingrese su contraseña: ");
        String val = sc.nextLine(); int i=0;
        while(i<3){
            System.out.println("Ingrese su contraseña Nuevamente");
            String rta = sc.nextLine();
            if(rta.compareTo(val) == 0){
                System.out.println("“Felicitaciones,recordás tu contraseña");
                terminarEjecucion();
            }
            i++;
        }
        System.out.println("Tenes que ejercitar la memoria");
        terminarEjecucion();

    }

    public static void ej3(){
        float val; int ant, cantH; String nombre;
        System.out.println("Ingrese su nombre y apellido: ");    nombre = sc.nextLine();
        System.out.println("Ingrese el valor por hora de trabajo: ");   val = sc.nextFloat();
        System.out.println("Ingrese su antiguedad: ");  ant = sc.nextInt();
        System.out.println("Ingrese la cantidad de Horas Trabajadas"); cantH = sc.nextInt();
        float cobro = val * cantH;
        if(ant >= 10){
            cobro += ant*30;
        }
        System.out.println("\nNombre y Apellido: "+nombre +
                           "\nAntiguedad: "+ant +
                           "\nTotal a Cobrar: "+cobro);
    }

    public static void ej4(){
        boolean res = true;
        do {
            int rand = (int) (Math.random() * (1000 - 0));
            //System.out.println(rand);
            System.out.println("Adivine el numero comprendido entre 0 y 1000: ");
            int rta = sc.nextInt();
            if(rta <0 || rta>100){ System.out.println("Ingreso un numero fuera del rango,terminando programa");System.exit(0);}
            if(rta > rand){
                System.out.println("Es mayor");
            }
            if(rta < rand){
                    System.out.println("Es Menor");
            }
            if(rta == rand){
                System.out.println("FELICIDADES, HAS ADIVINADO!!!");
                res = false;
            }
        }while(res);
    }

    public static void ej5(){
        List<Integer> lista = new ArrayList();
        int val=0;
        while(val != -1){
            System.out.println("Ingrese un numero");
            val = sc.nextInt();
            if(val !=-1) { lista.add(val);}
        }
        System.out.println("El menor numero Ingresado es: " + elMenor(lista));
        System.out.println("El mayor numero Ingresado es: " + elMayor(lista));
        System.out.println("El total de la suma de todos los numeros es de: " + sumaDetodos(lista));
    }


    //FUNCIONES AUXILIARES
    public static int elMayor(List<Integer> arr){
        int mayor=arr.get(0);
        for(Integer a : arr) {
            if (mayor < a) {
                mayor = a;
            }
        }
        return mayor;
    }

    public static int elMenor(List<Integer> arr){
        int menor=arr.get(0);
        for(Integer a : arr) {
            if (menor > a) {
                menor = a;
            }
        }
        return menor;
    }

    public static int sumaDetodos(List<Integer> arr){
        int total = 0;
        for(Integer a : arr) {
           total += a;
        }
        return total;
    }

    public static void terminarEjecucion(){
        System.out.println("Presione una tecla para continuar...");
        String rta = sc.nextLine();
        System.exit(0);
    }
}

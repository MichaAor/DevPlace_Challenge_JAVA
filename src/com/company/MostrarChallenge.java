package com.company;

import java.util.Scanner;

import static com.company.ChallengeAlgoritmos.ChallengeAlgoritmos.ejecutarChallengeAlgoritmos;
import static com.company.ChallengePoo.ChallengePoo.ejecutarChallengePoo;

public class MostrarChallenge {

    public static void menuPrincipal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al Sistema de Exposicion de Challenge");
        char rsa = 's';
        do{
            System.out.println("Que Challenge desea ejecutar?" +
                    "\n1.Challenge Algoritmos" +
                    "\n2.Challenge Poo" +
                    "\n3.Challenge Base de Datos");
            int rta = sc.nextInt();
            ejecutarMenu(rta);
            System.out.println("Desearia probar otro challenge? s/n");
            rsa = sc.next().charAt(0);
        }while(rsa =='s');
    }

    public static void ejecutarMenu(int rta){
        switch(rta){
            case 1:
                System.out.println();
                ejecutarChallengeAlgoritmos();
                break;
            case 2:
                System.out.println();
                ejecutarChallengePoo();
                break;
            case 3:
                System.out.println();
                break;
            default:
                System.out.println("Opcion Incorrecta");
                break;
        }
    }
}

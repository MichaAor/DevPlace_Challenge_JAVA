package com.company;

import java.sql.SQLException;
import java.util.Scanner;

import static com.company.ChallengeAlgoritmos.ChallengeAlgoritmos.ejecutarChallengeAlgoritmos;
import static com.company.ChallengeBDD.ManejoBDD.ejecutarChallengeBDD;
import static com.company.ChallengePoo.ChallengePoo.ejecutarChallengePoo;

public class MostrarChallenge {

    public static void menuPrincipal() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al Sistema de Exposicion de Challenge");
        char rsa;
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

    public static void ejecutarMenu(int rta) throws SQLException {
        switch(rta){
            case 1:
                ejecutarChallengeAlgoritmos();
                break;
            case 2:
                ejecutarChallengePoo();
                break;
            case 3:
                ejecutarChallengeBDD();
                break;
            default:
                System.out.println("Opcion Incorrecta");
                break;
        }
    }
}

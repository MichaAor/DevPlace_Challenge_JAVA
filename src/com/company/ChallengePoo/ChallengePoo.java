package com.company.ChallengePoo;

import java.util.Scanner;

public class ChallengePoo {
    public static void ejecutarChallengePoo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario, Ingrese su contraseña (8 caracteres maximo)");
        String pass = sc.nextLine();
        Password password = new Password(pass,pass.length());
        if(password.esFuerte()){
            System.out.println("Su contraseña es fuerte");
        }else {
            System.out.println("Su contraseña es debil");
        }
        //Password pasi = new Password(15);
        //System.out.println(pasi.getContraseña());
    }
}

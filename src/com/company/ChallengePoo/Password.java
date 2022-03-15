package com.company.ChallengePoo;

public class Password {
    private int longitud = 8;
    private String contraseña;

    public Password(String contraseña,int longitud) {
        this.contraseña = contraseña;
        this.longitud = longitud;
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarPassword();
    }

    public boolean esFuerte(){
        boolean rta = false;
        int f1=0,f2=0,f3=0;
        for(int i =0;i<this.longitud;i++){
            char sel = this.contraseña.charAt(i);
            if(Character.isUpperCase(sel)){f1++;}
            if(Character.isLowerCase(sel)){f2++;}
            if(Character.isDigit(sel)){f3++;}
        }
        if(f1>2 && f2 >1 && f3 >3){
            return true;
        }else {
            return false;
        }
    }

    public String generarPassword(){
         String min = "abcdefghijklmnopqrstuvwxyz";
         String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         String num = "0123456789";
         String all = min + may + num;
         char[] pass = new char[longitud];
         for(int i =0; i<this.longitud;i++){
             pass[i] = all.charAt((int) (Math.random() * all.length()));
         }
         String password = String.copyValueOf(pass);
         return password;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public int getLongitud() {
        return this.longitud;
    }

    public String getContraseña() {
        return this.contraseña;
    }

}

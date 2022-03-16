package com.company.ChallengeBDD;

import javax.swing.*;
import java.sql.*;
public class Conexion {
    private static Connection conexion;
    private static Conexion instancia;

    private Conexion(){
    }

    private static final String URL = "jdbc:mysql://localhost/challenge";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "4190201306022019";

    public Connection conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            JOptionPane.showMessageDialog(null,"Conexion Exitosa!!");
            return conexion;
        }catch (Exception e){
            JOptionPane.showInternalMessageDialog(null,"Error que da: "+ e);
        }
        return conexion;
    }

    public void desconectar() throws SQLException {
        try {

            conexion.close();
            JOptionPane.showMessageDialog(null,"Se Desconecto de la BDD");

        }catch(Exception e){
            JOptionPane.showInternalMessageDialog(null,"Error que da: "+ e);
            conexion.close();
        }finally {
            conexion.close();
        }
    }

    public static Conexion getInstance(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }

}

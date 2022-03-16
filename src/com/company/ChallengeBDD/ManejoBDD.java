package com.company.ChallengeBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManejoBDD {
    public static void ejecutarChallengeBDD() throws SQLException {
        Conexion conexion = Conexion.getInstance();
        Connection connection = conexion.conectar();
        int i=0;
        ///Se carga la base de datos y sus tablas
        while(i<10){
            Empleado empleado = new Empleado();
            PreparedStatement insertar = connection.prepareStatement("insert into empleado values (?,?,?,?,?,?,?,?)");
            insertar.setString(1, "0");
            insertar.setString(2, empleado.getNombre());
            insertar.setString(3, empleado.getApellido());
            insertar.setString(4, empleado.getTelefono());
            insertar.setString(5, empleado.emailRandom());
            insertar.setString(6, empleado.puestosRandom());
            insertar.setFloat(7, empleado.salarioRandom());
            insertar.setInt(8, empleado.antiguedadRandom());
            insertar.executeUpdate();
           i++;
        }

        PreparedStatement seleccionar = connection.prepareStatement("select * from empleado");
        ResultSet consulta = seleccionar.executeQuery();

        while(consulta.next()){
            System.out.println(consulta.getString(1) + " " + consulta.getString(2) + " " + consulta.getString(3)
                    + " "   +  consulta.getString(4) + " " + consulta.getString(5) + " " + consulta.getString(6)
                    + " "   +  consulta.getString(7) + " " + consulta.getString(8) + "\n\n");
        }

        conexion.desconectar();
    }
}

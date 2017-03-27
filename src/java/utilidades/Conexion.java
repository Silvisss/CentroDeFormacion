package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Connection conexion = null;
   

    //Establecer conexion ------------------------------
    public static Connection abrirConexion() throws ClassNotFoundException, SQLException {

        String className = "com.mysql.jdbc.Driver";

        String url = "jdbc:mysql://localhost/centrodeformacion";
        String user = "root";
        String password = "root";
        Class.forName(className);

        conexion = DriverManager.getConnection(url, user, password);

        if (conexion != null) {

            System.out.println("Conexion establecida");
        } else {

            System.out.println("Conexion abortada");
        }

        return conexion;
    }

    //Cerrar conexion -------------------------------------------
    public static void cerrarConexion() throws SQLException {

        if (conexion != null) {
            conexion.close();
            System.out.println("Conexion cerrada");
        } else {
            System.out.println("Se ha producido un error en la conexion");
        }
    }
}

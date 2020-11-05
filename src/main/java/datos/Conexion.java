package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Equipo
 */
public class Conexion {

    private static Connection cnx = null;
    private static String bd = "carritoventas";
    private static String login = "root";
    private static String password = "";
    private static String url = "jdbc:mariadb://localhost/" + bd;

    public static Connection obtener() throws SQLException, ClassNotFoundException {
        if (cnx == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                cnx = DriverManager.getConnection(url, login, "");

                if (cnx != null) {
                    System.out.println("Connecting database [" + cnx + "] OK");
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
                throw new ClassCastException("Prueba de error: " + ex.getMessage());
            }
        }
        return cnx;
    }

    public static void cerrar() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }
}

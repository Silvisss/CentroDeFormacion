package bo.profesor.centroformacion;


import dao.profesor.centroformacion.DaoProfesor;
import entidades.Profesor;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoProfesor {

    public static void procesarInsertarProfesor(HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException, IOException {

        Profesor teacher = new Profesor();
        teacher.setIdProfesor(request.getParameter("idProfesor"));
        teacher.setNombre(request.getParameter("nombre"));
        teacher.setApellido(request.getParameter("apellido"));
        teacher.setEspecialidad(request.getParameter("especialidad"));
        DaoProfesor.insertarProfesor(teacher.getIdProfesor(), teacher.getNombre(), teacher.getApellido(), teacher.getEspecialidad());
        response.sendRedirect("ServletMostrarProfesor");
    }

    public static void procesarActualizarProfesor(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException {
        Profesor teacher = new Profesor();
        teacher.setIdProfesor(request.getParameter("idProfesor"));
        teacher.setNombre(request.getParameter("nombre"));
        teacher.setApellido(request.getParameter("apellido"));
       
        DaoProfesor.actualizarProfesor(teacher.getNombre(), teacher.getApellido(), teacher.getIdProfesor());
        response.sendRedirect("ServletMostrarProfesor");
    }
     public static void procesarBorrarProfesor(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException {

         Profesor teacher = new Profesor(); 
        teacher.setIdProfesor(request.getParameter("idProfesor"));
        teacher.setNombre(request.getParameter("nombre"));
        teacher.setApellido(request.getParameter("apellido"));
        teacher.setEspecialidad(request.getParameter("especialidad"));
        DaoProfesor.borrarProfesor(teacher.getIdProfesor(), teacher.getNombre(), teacher.getApellido(), teacher.getEspecialidad());
       response.sendRedirect("ServletMostrarProfesor");
   }

}

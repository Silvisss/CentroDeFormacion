
package bo.alumno.centroformacion;

import dao.alumno.centroformacion.DaoAlumno;
import entidades.Alumno;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BoAlumno {
    
      public static void procesarInsertarAlumno(HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException, IOException {

        Alumno student = new Alumno();
        student.setIdAlumno(request.getParameter("idAlumno"));
        student.setNombre(request.getParameter("nombre"));
        student.setApellido(request.getParameter("apellido"));
        student.setCurso(request.getParameter("curso"));
        DaoAlumno.insertarAlumno(student.getIdAlumno(), student.getNombre(), student.getApellido(), student.getCurso());
        response.sendRedirect("ServletMostrarAlumno");
    }

    public static void procesarActualizarAlumno(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException {
        Alumno student = new Alumno();
        student.setIdAlumno(request.getParameter("idAlumno"));
        student.setNombre(request.getParameter("nombre"));
        student.setApellido(request.getParameter("apellido"));
        student.setCurso(request.getParameter("curso"));
        DaoAlumno.actualizarAlumno(student.getNombre(), student.getApellido(), student.getCurso(), student.getIdAlumno());
        response.sendRedirect("ServletMostrarAlumno");
    }
    public static void procesarBorrarAlumno(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException {

        Alumno student = new Alumno();
        student.setIdAlumno((request.getParameter("idAlumno")));
        student.setNombre(request.getParameter("nombre"));
        student.setApellido(request.getParameter("apellido"));
        student.setCurso(request.getParameter("curso"));
        DaoAlumno.borrarAlumno(student.getIdAlumno(), student.getNombre(), student.getApellido(), student.getCurso());
        response.sendRedirect("ServletMostrarAlumno");
    }
}

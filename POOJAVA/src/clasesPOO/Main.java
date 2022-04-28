package clasesPOO;
class Main
{
    public static void main(String[] args) 
    {
      //Clase Usuarios
        Usuarios usuario = new  Usuarios("CJULIO","julioc.cuevah@mail.com");
        System.out.println(">> Clase usuarios");
        System.out.println("Nombre usuario: " + usuario.ObtenerUser());
        System.out.println("Email usuario: " + usuario.ObtenerEmail());
      //Clase Persona
        Persona persona = new  Persona("Julio","Cueva");
        System.out.println(">> Clase Persona");
        System.out.println("Nombre Persona: " + persona.ObtenerNombres());
        System.out.println("Apellidos Persona: " + persona.ObtenerApellidos());
       //Clase Alumno
        Alumno alumno = new  Alumno("2021240006");
        System.out.println(">> Clase Alumno");
        System.out.println("Codigo Alumno: " + alumno.ObtenerIdAlumno());
        //Clase Curso
        Cursos curso = new  Cursos("062105073","programación Orientada a Objetos",4);
        System.out.println(">> Clase Curso");
        System.out.println("Codigo: " + curso.ObteneridCurso());
        System.out.println("Nombre: " + curso.ObtenerNCurso());
        System.out.println("Creditos: " + curso.ObtenerCreditos());
        //Clase AlumnoCurso
        AlumnoCurso alumnocurso = new  AlumnoCurso("2021240006","062105073",15,"Tarea 1");
        System.out.println(">> Alumno Curso");
        System.out.println("Codigo Alumno: " + alumnocurso.ObteneridAlumno());
        System.out.println("Codigo Curso: " + alumnocurso.ObteneridCurso());
        System.out.println("Nota: " + alumnocurso.ObtenerNota());
        System.out.println("Periodo: " + alumnocurso.ObtenerPeriodo());     
        //Clase Docente
        Docente docente = new  Docente("22532315");
        System.out.println(">> Clase Docente");
        System.out.println("Codigo Docente: " + docente.ObteneridDoc());
         //Clase TipoDocumento
         TipoDocumento tipodocumento = new  TipoDocumento("01","DNI");
         System.out.println(">> Clase TipoDocumento");
         System.out.println("ID Tipo: " + tipodocumento.ObtenerTipoDoc());
         System.out.println("Documento: " + tipodocumento.ObtenernTipoDoc());
        //Clase DocenteCurso
        DocenteCurso docentecurso = new  DocenteCurso("22532315","062105073");
        System.out.println(">> Clase Docente Curso");
        System.out.println("Codigo Docente: " + docentecurso.ObtenerDocente());
        System.out.println("Codigo Curso: " + docentecurso.ObtenerCurso());
       //Clase Universidad
       Universidad universidad = new  Universidad("Universidad de Huánuco","www.udh.edu.pe");
       System.out.println(">> Clase Universidad");
       System.out.println("Universidad: " + universidad.ObtenerNombre());
       System.out.println("Web: " + universidad.ObtenerWeb());
        //Clase Facultad
      Facultad facultad = new  Facultad("FI","Facultad de Ingenieria");
      System.out.println(">> Clase Facultad");
      System.out.println("Siglas: " + facultad.ObtenerIdFacu());
      System.out.println("Facultad: " + facultad.ObtenerFacu());
        //Clase Carreras
        Carreras carrera = new  Carreras("ISI","Ingenieria de Sitemas e Informatica","FI");
        System.out.println(">> Clase Carreras");
        System.out.println("Siglas: " + carrera.ObtenerIdCarrera());
        System.out.println("Carrera: " + carrera.ObtenerCarrera());
        System.out.println("Siglas Facultad: " + carrera.ObtenerIdFacu());
      //Clase UserAccesos
      UserAccesos useraccesos = new  UserAccesos("CJULIO","CJULIO_AppMCIPArb");
      System.out.println(">> Clase UserAccesos");
      System.out.println("Usuario: " + useraccesos.ObtenerUser());
      System.out.println("Acceso: " + useraccesos.ObtenerUseracceso());
      //Clase Area
      Area area = new  Area("01","Decanatura");
      System.out.println(">> Clase Area");
      System.out.println("Codigo: " + area.ObtenerIdArea());
      System.out.println("Area: " + area.ObtenerArea());
      //Clase AreaUsuario
      AreaUsuario areausuario = new  AreaUsuario("01","CJULIO");
      System.out.println(">> Clase AreaUsuario");
      System.out.println("Area: " + areausuario.ObtenerIdArea());
      System.out.println("Usuario: " + areausuario.ObteneridUser());
      }
}

package clasesPOO;
class Alumno {
    String idAlumno;
    int IdPers;
    int IdCarrera;

    public Alumno(String idAl)
    {
        establecerDatos(idAl);
    }
    public String ObtenerIdAlumno()
    {
       return idAlumno;
    }
    void  establecerDatos(String idAlu)
    {
        idAlumno=idAlu;
    }
}
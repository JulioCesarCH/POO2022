package clasesPOO;

public class AlumnoCurso 
{
    String idAlumno;
    String idCurso;
    int Nota;
    String Periodo;

    public AlumnoCurso(String idalu,String idcu,int not,String peri)
    {
        establecerDatos(idalu,idcu,not,peri);
    }
    public String ObteneridAlumno()
    {
       return idAlumno;
    }
    public String ObteneridCurso()
    {
       return idCurso;
    }
    public int ObtenerNota()
    {
       return Nota;
    }
    public String ObtenerPeriodo()
    {
       return Periodo;
    }
    void  establecerDatos(String idalum,String idcur,int noti,String perio)
    {
        idAlumno=idalum;
        idCurso=idcur;
        Nota=noti;
        Periodo=perio;
    }
}

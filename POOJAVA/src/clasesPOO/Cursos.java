package clasesPOO;

public class Cursos 
{
    String idCurso;
    String NCurso;
    int Creditos;

    public Cursos(String idCu,String NCu,int cred)
    {
        establecerDatos(idCu,NCu,cred);
    }
    public String ObteneridCurso()
    {
       return idCurso;
    }
    public String ObtenerNCurso()
    {
       return NCurso;
    }
    public int ObtenerCreditos()
    {
       return Creditos;
    }
    void  establecerDatos(String idCur,String NCur,int credi)
    {
        idCurso=idCur;
        NCurso=NCur;
        Creditos=credi;
    }
}

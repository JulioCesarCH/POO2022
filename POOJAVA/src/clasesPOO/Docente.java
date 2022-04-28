package clasesPOO;

public class Docente 
{
    String idDoc;
    int idPers;
    String idCurso;
    public Docente(String idDo)
    {
        establecerDatos(idDo);
    }
    public String ObteneridDoc()
    {
       return idDoc;
    }
   void  establecerDatos(String idD)
    {
        idDoc=idD;
    }
}

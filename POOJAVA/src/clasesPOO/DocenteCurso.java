package clasesPOO;

public class DocenteCurso 
{
    String idDoc;
    String idPers;
    String idCurso;

    public DocenteCurso(String idD,String idCu)
    {
        establecerDatos(idD,idCu);
    }
    public String ObtenerDocente()
    {
       return idDoc;
    }
    public String ObtenerCurso()
    {
       return idCurso;
    }
    void  establecerDatos(String idDo,String idCur)
    {
        idDoc=idDo;
        idCurso=idCur;
    }
}

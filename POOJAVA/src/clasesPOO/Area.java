package clasesPOO;

public class Area {
    String idArea;
    String nArea;
    String ubicacion;
    public Area(String idA,String nA)
    {
        establecerDatos(idA,nA);
    }
    public String ObtenerIdArea()
    {
       return idArea;
    }
    public String ObtenerArea()
    {
       return nArea;
    }
    void  establecerDatos(String idAr,String nAr)
    {
        idArea=idAr;
        nArea=nAr;
    }
}

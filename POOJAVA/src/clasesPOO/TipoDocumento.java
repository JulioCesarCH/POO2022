package clasesPOO;

public class TipoDocumento 
{
    String idTipoDoc;
    String nTipoDoc;
    
    public TipoDocumento(String idTipo,String nTipo)
    {
        establecerDatos(idTipo,nTipo);
    }
    public String ObtenerTipoDoc()
    {
       return idTipoDoc;
    }
    public String ObtenernTipoDoc()
    {
       return nTipoDoc;
    }
    void  establecerDatos(String idTipoD,String nTipoD)
    {
        idTipoDoc=idTipoD;
        nTipoDoc=nTipoD;
    }
}
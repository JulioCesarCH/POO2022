package clasesPOO;

public class AreaUsuario {
    String idAreaUsuario;
    String idArea;
    String idUser;
    public AreaUsuario(String idA,String idU)
    {
        establecerDatos(idA,idU);
    }
    public String ObtenerIdArea()
    {
       return idArea;
    }
    public String ObteneridUser()
    {
       return idUser;
    }
    void  establecerDatos(String idAr,String idUs)
    {
        idArea=idAr;
        idUser=idUs;
    }
}

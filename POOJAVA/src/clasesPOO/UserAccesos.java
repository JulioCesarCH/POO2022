package clasesPOO;

public class UserAccesos 
{
    String idAcceso;
    String idUser;
    String idOpcion;
    String idSubmenu;
    String idMenu;
    String estado;

    public UserAccesos(String idAcc,String idUsr)
    {
        establecerDatos(idAcc,idUsr);
    }
    public String ObtenerUseracceso()
    {
       return idAcceso;
    }
    public String ObtenerUser()
    {
       return idUser;
    }
    void  establecerDatos(String idAcce,String idUs)
    {
        idAcceso=idAcce;
        idUser=idUs;
    }
}
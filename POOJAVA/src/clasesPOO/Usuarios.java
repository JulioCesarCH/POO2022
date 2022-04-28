package clasesPOO;

public class Usuarios {
    String idUser;
    String nUser;
    String email;
    String clave;
    String estado;
    public Usuarios(String user,String emai)
    {
        establecerDatos(user,emai);
    }
    public String ObtenerUser()
    {
       return nUser;
    }
    public String ObtenerEmail()
    {
       return email;
    }
    void  establecerDatos(String usr,String ema)
    {
        nUser=usr;
        email=ema;
    }
}

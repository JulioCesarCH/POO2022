package clasesPOO;

public class Universidad 
{
    String idUni;
    String nombre;
    String direccion;
    String telefono;
    String web;

    public Universidad(String nomb,String we)
    {
        establecerDatos(nomb,we);
    }
    public String ObtenerNombre()
    {
       return nombre;
    }
    public String ObtenerWeb()
    {
       return web;
    }
    void  establecerDatos(String nom,String w)
    {
        nombre=nom;
        web=w;
    }
}

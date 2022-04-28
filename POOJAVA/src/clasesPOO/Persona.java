package clasesPOO;

public class Persona 
{
    int idPers;
    String idTipoDoc;
    String NDoc;
    String apellidos;
    String nombres;
    int edad;
    String genero;
    String direccion;

    public Persona(String nomb,String apell)
    {
        establecerDatos(nomb,apell);
    }
    public String ObtenerNombres()
    {
       return nombres;
    }
    public String ObtenerApellidos()
    {
       return apellidos;
    }
    void  establecerDatos(String nom,String ape)
    {
        nombres=nom;
        apellidos=ape;
    }
}

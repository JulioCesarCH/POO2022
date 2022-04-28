package clasesPOO;

public class Facultad 
{
    String idFacu;
    String NFacu;
    String TelfFacu;
    String IdUni;

    public Facultad(String idFa,String NFa)
    {
        establecerDatos(idFa,NFa);
    }
    public String ObtenerIdFacu()
    {
       return idFacu;
    }
    public String ObtenerFacu()
    {
       return NFacu;
    }
    void  establecerDatos(String idFac,String NFac)
    {
        idFacu=idFac;
        NFacu=NFac;
    }
}

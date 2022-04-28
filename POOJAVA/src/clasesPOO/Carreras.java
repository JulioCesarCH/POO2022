package clasesPOO;

public class Carreras 
{
    String idCarrera;
    String nCarrera;
    String idFacu;

    public Carreras(String idCar,String nCar,String idFa)
    {
        establecerDatos(idCar,nCar,idFa);
    }
    public String ObtenerIdCarrera()
    {
       return idCarrera;
    }
    public String ObtenerCarrera()
    {
       return nCarrera;
    }
    public String ObtenerIdFacu()
    {
       return idFacu;
    }
    void  establecerDatos(String idCarr,String nCarr,String idFac)
    {
        idCarrera=idCarr;
        nCarrera=nCarr;
        idFacu=idFac;
    } 
}
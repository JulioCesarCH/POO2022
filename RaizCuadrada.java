class Persona 
{
    int idPers=15;
    String idTipoDoc="01";
    String NDoc="05012052";
    String apellidos="cruz";
    String nombres="carlos";
    int edad=25;
    String genero="Masculino";
    String direccion="Av. Alfonso Ugarte";
    void ObtenerDatos()
    {
        System.out.println("Mostrando Datos de la Persona");
    }
    public static void main(String[] args)
    {
       Persona persona=new Persona();
       persona.ObtenerDatos();
        System.out.println("Codigo: " + persona.idPers);
        System.out.println("Documento: " + persona.idTipoDoc + "-" + persona.NDoc);
        System.out.println("Apellidos: " + persona.apellidos);
        System.out.println("Nombres: " + persona.nombres);
        System.out.println("Edad: " + persona.edad);
        System.out.println("Genero: " + persona.genero);
        System.out.println("Dirección: " + persona.direccion);
    }
}
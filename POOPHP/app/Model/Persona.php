<?php
namespace App\Model;
class persona
{
    public $idPers="";
    public $idTipoDoc="";
    public $NDoc="";
    public $apellidos="";
    public $nombres="";
    public $edad="";
    public $genero="";
    public $direccion="";

   public function __construct(String $nomb,String $apell)
    {
        $this->establecerDatos($nomb,$apell);
    }
    public function ObtenerNombres()
    {
        return $this->nombres;
    }
    public function ObtenerApellidos()
    {
        return $this->apellidos;
    }
    public function establecerDatos(String $nom,String $ape)
    {
        $this->nombres=$nom;
        $this->apellidos=$ape;
    }
}
?>
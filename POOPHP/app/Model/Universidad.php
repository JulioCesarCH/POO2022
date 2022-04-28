<?php
namespace App\Model;
class Universidad
{
    public $idUni="";
    public $nombre="";
    public $direccion="";
    public $telefono="";
    public $web="";
   public function __construct(String $nomb,String $we)
    {
        $this->establecerDatos($nomb,$we);
    }
    public function ObtenerNombre()
    {
        return $this->nombre;
    }
    public function ObtenerWeb()
    {
        return $this->web;
    }
    public function establecerDatos(String $nom,String $w)
    {
        $this->nombre=$nom;
        $this->web=$w;
    }
}
?>
<?php
namespace App\Model;
class AreaUsuario
{
   public $idAreaUsuario="";
   public $idArea="";
   public $idUser="";
   public function __construct(String $idA,String $idU)
    {
        $this->establecerDatos($idA,$idU);
    }
    public function ObtenerIdArea()
    {
        return $this->idArea;
    }
    public function ObteneridUser()
    {
        return $this->idUser;
    }
    public function establecerDatos(String $idAr,String $idUs)
    {
        $this->idArea=$idAr;
        $this->idUser=$idUs;
    }
}
?>
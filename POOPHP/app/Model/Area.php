<?php
namespace App\Model;
class Area
{
   public $idArea="";
   public $nUser="";
   public $nArea="";
   public $ubicacion="";
   public function __construct(String $idA,String $nA)
    {
        $this->establecerDatos($idA,$nA);
    }
    public function ObtenerIdArea()
    {
        return $this->idArea;
    }
    public function ObtenerArea()
    {
        return $this->nArea;
    }
    public function establecerDatos(String $idAr,String $nAr)
    {
        $this->idArea=$idAr;
        $this->nArea=$nAr;
    }
}
?>
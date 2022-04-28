<?php
namespace App\Model;
class Carreras
{
   public $idCarrera="";
   public $nCarrera="";
   public $idFacu="";
  
   public function __construct(String $idCar,String $nCar,String $idFa)
    {
        $this->establecerDatos($idCar,$nCar,$idFa);
    }
    public function ObtenerIdCarrera()
    {
        return $this->idCarrera;
    }
    public function ObtenerCarrera()
    {
        return $this->nCarrera;
    }
    public function ObtenerIdFacu()
    {
        return $this->idFacu;
    }
    public function establecerDatos(String $idCarr,String $nCarr,String $idFac)
    {
        $this->idCarrera=$idCarr;
        $this->nCarrera=$nCarr;
        $this->idFacu=$idFac;
    }
}
?>
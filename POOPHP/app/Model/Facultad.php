<?php
namespace App\Model;
class Facultad
{
    public $idFacu="";
    public $NFacu="";
    public $TelfFacu="";
    public $IdUni="";

   public function __construct(String $idFa,String $NFa)
    {
        $this->establecerDatos($idFa,$NFa);
    }
    public function ObtenerIdFacu()
    {
        return $this->idFacu;
    }
    public function ObtenerFacu()
    {
        return $this->NFacu;
    }
    public function establecerDatos(String $idFac,String $NFac)
    {
        $this->idFacu=$idFac;
        $this->NFacu=$NFac;
    }
}
?>
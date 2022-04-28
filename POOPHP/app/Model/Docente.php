<?php
namespace App\Model;
class Docente
{
    public $idDoc="";
    public $idPers="";
    public $idCurso="";
   public function __construct(String $idDo)
    {
        $this->establecerDatos($idDo);
    }
    public function ObteneridDoc()
    {
        return $this->idDoc;
    }
    public function establecerDatos(String $idD)
    {
        $this->idDoc=$idD;
    }
}
?>
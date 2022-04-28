<?php
namespace App\Model;
class DocenteCurso
{
    public $idDoc="";
    public $idPers="";
    public $idCurso="";

   public function __construct(String $idD,String $idCu)
    {
        $this->establecerDatos($idD,$idCu);
    }
    public function ObtenerDocente()
    {
        return $this->idDoc;
    }
    public function ObtenerCurso()
    {
        return $this->idCurso;
    }
    public function establecerDatos(String $idDo,String $idCur)
    {
        $this->idDoc=$idDo;
        $this->idCurso=$idCur;
    }
}
?>
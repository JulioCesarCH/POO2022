<?php
namespace App\Model;
class Cursos
{
    public $idCurso;
    public $NCurso;
    public $Creditos;

   public function __construct(String $idCu,String $NCu,int $cred)
    {
        $this->establecerDatos($idCu,$NCu,$cred);
    }
    public function ObteneridCurso()
    {
        return $this->idCurso;
    }
    public function ObtenerNCurso()
    {
        return $this->NCurso;
    }
    public function ObtenerCreditos()
    {
        return $this->Creditos;
    }
    public function establecerDatos(String $idCur,String $NCur,int $credi)
    {
        $this->idCurso=$idCur;
        $this->NCurso=$NCur;
        $this->Creditos=$credi;
    }
}
?>
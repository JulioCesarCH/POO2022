<?php
namespace App\Model;
class AlumnoCurso
{
    public $idAlumno="";
    public $idCurso="";
    public $Nota="";
    public $Periodo="";

    public function __construct(String $idalu,String $idcu,int $not,String $peri)
    {
        $this->establecerDatos($idalu,$idcu,$not,$peri);
    }
    public function ObteneridAlumno()
    {
        return $this->idAlumno;
    }
    public function ObteneridCurso()
    {
        return $this->idCurso;
    }
    public function ObtenerNota()
    {
        return $this->Nota;
    }
    public function ObtenerPeriodo()
    {
        return $this->Periodo;
    }
    public function establecerDatos(String $idalum,String $idcur,int $noti,String $perio)
    {
        $this->idAlumno=$idalum;
        $this->idCurso=$idcur;
        $this->Nota=$noti;
        $this->Periodo=$perio;
    }
}
?>
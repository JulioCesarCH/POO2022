<?php
namespace App\Model;
class Alumno
{
   public $idAlumno="";
   public $IdPers="";
   public $IdCarrera="";
    public function __construct(String $idAl)
    {
        $this->establecerDatos($idAl);    
    }
    public function ObtenerIdAlumno()
    {
        return $this->idAlumno;
    }
    public function establecerDatos(String $idAlu)
    {
        $this->idAlumno=$idAlu;
    }
}
?>
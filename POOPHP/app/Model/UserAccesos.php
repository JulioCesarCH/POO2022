<?php
namespace App\Model;
class UserAccesos
{
   public $idAcceso="";
   public $idUser="";
   public $idOpcion="";
   public $idSubmenu="";
   public $idMenu="";
   public $estado="";

   public function __construct(String $idAcc,String $idUsr)
    {
        $this->establecerDatos($idAcc,$idUsr);
    }
    public function ObtenerUseracceso()
    {
        return $this->idAcceso;
    }
    public function ObtenerUser()
    {
        return $this->idUser;
    }
    public function establecerDatos(String $idAcce,String $idUs)
    {
        $this->idAcceso=$idAcce;
        $this->idUser=$idUs;
    }
}
?>
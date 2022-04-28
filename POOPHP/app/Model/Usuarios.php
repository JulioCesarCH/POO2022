<?php
namespace App\Model;
class Usuarios
{
   public $idUser="";
   public $nUser="";
   public $email="";
   public $clave="";
   public $estado="";
   public function __construct(String $user,String $emai)
    {
        $this->establecerDatos($user,$emai);
    }
    public function ObtenerUser()
    {
        return $this->nUser;
    }
    public function ObtenerEmail()
    {
        return $this->email;
    }
    public function establecerDatos(String $usr,String $ema)
    {
        $this->nUser=$usr;
        $this->email=$ema;
    }
}
?>
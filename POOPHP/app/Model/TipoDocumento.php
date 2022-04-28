<?php
namespace App\Model;
class TipoDocumento
{
    public $idTipoDoc="";
    public $nTipoDoc="";
   public function __construct(String $idTipo,String $nTipo)
    {
        $this->establecerDatos($idTipo,$nTipo);
    }
    public function ObtenerTipoDoc()
    {
        return $this->idTipoDoc;
    }
    public function ObtenernTipoDoc()
    {
        return $this->nTipoDoc;
    }
    public function establecerDatos(String $idTipoD,String $nTipoD)
    {
        $this->idTipoDoc=$idTipoD;
        $this->nTipoDoc=$nTipoD;
    }
}
?>
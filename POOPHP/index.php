<?php
//echo 'Saludos';
require_once __DIR__.'/bootstrap/app.php';
//Clase Usuarios
use App\Model\Usuarios;
$usuario = new Usuarios("CJULIO","julioc.cuevah@mail.com");
//$usuario->establecerDatos("CJULIO","julioc.cuevah@mail.com");
echo '>> Clase Usuarios';
echo "<br>Nombre usuario:".$usuario->ObtenerUser();
echo "<br>Email usuario:".$usuario->ObtenerEmail();
//Clase Persona
use App\Model\Persona;
$persona = new Persona("Julio","Cueva");
echo '>> Clase Persona';
echo "<br>Nombre Persona: ".$persona->ObtenerNombres();
echo "<br>Apellidos Persona: ".$persona->ObtenerApellidos();
//Clase Alumno
use App\Model\Alumno;
$alumno = new Alumno("2021240006");
echo '>> Clase Alumno';
echo "<br>Codigo Alumno: ".$alumno->ObtenerIdAlumno();
//Clase Curso
use App\Model\Cursos;
$curso = new Cursos("062105073","programación Orientada a Objetos",4);
echo '>> Clase Curso';
echo "<br>Codigo: ".$curso->ObteneridCurso();
echo "<br>Nombre: ".$curso->ObtenerNCurso();
echo "<br>Creditos: ".$curso->ObtenerCreditos();
//Clase AlumnoCurso
use App\Model\AlumnoCurso;
$alumnocurso = new AlumnoCurso("2021240006","062105073",15,"Tarea 1");
echo '>> Clase Curso';
echo "<br>Codigo Alumno: ".$alumnocurso->ObteneridAlumno();
echo "<br>Codigo Curso: ".$alumnocurso->ObteneridCurso();
echo "<br>Nota: ".$alumnocurso->ObtenerNota();
echo "<br>Periodo: ".$alumnocurso->ObtenerPeriodo();
//Clase Docente
use App\Model\Docente;
$docente = new Docente("22532315");
echo '>> Clase Docente';
echo "<br>Codigo Docente: ".$docente->ObteneridDoc();
 //Clase TipoDocumento
 use App\Model\TipoDocumento;
$tipodocumento = new TipoDocumento("01","DNI");
echo '>> Clase TipoDocumento';
echo "<br>ID Tipo: ".$tipodocumento->ObtenerTipoDoc();
echo "<br>Documento: ".$tipodocumento->ObtenernTipoDoc();
 //Clase DocenteCurso
 use App\Model\DocenteCurso;
$docentecurso = new DocenteCurso("22532315","062105073");
echo '>> Clase DocenteCurso';
echo "<br>Codigo Docente: ".$docentecurso->ObtenerDocente();
echo "<br>Codigo Curso: ".$docentecurso->ObtenerCurso();
//Clase Universidad
use App\Model\Universidad;
$universidad = new Universidad("Universidad de Huánuco","www.udh.edu.pe");
echo '>> Clase Universidad';
echo "<br>Universidad: ".$universidad->ObtenerNombre();
echo "<br>Web: ".$universidad->ObtenerWeb();
//Clase Facultad
use App\Model\Facultad;
$facultad = new Facultad("FI","Facultad de Ingenieria");
echo '>> Clase Facultad';
echo "<br>Siglas: ".$facultad->ObtenerIdFacu();
echo "<br>Facultad: ".$facultad->ObtenerFacu();
//Clase Carreras
use App\Model\Carreras;
$carrera = new Carreras("ISI","Ingenieria de Sitemas e Informatica","FI");
echo '>> Clase Carreras';
echo "<br>Siglas: ".$carrera->ObtenerIdCarrera();
echo "<br>Carrera: ".$carrera->ObtenerCarrera();
echo "<br>Siglas Facultad: ".$carrera->ObtenerIdFacu();
//Clase UserAccesos
use App\Model\UserAccesos;
$useraccesos = new UserAccesos("CJULIO","CJULIO_AppMCIPArb");
echo '>> Clase UserAccesos';
echo "<br>Usuario: ".$useraccesos->ObtenerUser();
echo "<br>Acceso: ".$useraccesos->ObtenerUseracceso();
//Clase Area
use App\Model\Area;
$area = new  Area("01","Decanatura");
echo '>> Clase Area';
echo "<br>Codigo: ".$area->ObtenerIdArea();
echo "<br>Area: ".$area->ObtenerArea();
//Clase AreaUsuario
use App\Model\AreaUsuario;
$areausuario = new  AreaUsuario("01","CJULIO");
echo '>> Clase AreaUsuario';
echo "<br>Area: ".$areausuario->ObtenerIdArea();
echo "<br>Usuario: ".$areausuario->ObteneridUser();
?>
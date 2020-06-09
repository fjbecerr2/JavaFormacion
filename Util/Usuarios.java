//import Util.*;

class Usuarios
{
  //static Mensajes ut = new Mensajes();

  //static final int NUSUARIOS = 4;
  //static int [] aCodigoUsuario = new int [NUSUARIOS];
  //static String [] aUsuarios = new String [NUSUARIOS];

  String usuario = new String();
  String nombreusuario = new String();
  String apellido1usuario = new String();
  String apellido2usuario = new String();

  public void setNombreUsuario(String pnombreusuario){
    this.nombreusuario = pnombreusuario;
  };
  public void setApellido1Usuario(String papellido1usuario){
    this.apellido1usuario = papellido1usuario;
  };
  public void setApellido2Usuario(String papellido2usuario){
    this.apellido2usuario = papellido2usuario;
  };
  
  public String getNombreUsuario(){
    return this.nombreusuario;
  };
  public String getApellido1Usuario(){
    return this.apellido1usuario;
  };
  public String getApellido2Usuario(){
    return this.apellido2usuario;
  };
}


 

  /*for (int element : array){
    if (element % 2 != 0) {
        count++;
        sum += element;
    }
for (int i = 1; i < array.length; i++){
Line 4:     if (array[i] __ array[ind]){
Line 5:         ind = i;
*/


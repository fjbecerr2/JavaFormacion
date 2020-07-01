import java.util.Scanner; 
import Util.*;

class interfaceUsuario{
 
  static Mensajes ut = new Mensajes();
  static Usuarios us = new Usuarios();
  Scanner dato = new Scanner(System.in);

  public void solicitarNombreUsuario(){
   
    String stTmp = new String("");
    System.out.println("Introduzca Nombre: ");
    stTmp = dato.nextLine();
    us.setNombreUsuario(stTmp);
  } 

  public void solicitarApellido1Usuario(){

    String stTmp = new String("");
    System.out.println("Introduzca Apellido1: ");
    stTmp = dato.nextLine();
    us.setApellido1Usuario(stTmp);
  }

  public void solicitarApellido2Usuario(){

    String stTmp = new String("");
    System.out.println("Introduzca Apellido2: ");
    stTmp = dato.nextLine();
    us.setApellido2Usuario(stTmp);
  }

  public void mostrarUsuario(){
    String stTmp = new String("");
    stTmp = us.getNombreUsuario();
    stTmp = stTmp+" "+us.getApellido1Usuario();
    stTmp = stTmp+" "+us.getApellido2Usuario();
    System.out.println("Nombre del usuario: "+stTmp);
  }

}
import java.util.Scanner; 
import Util.*;

class Usuarios
{
  static Mensajes ut = new Mensajes();
 

  static final int NUSUARIOS = 4;

  static int [] aCodigoUsuario = new int [NUSUARIOS];
  static String [] aUsuarios = new String [NUSUARIOS];

  static String aNombreUsuario;
  static String aApellido1Usuario;
  static String aApellido2Usuario;

  public static void setUsuario(){
   
     String sClassName  = new String (Thread.currentThread().getStackTrace()[1].getClassName());
    String sMethodName = new String (Thread.currentThread().getStackTrace()[1].getMethodName());
    ut.fDevuelveNombreMetodoEjecutandose(sClassName, sMethodName);

    String stTmp = "";
    System.out.println("Introduzca Nombre: ");
    Scanner dato = new Scanner(System.in);
    stTmp = dato.nextLine();
    setNombreUsuario(stTmp);

    stTmp = "";
    System.out.println("Introduzca Apellido1: ");
    dato = new Scanner(System.in);
    stTmp = dato.nextLine();
    setApellido1Usuario(stTmp);

    stTmp = "";
    System.out.println("Introduzca Apellido2: ");
    dato = new Scanner(System.in);
    stTmp = dato.nextLine();
    setApellido2Usuario(stTmp);

  };
  public static void setNombreUsuario(String pNomre){
    aNombreUsuario = pNomre;
  };
  public static void setApellido1Usuario(String pApellido1Usuario){
    aApellido1Usuario = pApellido1Usuario;
  };
  public static void setApellido2Usuario(String pApellido2Usuario){
    aApellido2Usuario = pApellido2Usuario;
  };
  
  public static void setCodigoUsuario(){};


  public static String getUsuario(int pCodigoUsuario){
    return aUsuarios[pCodigoUsuario];
  };
  
  public static String getNombreUsuario(){
    return aNombreUsuario;
  };
  public static String getApellido1Usuario(){
    return aApellido1Usuario;
  };
  public static String getApellido2Usuario(){
    return aApellido2Usuario;
  };
  public static int getCodigoUsuario(int pCodigoUsuario){
    return aCodigoUsuario[pCodigoUsuario];
  };

  public static void getVerUsuario(){
    System.out.println("\n Datos del usuario ");
    System.out.println("\n"+aNombreUsuario+" "+aApellido1Usuario+" "+aApellido2Usuario);
  }

}
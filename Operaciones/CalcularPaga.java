import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java
import Util.*;

class CalcularPaga
{
 
  //static Mensajes ut = new Mensajes();
  
  int tarifaHora = 20;
  int impuestosPorcentaje = 20;
  int horasTrabajadas = 30;
  int pagaBruta = 0;
  int impuestos = 0;
  int pagaNeta = 0;
  

  public void setTarifaHora(int ptarifaHora){
    this.tarifaHora = ptarifaHora;
  };

  public void setImpuestosPorcentaje(int pimpuestosPorcentaje){
    this.impuestosPorcentaje = pimpuestosPorcentaje;
  };

  public void setImpuestos(int pimpuestos){
    this.impuestos = pimpuestos;
  };

  public void setPagaBruta(int ppagaBruta){
    this.pagaBruta = ppagaBruta;
  }

  public void setPagaNeta(int ppagaNeta){
    this.pagaNeta = ppagaNeta;
  }

  void setHorasTrabajadas(int phorasTrabajadas){
    this.horasTrabajadas = phorasTrabajadas;
  }

  public int getTarifaHora(){
    return this.tarifaHora;
  };

  public int getImpuestosPorcentaje(){
    return this.impuestosPorcentaje ;
  };

  public int getImpuestos(){
    return this.impuestos;
  };

  public int getPagaBruta(){
    return this.pagaBruta;
  }

  public int getPagaNeta(){
    return this.pagaNeta;
  }

  public int getHorasTrabajadas(){
    return this.horasTrabajadas;
  }


  //MENSAJES
  static final int VERMENSAJES=0;

  public void getCalcularPaga(final int phorasTrabajadas)
  {
    
    /*String sClassName  = new String (Thread.currentThread().getStackTrace()[1].getClassName());
     String sMethodName = new String (Thread.currentThread().getStackTrace()[1].getMethodName());
    ut.fDevuelveNombreMetodoEjecutandose(sClassName, sMethodName);*/
    
    setHorasTrabajadas(phorasTrabajadas);
    setPagaBruta(getHorasTrabajadas()*getTarifaHora());
    setImpuestos((getPagaBruta()*getImpuestosPorcentaje())/100);
    setPagaNeta(getPagaBruta() - getImpuestos());

  }

  

/*
  public static void getCalcularPaga2(final int phorasTrabajadas, final int ptarifaHora, final int pporcentajeImpuestos )
  {
    // Mensajes ut = new Mensajes();
String sClassName  = new String (Thread.currentThread().getStackTrace()[1].getClassName());
     String sMethodName = new String (Thread.currentThread().getStackTrace()[1].getMethodName());
    ut.fDevuelveNombreMetodoEjecutandose(sClassName, sMethodName);

    int paga = 0;

    fMensajeHorasTrabajadas(phorasTrabajadas);
    fMensajeTarifaHoras(ptarifaHora);
    fMensajeImpuestos(pporcentajeImpuestos);
    

    paga = (phorasTrabajadas * ptarifaHora);
    fMensajePaga(paga);

    paga = paga - (paga * 20) / 100;
    fMensajePagaNeta(paga);

  }*/


  
/*
public static int fIntroducirHorasTrabajadas(){
   //Mensajes ut = new Mensajes();
   String sClassName  = new String (Thread.currentThread().getStackTrace()[1].getClassName());
    String sMethodName = new String (Thread.currentThread().getStackTrace()[1].getMethodName());
    ut.fDevuelveNombreMetodoEjecutandose(sClassName, sMethodName);

    System.out.println("Introduzca horas trabajadas: ");
    Scanner dato = new Scanner(System.in);
    int iHorasTrabajadas = 0;
    iHorasTrabajadas = dato.nextInt();

    return iHorasTrabajadas;

  }
  */

}

  
/*





*/


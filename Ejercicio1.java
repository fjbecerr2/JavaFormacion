import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java

class Ejercicio1
{

  //MENSAJES
  static final int VERMENSAJES=1;
  
   public static void fDevuelveNombreMetodoEjecutandose(final String pClase, final String pMetodo )
  {
    System.out.println("\nEjecutando: Clase->"+pClase);
    System.out.println("            Metodo->"+pMetodo);
  }

  public static int fEjercicio1_CalcularPaga(final int phorasTrabajadas)
  {

    String sMethodName = new String (Thread.currentThread().getStackTrace()[1].getMethodName());
    String sClassName  = new String (Thread.currentThread().getStackTrace()[1].getClassName());
    fDevuelveNombreMetodoEjecutandose(sClassName, sMethodName);


    final int tarifaHora = 20;
    final int impuestosPorcentaje = 20;
    int paga = 0;

    fMensajeHorasTrabajadas(phorasTrabajadas);
    fMensajeTarifaHoras(tarifaHora);
    fMensajeImpuestos(impuestosPorcentaje);
    

    paga = (phorasTrabajadas * tarifaHora);
    fMensajePaga(paga);

    paga = paga - (paga * 20) / 100;
    fMensajePagaNeta(paga);
    return paga;

  }

  public static void fEjercicio1_CalcularPaga2(final int phorasTrabajadas, final int ptarifaHora, final int pporcentajeImpuestos )
  {

    String sMethodName = new String (Thread.currentThread().getStackTrace()[1].getMethodName());
    String sClassName  = new String (Thread.currentThread().getStackTrace()[1].getClassName());
    fDevuelveNombreMetodoEjecutandose(sClassName, sMethodName);

    int paga = 0;

    fMensajeHorasTrabajadas(phorasTrabajadas);
    fMensajeTarifaHoras(ptarifaHora);
    fMensajeImpuestos(pporcentajeImpuestos);
    

    paga = (phorasTrabajadas * ptarifaHora);
    fMensajePaga(paga);

    paga = paga - (paga * 20) / 100;
    fMensajePagaNeta(paga);

  }


  

  public static void fMensajeHorasTrabajadas(final int phorasTrabajadas){
  if (VERMENSAJES==0){
    System.out.println("Horas trabajadas: " + phorasTrabajadas);
  }
}

public static void fMensajeTarifaHoras(final int ptarifaHoras){
  if (VERMENSAJES==0){
    System.out.println("Tarifa Hora "+ ptarifaHoras);
  }
}

public static void fMensajeImpuestos(final int pporcentajeImpuestos){
  if (VERMENSAJES==0){
   System.out.println("Impuestos %: "+ pporcentajeImpuestos);
  }
}

public static void fMensajePaga(final int pPaga){
  if (VERMENSAJES==0){
     System.out.println("Paga antes impuestos: "+ pPaga);
  }
}

public static void fMensajePagaNeta(final int pPagaNeta){
  if (VERMENSAJES==0){
     System.out.println("Paga neta: "+ pPagaNeta);
  }
}

public static int fIntroducirHorasTrabajadas(){
     String sMethodName = new String (Thread.currentThread().getStackTrace()[1].getMethodName());
    String sClassName  = new String (Thread.currentThread().getStackTrace()[1].getClassName());
    fDevuelveNombreMetodoEjecutandose(sClassName, sMethodName);


    System.out.println("Introduzca horas trabajadas: ");
    Scanner dato = new Scanner(System.in);
    int iHorasTrabajadas = 0;
    iHorasTrabajadas = dato.nextInt();

    return iHorasTrabajadas;

  }

}

  
/*





*/


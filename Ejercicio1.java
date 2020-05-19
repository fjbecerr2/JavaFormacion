class Ejercicio1
{
   public static void fDevuelveNombreMetodoEjecutandose(final String pClase, final String pMetodo )
  {
    System.out.println("\nEjecutando: Clase->"+pClase);
    System.out.println("            Metodo->"+pMetodo);
  }

  public static void fEjercicio1_CalcularPaga(final int phorasTrabajadas)
  {

    String sMethodName = new String (Thread.currentThread().getStackTrace()[1].getMethodName());
    String sClassName  = new String (Thread.currentThread().getStackTrace()[1].getClassName());
    fDevuelveNombreMetodoEjecutandose(sClassName, sMethodName);


    final int tarifaHora = 20;
    final int impuestosPorcentaje = 20;
    int paga = 0;

    System.out.println("Horas trabajadas: "+phorasTrabajadas);
    System.out.println("Tarifa Hora: "+tarifaHora);
    System.out.println("Impuestos %: "+impuestosPorcentaje);
    

    paga = (phorasTrabajadas * tarifaHora);
    System.out.println("Paga antes impuestos: "+paga);

    paga = paga - (paga * 20) / 100;
    System.out.println("Paga neta: "+paga);

  }

  public static void fEjercicio1_CalcularPaga2(final int phorasTrabajadas, final int ptarifaHora, final int pporcentajeImpuestos )
  {

    String sMethodName = new String (Thread.currentThread().getStackTrace()[1].getMethodName());
    String sClassName  = new String (Thread.currentThread().getStackTrace()[1].getClassName());
    fDevuelveNombreMetodoEjecutandose(sClassName, sMethodName);

    int paga = 0;

    System.out.println("Horas trabajadas: "+phorasTrabajadas);
    System.out.println("Tarifa Hora: "+ptarifaHora);
    System.out.println("Impuestos %: "+pporcentajeImpuestos);
    

    paga = (phorasTrabajadas * ptarifaHora);
    System.out.println("Paga antes impuestos: "+paga);

    paga = paga - (paga * 20) / 100;
    System.out.println("Paga neta: "+paga);

  }

}

  



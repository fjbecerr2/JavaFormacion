class Main {
  public static void main(String[] args) {
    System.out.println("EJERCICIOS DE JAVA");
    System.out.println("------------------");
    fEj1_CalcularPaga(100);
   
  }

  /**
    Autor: Fco. J. Becerra
    Date: 12/05/2020
    Version: 1.0
    Update-Date:
    Description:
      Calcular la paga neta de un trabajador
    Param:
      horas
      tarifa
      impuestos
    Return:
      paga = (horas * tarifa) - impuestos
  **/
  public static int fEj1_CalcularPaga(
      final int phorasTrabajadas)
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

      return paga;
  }

  public static void fDevuelveNombreMetodoEjecutandose(final String pClase, final String pMetodo ){
      System.out.println("Ejecutando: Clase->"+pClase);
      System.out.println("            Metodo->"+pMetodo);
  }

}
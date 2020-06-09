class interfaceCalcularPaga{

  CalcularPaga cp = new CalcularPaga();

  void Calcular(int horas){
    cp.getCalcularPaga(horas);
  }
  void solicitarTarifaHora(){};
  void solicitarImpuestosPorcentaje(){};
  void solicitarHorasTrabajadas(){};
  void solicitarPagaBruta(){};
  
  void mostrarHorasTrabajadas(){ 
   System.out.println("Horas trabajadas: "+cp.getHorasTrabajadas());
  };

  void mostrarTarifaHora(){
     System.out.println("Tarifa Hora: "+cp.getTarifaHora());
  };

  void mostrarPorcentajeImpuestos(){
    System.out.println("Impuestos %: "+cp.getImpuestosPorcentaje());
  };
 
  void mostrarPagaBruta(){
    System.out.println("Bruto %: "+cp.getPagaBruta());
  };

  void mostrarPagaNeta(){
    System.out.println("Neto %: "+cp.getPagaNeta());
  };


}
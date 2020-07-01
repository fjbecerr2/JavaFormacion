import java.util.Scanner; 

class interfaceCalcularPaga{

   Scanner dato = new Scanner(System.in);
   

  CalcularPaga cp = new CalcularPaga();

  void Calcular(int horas){
    cp.getCalcularPaga(horas);
  }
  void Calcular(){
    cp.getCalcularPaga();
  };

  void solicitarTarifaHora(){
    int idato = 0;
    System.out.println("Tarifa Hora?: ");
    idato = dato.nextInt();
    cp.setTarifaHora(idato);

  };

  void solicitarImpuestosPorcentaje(){
    int idato = 0;
    System.out.println("Impuesto Porcentaje?: ");
    idato = dato.nextInt();
    cp.setImpuestosPorcentaje(idato);
  };

  void solicitarHorasTrabajadas(){
    int idato = 0;
    System.out.println("Horas trabajadas?: ");
    idato = dato.nextInt();
    cp.setHorasTrabajadas(idato);
  };

    
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
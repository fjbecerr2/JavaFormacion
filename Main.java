import Prueba.*;

public class Main {
  public static void main(String[] args) 
  {
    TUsuarios TU = new TUsuarios();
    GeneradorCodigosUsuario gu = new GeneradorCodigosUsuario ();

    System.out.println("EJERCICIOS DE JAVA");
    System.out.println("------------------");
    Ejercicio1.fEjercicio1_CalcularPaga(100);
    /*Ejercicio1.fEjercicio1_CalcularPaga2(100,20,20);
    Ejercicio1.fEjercicio1_CalcularPaga(Ejercicio1.fIntroducirHorasTrabajadas());*/
    
    //TEST JUNIT
    //TestRunner tr = new TestRunner();
    //tr.main();
   
    for (int i=0; i<10; i++){
      System.out.print("Código: ");
      int codigo = gu.setGenerarCodigo();
      System.out.println(codigo);
    }
  }
}

 
import Util.*;
import TDD.*;
import Operaciones.*;

import src.java.*;

public class Main {
  public static void main(String[] args) 
  {
    //TUsuarios TU = new TUsuarios();
    //GeneradorCodigosUsuario gu = new //GeneradorCodigosUsuario ();

    /* [OK]
    CalcularPaga cp = new CalcularPaga();

    System.out.println("EJERCICIOS DE JAVA");
    System.out.println("------------------");
    
    interfaceUsuario itfus = new interfaceUsuario();
    itfus.solicitarNombreUsuario();
    itfus.solicitarApellido1Usuario();
    itfus.solicitarApellido2Usuario();
    
    itfus.mostrarUsuario();

    interfaceCalcularPaga itfcp = new interfaceCalcularPaga();

    // itfcp.Calcular(100); [OK]
    itfcp.solicitarTarifaHora();
    itfcp.solicitarImpuestosPorcentaje();
    itfcp.solicitarHorasTrabajadas();
    itfcp.Calcular();

    itfcp.mostrarHorasTrabajadas();
    itfcp.mostrarTarifaHora();
    itfcp.mostrarPagaBruta();
    itfcp.mostrarPorcentajeImpuestos();
    itfcp.mostrarPagaNeta();*/
    

    /*Usuarios us = new Usuarios();
    us.setUsuario();
    us.getVerUsuario();*/
    //.CalcularPaga.getCalcularPaga(100);
    /*Ejercicio1.fEjercicio1_CalcularPaga2(100,20,20);
    Ejercicio1.fEjercicio1_CalcularPaga(Ejercicio1.fIntroducirHorasTrabajadas());*/
    
    //TEST JUNIT
    //TestRunner tr = new TestRunner(); //[OK]
    //tr.main();
   
    /*for (int i=0; i<10; i++){
      System.out.print("Código: ");
      int codigo = gu.getGenerarCodigo();
      System.out.println(codigo);
    }*/

    /*for(int i=0:10){
       System.out.print("Código: ");
      int codigo = gu.setGenerarCodigo();
      System.out.println(codigo);

    }*/

  //INTERFACE PARA LOS LIBROS
  //intfLibros objintfLibros = new intfLibros();

  //objintfLibros.IntroducirDatosLibro();
  //objintfLibros.MostrarDatosLibro();

  intfLibros objintfLibros2 = new intfLibros();
  objintfLibros2.MostrarDatosLibro();

  Libros obLibro =new Libros();
  System.out.println(obLibro.toString());

  Cliente objCliente = new Cliente();
  System.out.println(objCliente.toString());

  Direccion objDireccion =new Direccion();
  System.out.println(objDireccion.toString());




  }
}

 
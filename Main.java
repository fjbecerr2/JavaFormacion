import java.time.LocalDate; // import the LocalDate class

import Util.*;
import TDD.*;

import src.Libreria.*;

public class Main {
  public static void main(String[] args) 
  {
    System.out.println("Entrando");
    LocalDate myObj = LocalDate.now(); // Create a date object
    System.out.println(myObj); // Display the current date
    //Generar un Cliente [OK]
    //Cliente objCliente = new Cliente();
    //System.out.println(objCliente.toString());

    //Cliente objCliente2 = new Cliente(5);
    //System.out.println(objCliente2.toString());

    //Generar una Direccion [OK]
    //Direccion objDireccion =new Direccion();
    //System.out.println(objDireccion.toString());

    //Direccion objDireccion =new Direccion(10);
    //System.out.println(objDireccion.toString());

    //Generar un Libro[OK]
    //Libros objLibro =new Libros();
    //System.out.println(objLibro.toString());

    //Generar un Código[OK]
    //GeneradorCodigos objCodigo =new GeneradorCodigos();
    //System.out.println(objCodigo.DevolverCodigo());

    //Generar una cadena [OK]
    //GeneradorCadenas objCadena =new GeneradorCadenas();
    //System.out.println(objCadena.GenerarStringAleatoria(8));

    //Generar DNI [OK]
    /*GeneradorDNI objDNI =new GeneradorDNI();
    System.out.println(objDNI.GenerarNumeroDNI());
    System.out.println(objDNI.GenerarLetraDNI());
    System.out.println(objDNI.GenerarDNI());*/

    //Interface [OK]
    //intfLibros objInterface =new intfLibros();
    //objInterface.IntroducirDatosLibro();
    //objInterface.MostrarDatosLibro();

    //Menu
    MenuPrincipal objMenuPrincipal =new MenuPrincipal();
    objMenuPrincipal.MostrarMenu();

  System.out.println("HECHO");


  }
}

 
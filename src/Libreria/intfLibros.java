//package interfaceLibreria;

import java.util.Scanner; 

//import Libros.*;
import src.Libreria.*;
//import src.java.Libros;


public class intfLibros{

  final String MensajeIntroducir = "Escriba ";

  String [] CamposLibro = {
    "Codigo",
    "Nombre",
    "Autor",
    "Editorial",
    "Genero",
    "Número de Paginas",
    "Formato",
    "Precio",
    "En stock [S/N]",
    "Número de ejemplares"
  };

  Libro objLibros = new Libro();
  Libro.Genero objGenero = objLibros.new Genero();
  Libro.Formato objFormato = new Libro.Formato();

  String stDato = new String();

  void IntroducirDatosLibro()
  {
    short shDato = 0;
    int iDato = 0;
    float fDato = 0;
    boolean bDato = true;
    char cDato = 'S';
  
    Scanner dato = new Scanner(System.in);

    System.out.println("Datos del libro");
    System.out.println("---------------");
    for(int i=0; i<CamposLibro.length; i++)
    {
      if(i>0){ //El codigo se genera solo
        System.out.print(MensajeIntroducir+CamposLibro[i]+": ");
        stDato = dato.nextLine();
      }

      switch(i)
      {
        case 0: 
          //iDato = Integer.parseInt(stDato);
          GeneradorCodigos objGenerador = new GeneradorCodigos();
          iDato = objGenerador.DevolverCodigo();
          objLibros.setCodigoLibro(iDato);
        break; 
        case 1: objLibros.setNombreLibro(stDato);
        break;
        case 2: objLibros.setAutorLibro(stDato);
        break;
        case 3: objLibros.setEditorialLibro(stDato);
        break;
        case 4: 
          shDato = Short.valueOf(stDato);
          objLibros.setGeneroLibro(shDato);
        break;
        case 5: 
         shDato = Short.valueOf(stDato);
          objLibros.setNumPaginasLibro(shDato);
        break;
        case 6: 
          shDato =  Short.valueOf(stDato);
          objLibros.setTipoFormatoLibro(shDato);
        break;
        case 7: 
          fDato = Float.parseFloat(stDato);
          objLibros.setPrecioLibro(fDato);
        break;
        case 8: 
          cDato =stDato.charAt(0); //Primer caracter
          objLibros.setEnStockLibroConversor(cDato);
        break;
        case 9: 
          shDato = Short.valueOf(stDato);
          objLibros.setNumEjemplaresDisponibles(shDato);
        break;
      }
    }
  };

  void MostrarDatosLibro()
  {
    System.out.println("Datos del libro");
    System.out.println("---------------");
    
    int contadorCampo = 0;
    String valorCampo = new String();

    for (String campo : CamposLibro) 
    {
    
      switch (contadorCampo) 
      {
        case 0: valorCampo =Integer.toString(objLibros.getCodigoLibro());
        break;
        case 1: valorCampo =objLibros.getNombreLibro();
        break;
        case 2: valorCampo =objLibros.getAutorLibro();
        break;
        case 3: valorCampo =objLibros.getEditorialLibro();
        break;
        case 4: 
        //Devuelve el genero en cadena por el indice
          valorCampo =
        objGenero.getgeneros(objLibros.getGeneroLibro());
        //valorCampo = String.valueOf(objLibros.getGeneroLibro());
        break;
        case 5: valorCampo =String.valueOf(objLibros.getNumPaginasLibro());
        break;
        case 6: 
        valorCampo = objFormato.getFormato(objLibros.getTipoFormatoLibro());
        //valorCampo =String.valueOf(objLibros.getTipoFormatoLibro());
        break;
        case 7: valorCampo =Float.toString(objLibros.getPrecioLibro());
        break;
        case 8: valorCampo =Character.toString(objLibros.getEnStockLibroConversor());
        break;
        case 9: valorCampo =Integer.toString(objLibros.getNumEjemplaresDisponibles());
        break;
      }
        
      MostrarDatosLibros(campo, valorCampo);
       contadorCampo++;
    }
  };

  void MostrarDatosLibros(String pCampo, String pValorCampo)
  {
    System.out.println(pCampo+" : "+pValorCampo);
  };

 
}
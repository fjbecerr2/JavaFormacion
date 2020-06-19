import java.util.Scanner; 

import src.java.*;


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

  Libros objLibros = new Libros();

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
      System.out.print(MensajeIntroducir+CamposLibro[i]+": ");

      stDato = dato.nextLine();

      switch(i)
      {
        case 0: 
          iDato = Integer.parseInt(stDato);
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
        iDato = Integer.parseInt(stDato);
        objLibros.setTipoFormatoLibro(shDato);
        break;
        case 7: 
          fDato = Float.parseFloat(stDato);
          objLibros.setPrecioLibro(fDato);
        break;
        case 8: 
          //bDato =Boolean.parseBoolean(stDato);
          // objLibros.setEnStockLibro(bDato);
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
        case 4: valorCampo = String.valueOf(objLibros.getGeneroLibro());
        break;
        case 5: valorCampo =String.valueOf(objLibros.getNumPaginasLibro());
        break;
        case 6: valorCampo =String.valueOf(objLibros.getTipoFormatoLibro());
        break;
        case 7: valorCampo =Float.toString(objLibros.getPrecioLibro());
        break;
        case 8: valorCampo =Character.toString(objLibros.getEnStockLibroConversor());
        //valorCampo =Boolean.toString(objLibros.getEnStockLibro());
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
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
  "En stock",
  "Número de ejemplares"
};

Libros objLibros = new Libros();

String stDato = new String();

void IntroducirDatosLibro(){

 
  short shDato = 0;
  int iDato = 0;
  float fDato = 0;
  boolean bDato = true;
 
  Scanner dato = new Scanner(System.in);

  System.out.println("Datos del libro");
  System.out.println("---------------");
  for(int i=0; i<CamposLibro.length; i++){
    System.out.print(MensajeIntroducir+CamposLibro[i]+": ");

    switch(i){
      case 0: stDato = dato.nextLine(); //Evita salto de linea automatico
      iDato = Integer.parseInt(stDato);
      break; 
      case 1: stDato = dato.nextLine();
      break;
      case 2:stDato = dato.nextLine();
      break;
      case 3: stDato = dato.nextLine();
      break;
      case 4: stDato = dato.nextLine();
      shDato = Short.valueOf(stDato);
      break;
      case 5: stDato = dato.nextLine();
       shDato = Short.valueOf(stDato);
      break;
      case 6: stDato = dato.nextLine();
       iDato = Integer.parseInt(stDato);
      break;
      case 7: stDato = dato.nextLine();
        fDato = Float.parseFloat(stDato);
      break;
      case 8: stDato = dato.nextLine();
        bDato =Boolean.parseBoolean(stDato);
      break;
      case 9: stDato = dato.nextLine();
        shDato = Short.valueOf(stDato);
      break;
    }

    switch (i) {
      case 0: objLibros.setCodigoLibro(iDato);
      break;
      case 1: objLibros.setNombreLibro(stDato);
      break;
      case 2: objLibros.setAutorLibro(stDato);
      break;
      case 3: objLibros.setEditorialLibro(stDato);
      break;
      case 4: objLibros.setGeneroLibro(shDato);
      break;
      case 5: objLibros.setNumPaginasLibro(shDato);
      break;
      case 6: objLibros.setTipoFormatoLibro(shDato);
      break;
      case 7: objLibros.setPrecioLibro(fDato);
      break;
      case 8: objLibros.setEnStockLibro(bDato);
      break;
      case 9: objLibros.setNumEjemplaresDisponibles(shDato);
      break;
    }
  }
};

void MostrarDatosLibro(){
  System.out.println("Datos del libro");
  System.out.println("---------------");
  int contador = 0;
  for (String i : CamposLibro) {
   System.out.print(i+" : ");

   switch (contador) {
      case 0: 
        System.out.println(objLibros.getCodigoLibro());
      break;
     case 1: System.out.println(objLibros.getNombreLibro());
      break;
      case 2: System.out.println(objLibros.getAutorLibro());
      break;
      case 3: System.out.println(objLibros.getEditorialLibro());
      break;
      case 4: System.out.println(String.valueOf(objLibros.getGeneroLibro()));
      break;
      case 5: System.out.println(String.valueOf(objLibros.getNumPaginasLibro()));
      break;
      case 6: System.out.println(String.valueOf(objLibros.getTipoFormatoLibro()));
      break;
      case 7: System.out.println(objLibros.getPrecioLibro());
      break;
      case 8: System.out.println(Boolean.toString(objLibros.getEnStockLibro()));
      break;
      case 9: System.out.println(Integer.toString(objLibros.getNumEjemplaresDisponibles()));
      break;
    }
    
    contador++;
  }
};



  
}
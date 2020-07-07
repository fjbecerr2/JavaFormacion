package menus;

import java.util.Scanner; 

class MenuPrincipal{
  enum Menu{
    NUEVO,
    CONSULTA,
    PERRO,
    SALIR
  }

  private short opcion;


  public void MostrarMenu(){
    //int seleccion=2; //SALIR
    int pulsador=1;

    Scanner dato = new Scanner(System.in);

    for (Menu objMenu : Menu.values()) {
      System.out.println(pulsador+". "+objMenu);
      pulsador++;
    }
    System.out.print("Opcion: ");
    this.opcion = dato.nextShort();

  }

}
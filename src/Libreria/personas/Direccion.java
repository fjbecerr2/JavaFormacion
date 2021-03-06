package personas;

import generadores.*;

public class Direccion{

  private String calle;
  private int numero;
  private int piso;
  private char puerta;
  private String codigoPostal;

  public Direccion(){
    this.calle ="SIN CALLE";
    this.numero =0;
    this.piso =0;
    this.puerta ='-';
    this.codigoPostal ="-";
  }

  public Direccion(int longCadena){
    GeneradorCadenas objGeneradorCadenas = new GeneradorCadenas();
    GeneradorCodigos objGenerador = new GeneradorCodigos();

    this.calle =objGeneradorCadenas.GenerarStringAleatoria(longCadena);
    this.numero =objGenerador.DevolverCodigo();
    this.piso =objGenerador.DevolverCodigo();
    this.puerta ='-';
    this.codigoPostal ="-";
  }

  public void setCalle(final String pcalle)
  {
    this.calle =pcalle;
  }

  public String getCalle(){
    return this.calle;
  }

  public void setNumero(final int pnumero){
    this.numero =pnumero;
  }
  public int getNumero(){
    return this.numero;
  }

  public void setPiso(final int ppiso){
    this.piso =ppiso;
  } 
  public int getPiso(){
    return this.piso;
  }  

  public void setPuerta(final char ppuerta){
    this.puerta =ppuerta;
  }
  public char getPuerta(){
    return this.puerta;
  }

  public void setCodigoPostal(final String pcodigoPostal){
    this.codigoPostal =pcodigoPostal;
  }
  public String getCodigoPostal(){
    return this.codigoPostal;
  }

  public String toString (){
        String direccion =this.calle;
        direccion +=" "+this.numero;
        direccion +=" "+this.piso;
        direccion +=" "+this.puerta;
        direccion +=" "+this.codigoPostal;
        
        return direccion;
    }
}

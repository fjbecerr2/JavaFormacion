
public class Libro
{
 
  final String version = "0";
  final String fechaCreacion = "18062020";
  final String fechaUpdate = "18062020";
  final char estado = 'D'; 

  class Genero{ //Clase interna
    private String[] tipo ={
      "Novela", "Relato", "Poesia"
    };
    private String[] generos ={
      "Histórica", "Romantica", "Terror"
    };

    public String getTipo(final short pTipo){
      return tipo[pTipo];
    }

    public String getgeneros(final short pGenero){
      return generos[pGenero];
    }
  }

  class Formato{
    private String[] formato ={
      "Tapa Dura", "Tapa Blanda", "Bolsillo" 
    };

    public String getFormato(final short pFormato){
      return formato[pFormato];
    }
  }
  /*
  D- Desarrollo
  T- Testando
  O- Operativa
  */
  /*

  */

  //Comparar datos libros txt.toUpperCase()

  private int codigoLibro;
  private String nombreLibro;
  private String autorLibro;
  private String editorialLibro;
  private short generoLibro;
  private short numPaginasLibro;
  private short tipoFormatoLibro;
  private float precioLibro;
  private boolean enStockLibro;
  private short numEjemplaresDisponibles; 

  public Libro(){
    codigoLibro =0;
    nombreLibro ="NombreDesconocido";
    autorLibro ="AutorDesconocido";
    editorialLibro ="EditorialDesconocida";
    generoLibro =0;
    numPaginasLibro =0;
    tipoFormatoLibro =0;
    precioLibro =0;
    enStockLibro =false;
    numEjemplaresDisponibles =0; 
  }

  void setCodigoLibro(final int pcodigoLibro){
    this.codigoLibro = pcodigoLibro;
  }

  int getCodigoLibro(){
    return this.codigoLibro;
  }

  void setNombreLibro(final String pnombreLibro){
    this.nombreLibro = pnombreLibro;
  }

  String getNombreLibro(){
    return this.nombreLibro;
  }

  void setAutorLibro(final String pautorLibro){
    this.autorLibro = pautorLibro;
  }

  String getAutorLibro(){
    return this.autorLibro;
  }

  void setEditorialLibro(final String peditorialLibro){
    this.editorialLibro = peditorialLibro;
  }

  String getEditorialLibro(){
    return this.editorialLibro;
  }

  void setGeneroLibro(final short pgeneroLibro){
    this.generoLibro = pgeneroLibro;
  }

  short getGeneroLibro(){
    return this.generoLibro;
  }

  void setNumPaginasLibro(final short pnumPaginasLibro){
    this.numPaginasLibro = pnumPaginasLibro;
  }

  short getNumPaginasLibro(){
    return this.numPaginasLibro;
  }

  void setTipoFormatoLibro(final short ptipoFormatoLibro){
    this.tipoFormatoLibro = ptipoFormatoLibro;
  }

  short getTipoFormatoLibro(){
    return this.tipoFormatoLibro;
  }

  void setPrecioLibro(final float pprecioLibro){
    this.precioLibro = pprecioLibro;
  }

  float getPrecioLibro(){
    return this.precioLibro;
  }
  

  void setEnStockLibro(final boolean penStockLibro){
    this.enStockLibro = penStockLibro;
  }

  boolean getEnStockLibro(){
    return this.enStockLibro;
  } 

  void setEnStockLibroConversor(final char penStockLibro){
    this.enStockLibro = false;
    if (Character.toUpperCase(penStockLibro) == 'S'){
      this.enStockLibro = true;
    };
  }

  char getEnStockLibroConversor(){
    char enStockLibroConversor = 'N';
    if (this.enStockLibro == true){
        enStockLibroConversor = 'S';
    }
    return enStockLibroConversor;
  }


  void setNumEjemplaresDisponibles(final short pnumEjemplaresDisponibles){
    this.numEjemplaresDisponibles = pnumEjemplaresDisponibles;
  }

  short getNumEjemplaresDisponibles(){
    return this.numEjemplaresDisponibles;
  }



  public String toString (){
    String libro =Integer.toString(this.codigoLibro);
    libro +=" "+this.nombreLibro;
    libro +=" "+this.autorLibro;
    libro +=" "+this.editorialLibro;
    libro +=" "+this.generoLibro;
    libro +=" "+this.numPaginasLibro;
    libro +=" "+this.tipoFormatoLibro;
    libro +=" "+this.precioLibro;
    libro +=" "+this.enStockLibro;
    libro +=" "+this.numEjemplaresDisponibles;
          
    return libro;
  }

}

 
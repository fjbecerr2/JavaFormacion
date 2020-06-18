public class Libros {
 
final String version = "0";
final String fechaCreacion = "18062020";
final String fechaUpdate = "18062020";
final char estado = 'D'; 

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


void setNumEjemplaresDisponibles(final short pnumEjemplaresDisponibles){
  this.numEjemplaresDisponibles = pnumEjemplaresDisponibles;
}

short getNumEjemplaresDisponibles(){
   return this.numEjemplaresDisponibles;
}

}
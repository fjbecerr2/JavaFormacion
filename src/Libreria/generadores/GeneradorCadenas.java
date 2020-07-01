package generadores;

import java.util.Random;

public class GeneradorCadenas
{
  
  //65 a 90 MAYÚSCULAS
  //97 a 122 Minúsculas

  private static final int minMinusculas = 97;
  private static final int maxMinusculas = 122;

  private static final int minMayusculas = 65;
  private static final int maxMayusculas = 90;

  public static char GenerarLetraMinuscula(){
    Random r = new Random();
    int codigo = r.nextInt(maxMinusculas -minMinusculas)+1+minMinusculas;
    char letra =(char)codigo;
    return letra;
  };

  public static char GenerarLetraMayuscula(){
    Random r = new Random();
    int codigo = r.nextInt(maxMayusculas -minMayusculas)+1+minMayusculas;
    char letra =(char)codigo;
    return letra;
  };

  public static String GenerarStringAleatoria(int longitud)
  {
    String temporal = "";
    char chTemporal = ' ';

    for(int i=0; i<longitud; i++){
      
      if(i%2==0){
        chTemporal =GenerarLetraMinuscula();
        temporal +=chTemporal;
      }
      else{
        chTemporal =GenerarLetraMayuscula();
        temporal +=chTemporal;
      }

    }
    
    return temporal;
  }
}
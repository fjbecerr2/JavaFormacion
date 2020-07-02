package generadores;
import java.util.Random;


public class GeneradorCodigos{

  final static int GENERADOR = 10000;
  static int codigo = 0;

  void GeneradorCodigos(){
    GenerarCodigo();
  }

  public static void  GenerarCodigo(){
    Random r = new Random();
    codigo = r.nextInt(GENERADOR)+1;  // Entre 0 y GENERADOR, más 1.

  };

  public static int DevolverCodigo(){
    GenerarCodigo();
    return codigo;
  }


}
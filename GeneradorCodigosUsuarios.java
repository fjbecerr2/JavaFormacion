class GeneradorCodigosUsuarios{

  final int BASERANDOM  = 100;

  public static int setGenerarCodigo(){
    return (int)(Math.random()*BASERANDOM+1);
  }
   
}
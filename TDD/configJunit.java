public class configJunit
{
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";
  public static final String ANSI_RESET = "\u001B[0m";

  public static final String testInicio = ANSI_YELLOW+"\n -INICIO JUNIT-"+ANSI_RESET;
  public static final String testFin = ANSI_YELLOW+"-FIN JUNIT-"+ANSI_RESET;

  public static final String testERROR = ANSI_RED+"\nTEST [ERROR]"+ANSI_RESET;
  public static final String testOK = ANSI_GREEN+"\nTEST [OK]"+ANSI_RESET;

  public static final String testFallados =  ANSI_RED+"\n -TEST FALLADOS -> "+ANSI_RESET;

  public static final String testLanzados = ANSI_BLUE+"-TEST LANZADOS -> "+ANSI_RESET;

  public static String getTestIni(){
    return testInicio;
  }

  public static String getTestFin(){
    return testFin;
  }

  public static String getTestError(){
    return testERROR;
  }

   public static String getTestOK(){
    return testOK;
  }

  public static String getTestFallados(){
    return  testFallados;
  }

  public static String getTestFallados(int pnumeroTest){
    return testFallados+pnumeroTest;
  }

  public static String getTestLanzados(){
    return  testLanzados;
  }

  public static String getTestLanzados(int pnumeroTest){
    return testLanzados+pnumeroTest;
  }
  
}
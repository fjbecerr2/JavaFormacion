import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner 
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

  public static void main() 
  {
    Result result = JUnitCore.runClasses(TestJunit.class);
    
    int numeroTest = 0;

    System.out.println(ANSI_YELLOW+"-INICIO JUNIT-"+ANSI_RESET);
    
    for (Failure failure : result.getFailures()) 
    {
      System.out.println(failure.toString());
      numeroTest++;
    }
   
    System.out.println(ANSI_YELLOW+"-FIN JUNIT-"+ANSI_RESET);
    System.out.println(ANSI_BLUE+"-TEST LANZADOS -> "+ANSI_RESET+TestJunit.contador);
    System.out.println(ANSI_RED+"-TEST FALLADOS -> "+ANSI_RESET+numeroTest);
    System.out.println(result.wasSuccessful());
  }
}
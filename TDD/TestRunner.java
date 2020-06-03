import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
//import configJunit.*;

public class TestRunner 
{

  public static void main() 
  {
    Result result = JUnitCore.runClasses(TestJunit.class);
    
    configJunit cfg = new configJunit();

    int numeroTest = 0;

    System.out.println(cfg.getTestIni());
    
    for (Failure failure : result.getFailures()) 
    {
      System.out.println("Lanzando: "+failure.toString());
      numeroTest++;
    }
   
    System.out.println(cfg.getTestFin());

    System.out.println(cfg.getTestLanzados(TestJunit.contador));
    System.out.println(cfg.getTestFallados());
    System.out.println(result.wasSuccessful());
  }
}
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner 
{
  public static void main() 
  {
    Result result = JUnitCore.runClasses(TestJunit.class);
    
    int numeroTest = 0;

    for (Failure failure : result.getFailures()) 
    {
      System.out.println(failure.toString());
      numeroTest++;
    }
   
    System.out.println("-FIN JUNIT-");
     System.out.println("-TEST LANZADOS -> "+TestJunit.contador);
    System.out.println("-TEST FALLADOS -> "+numeroTest);
    System.out.println(result.wasSuccessful());
  }
}
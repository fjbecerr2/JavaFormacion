//Se importa en el proyecto el package junit:junit
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestJunit
{
  static public int contador = 0;

  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_RESET = "\u001B[0m";

  @Test
  public void testCalcularPaga1() 
  {
    contador++;
    assertEquals(ANSI_RED+"\nTEST [ERROR]"+ANSI_RESET, 160, Ejercicio1.fEjercicio1_CalcularPaga(100));
    
  }

  @Test
  public void testCalcularPaga2() 
  {
    contador++;
    assertEquals(ANSI_RED+"\nTEST [ERROR]"+ANSI_RESET, 160, Ejercicio1.fEjercicio1_CalcularPaga(100));
    //assertNotEquals("\nTEST [OK]", 160, Ejercicio1.fEjercicio1_CalcularPaga(100));
  }

  @Test
  public void testCalcularPaga3() 
  {
    contador++;
    //assertNotEquals("\nTEST [OK]", 160, Ejercicio1.fEjercicio1_CalcularPaga(100));
  }


 
}
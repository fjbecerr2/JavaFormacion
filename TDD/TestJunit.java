//Se importa en el proyecto el package junit:junit
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
//import configJunit.*;

public class TestJunit
{

  configJunit cfg = new configJunit();

  static public int contador = 0;

  @Test
  public void testCalcularPaga1() 
  {
    contador++;
   // assertEquals(ANSI_RED+"\nTEST [ERROR]"+ANSI_RESET, 160, CalcularPaga.getCalcularPaga(100));
   assertEquals(cfg.getTestError(), 160, CalcularPaga.getCalcularPaga(100));
    
  }

  @Test
  public void testCalcularPaga2() 
  {
    contador++;
    //assertEquals(ANSI_RED+"\nTEST [ERROR]"+ANSI_RESET, 160, CalcularPaga.getCalcularPaga(100));
    //assertNotEquals("\nTEST [OK]", 160, Ejercicio1.fEjercicio1_CalcularPaga(100));
    assertEquals(cfg.getTestError(), 160, CalcularPaga.getCalcularPaga(100));
  }

  @Test
  public void testCalcularPaga3() 
  {
    contador++;
    //assertNotEquals("\nTEST [OK]", 160, Ejercicio1.fEjercicio1_CalcularPaga(100));
  }


 
}
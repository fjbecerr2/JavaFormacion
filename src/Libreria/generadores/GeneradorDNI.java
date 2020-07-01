package generadores;

import java.util.Random;

public class GeneradorDNI
{

  private static final int GENERADOR = 9;
  private static final int minMayusculas = 65;
  private static final int maxMayusculas = 90;

  private static int codigo = 0;

  private static String DNI;

  public static int GenerarNumeroDNI() {
    Random r = new Random();
    codigo = r.nextInt(GENERADOR) + 1; // Entre 0 y GENERADOR, más 1.
    System.out.println("NUMERO GENERADO: " + codigo);
    return codigo;
  };

  public static char GenerarLetraDNI() {
    Random r = new Random();
    int codigo = r.nextInt(maxMayusculas - minMayusculas) + 1 + minMayusculas;
    char letra = (char) codigo;
    return letra;
  };

  public static String GenerarDNI() {
    String temporal = "";
    char chTemporal = ' ';

    for (int i = 0; i < 8; i++) {
      temporal += GenerarNumeroDNI();
    }

    chTemporal = GenerarLetraDNI();
    temporal += chTemporal;

    System.out.println("DNI GENERADO: " + temporal);
    DNI = temporal;
    return DNI;
  }

}
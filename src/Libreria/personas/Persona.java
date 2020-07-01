package personas;

//CLASE ABSTRACTA PARA CLIENTES, OPERADORES, ETC
abstract class Persona{

  protected String nombre;
  protected String apellido1;
  protected String apellido2;
  protected String telefono;
  protected String dni;

  public abstract void setNombre(final String pnombre);
  public abstract void setApellido1(final String papellido1);
  public abstract void setApellido2(final String papellido2);
  public abstract void setTelefono(final String telefono);
  public abstract void setDNI(final String dni);

  public abstract String getNombre();
  public abstract String getApellido1();
  public abstract String getApellido2();
  public abstract String getTelefono();
  public abstract String getDNI();

}
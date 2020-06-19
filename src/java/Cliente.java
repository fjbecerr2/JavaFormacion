class Cliente extends Persona {
  
  private String dni;

  public void Cliente(){
    this.nombre ="SIN NOMBRE";
    this.apellido1 ="SIN APELLIDO1";
    this.apellido2 ="SIN APELLIDO2";
    this.telefono ="SIN TELEFONO";
    this.dni ="SIN DNI";
  }

  public void setNombre(final String pnombre){
    this.nombre =pnombre;
  };

  public void setApellido1(final String papellido1){
    this.apellido1 =papellido1;
  }

  public void setApellido2(final String papellido2){
    this.apellido2 =papellido2;
  }
  
  public void setTelefono(final String ptelefono){
    this.telefono =ptelefono;
  }

  public void setDni(final String pdni){
    this.dni =pdni;
  }

  public String getNombre(){
    return this.nombre;
  }

  public String getApellido1(){
    return this.apellido1;
  }
  
  public String getApellido2(){
    return this.apellido2;
  }
  
  public String getTelefono(){
    return this.telefono;
  }

  public String getDni(){
    return this.dni;
  }

  public String toString (){
        String cliente =this.nombre;
        cliente +=" "+this.apellido1;
        cliente +=" "+this.apellido2;
        cliente +=" "+this.telefono;
        cliente +=" "+this.dni;
        
        return cliente;
    }
}
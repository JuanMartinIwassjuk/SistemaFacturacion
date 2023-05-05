package Servicios;

public class Contratado extends Servicio{
  private double tarifaMensualUnica;

  public Contratado(double tarifaMensualUnica){
    this.tarifaMensualUnica=tarifaMensualUnica;
  }
  @Override
  public double precio() {
    return tarifaMensualUnica;
  }
}

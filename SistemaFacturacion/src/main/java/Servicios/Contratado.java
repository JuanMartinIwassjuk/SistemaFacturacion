package Servicios;

public class Contratado extends Servicio{
  private double tarifaMensualUnica;
  @Override
  public double precio() {
    return tarifaMensualUnica;
  }
}

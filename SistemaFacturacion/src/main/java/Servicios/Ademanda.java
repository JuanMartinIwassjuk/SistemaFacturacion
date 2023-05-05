package Servicios;

public class Ademanda extends Servicio{
  private double valor;
  private Integer unidadPrestada;

  public double precio() {
    return valor*unidadPrestada;
  }
}

package Servicios;

public class Ademanda extends Servicio{
  private double valor;
  private Integer unidadPrestada;

  public Ademanda(double valor,Integer unidadPrestada){
    this.unidadPrestada=unidadPrestada;
    this.valor=valor;
  }

  public double precio() {
    return valor*unidadPrestada;
  }
}

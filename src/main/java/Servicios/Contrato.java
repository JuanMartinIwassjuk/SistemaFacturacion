package Servicios;

public class Contrato {
  private double valorEspecifico;
  private Servicio servicio;
  public Contrato(Servicio servicio){ // si no se especifica un valor por cliente el valor del servicio va a ser el general para todos los clientes
    this.servicio = servicio;
    this.valorEspecifico = servicio.precio();
  }
  public Contrato(Servicio servicio,double valorEspecifico){
    this.servicio = servicio;
    this.valorEspecifico = valorEspecifico;
  }

  public double precio() {
    return valorEspecifico;
  }
  public double getValorEspecifico() {
    return valorEspecifico;
  }
}

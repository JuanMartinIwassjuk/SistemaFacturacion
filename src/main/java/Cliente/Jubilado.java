package Cliente;

public class Jubilado extends TipoCliente{
  public static double porcentajeImpuestoAdemanda=0.1;
  public static double porcentajeImpuestoContratado=0;


  protected double porcentajeImpuestoAdemanda() {
    return porcentajeImpuestoAdemanda;
  }

  protected double porcentajeImpuestoContratado() {
    return porcentajeImpuestoContratado;
  }


}

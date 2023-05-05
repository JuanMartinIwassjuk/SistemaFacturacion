package Cliente;

public class Normal extends TipoCliente{
  public static double porcentajeImpuestoAdemanda=0.21;
  public static double porcentajeImpuestoContratado=0.21;

  protected double porcentajeImpuestoAdemanda() {
    return porcentajeImpuestoAdemanda;
  }

  protected double porcentajeImpuestoContratado() {
    return porcentajeImpuestoContratado;
  }

}

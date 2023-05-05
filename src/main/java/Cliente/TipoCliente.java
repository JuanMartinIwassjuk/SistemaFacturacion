package Cliente;

public abstract class TipoCliente {
                         // el tipo de cliente tiene la responsabilidad de facturar, ya q dependiendo de este puede cambiar el precio de facturacion
                         // ademas puede que a futuro se agreguen mas tipos de cliente, y con este diseño se podran agregar facilmente aumentando la extensibilidad del sistema
                         // resuelvo con template method para no repetir logica
  protected abstract  double porcentajeImpuestoAdemanda();
  protected abstract double porcentajeImpuestoContratado();
  public double facturar(double totalContratados, double totalAdemanda){
     return (totalContratados*(this.porcentajeImpuestoContratado()+1)) + ((this.porcentajeImpuestoAdemanda()+1)*totalAdemanda);
    }
}

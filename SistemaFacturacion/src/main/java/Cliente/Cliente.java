package Cliente;

import Servicios.Contrato;
import Servicios.Servicio;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
  private static double montoMinimoParaDescuento = 10000;
  private List<Servicio> servicios = new ArrayList<>();
  private List<Contrato> contratos = new ArrayList<>();
  private TipoCliente tipo;
  public double facturar(){
    return tipo.facturar(this.totalApagarContratados(),this.totalApagarAdemanda());
  }
  public double totalApagarContratados(){
    return this.contratos.stream().mapToDouble(c->c.getValorEspecifico()).sum();
  }
  public double totalApagarAdemanda(){
    double total = this.servicios.stream().mapToDouble(s->s.precio()).sum();
    if ( total > montoMinimoParaDescuento ){
      return (total-((total-montoMinimoParaDescuento)*0.25));
    }
    else
      return total;

  }
}

import Servicios.Ademanda;
import Servicios.Contratado;
import Cliente.Cliente;
import Cliente.TipoCliente;
import Cliente.Jubilado;
import Cliente.Normal;
import Servicios.Contrato;
import Servicios.Servicio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFacturador {
  Contratado tvCable;
  Ademanda impresiones5unidades;

  Ademanda impresiones1unidad;
  Ademanda sesionesDeRV;

  Ademanda sesionesDeRV20;
  Contratado datosMoviles;
  Contratado datosMoviles1000;
  Cliente ameliaCarmona;
  Cliente nicolasPereyra;
  Cliente hectorCuper;





  @BeforeEach
  public void init() {

    tvCable = new Contratado(5000);

    impresiones5unidades = new Ademanda(200,5);

    sesionesDeRV = new Ademanda(1500,2);
    sesionesDeRV20= new Ademanda(1500,20);

    datosMoviles = new Contratado(5000);

    datosMoviles1000 = new Contratado(1000);

    impresiones1unidad = new Ademanda(200,1);

    ameliaCarmona = new Cliente(new Jubilado());
    ameliaCarmona.agregarContrato(new Contrato(tvCable));
    ameliaCarmona.agregarServicio(impresiones5unidades);

    nicolasPereyra = new Cliente(new Normal());
    nicolasPereyra.agregarContrato(new Contrato(tvCable));
    nicolasPereyra.agregarContrato(new Contrato(datosMoviles1000));
    nicolasPereyra.agregarServicio(sesionesDeRV);
    nicolasPereyra.agregarServicio(impresiones1unidad);

    hectorCuper = new Cliente(new Normal());
    hectorCuper.agregarContrato(new Contrato(datosMoviles));
    hectorCuper.agregarContrato(new Contrato(sesionesDeRV20));


  }
  @Test
  public void AmeliaTieneQueFacturar6100() {
    Assertions.assertEquals(6100,ameliaCarmona.facturar());

  }
  @Test
  public void nicolasPereyraTieneQueFacturar11132() {
    Assertions.assertEquals(11132,nicolasPereyra.facturar());

  }
  @Test
  public void hectorTieneQueFacturar42350() {
    Assertions.assertEquals(42350,hectorCuper.facturar());

  }

  }

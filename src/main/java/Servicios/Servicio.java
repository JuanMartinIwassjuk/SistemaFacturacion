package Servicios;

import java.time.LocalDateTime;

public abstract class Servicio {
  private LocalDateTime fecha;
  public abstract double precio();
  public LocalDateTime fecha(){
    return this.fecha;
  }

}

import java.util.Date;
import java.util.List;

/**
 * Created by ANA_SERVICIO5 on 24/09/2016.
 */
public class Viatico {
    private List<Ruta> rutas;
    private Empleado empleado;
    private String observacion;
    private int estado;
    private Date fecha;

    public Viatico(List<Ruta> rutas, Empleado empleado, String observacion, int estado, Date fecha) {
        this.rutas = rutas;
        this.empleado = empleado;
        this.observacion = observacion;
        this.estado = estado;
        this.fecha = fecha;
    }



}

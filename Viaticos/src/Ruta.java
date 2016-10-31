import java.util.Date;

/**
 * Created by ANA_SERVICIO5 on 24/09/2016.
 */
public class Ruta {
    private Date fechaIncial;
    private Date fechaFinal;
    private Ubicacion origen;
    private Ubicacion destino;

    public Ruta(Date fechaIncial, Date fechaFinal, Ubicacion origen, Ubicacion destino) {
        this.fechaIncial = fechaIncial;
        this.fechaFinal = fechaFinal;
        this.origen = origen;
        this.destino = destino;
    }

    public Date getFechaIncial() {
        return fechaIncial;
    }

    public void setFechaIncial(Date fechaIncial) {
        this.fechaIncial = fechaIncial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Ubicacion getOrigen() {
        return origen;
    }

    public void setOrigen(Ubicacion origen) {
        this.origen = origen;
    }

    public Ubicacion getDestino() {
        return destino;
    }

    public void setDestino(Ubicacion destino) {
        this.destino = destino;
    }
}

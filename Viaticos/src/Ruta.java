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


}

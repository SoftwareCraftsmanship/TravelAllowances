/**
 * Created by ANA_SERVICIO5 on 24/10/2016.
 */
public class Tarifas {
    private Ubicacion origen;
    private Ubicacion destino;
    private Double viaticoPer;
    private Double viaticoNoPer;
    private Double Transporte;
    private Double Urbano;

    public Tarifas(Ubicacion origen, Ubicacion destino, Double viaticoPer, Double viaticoNoPer, Double transporte, Double urbano) {
        this.origen = origen;
        this.destino = destino;
        this.viaticoPer = viaticoPer;
        this.viaticoNoPer = viaticoNoPer;
        Transporte = transporte;
        Urbano = urbano;
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

    public Double getViaticoPer() {
        return viaticoPer;
    }

    public void setViaticoPer(Double viaticoPer) {
        this.viaticoPer = viaticoPer;
    }

    public Double getViaticoNoPer() {
        return viaticoNoPer;
    }

    public void setViaticoNoPer(Double viaticoNoPer) {
        this.viaticoNoPer = viaticoNoPer;
    }

    public Double getTransporte() {
        return Transporte;
    }

    public void setTransporte(Double transporte) {
        Transporte = transporte;
    }

    public Double getUrbano() {
        return Urbano;
    }

    public void setUrbano(Double urbano) {
        Urbano = urbano;
    }
}

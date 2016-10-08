/**
 * Created by ANA_SERVICIO5 on 24/09/2016.
 */
public class Empleado {
    private String tipoDoc;
    private String documento;
    private String primerNombre;
    private String segundoNombre;
    private Cargo cargo;


    public Empleado(String tipoDoc, String documento, String primerNombre, String segundoNombre, Cargo cargo) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.cargo = cargo;
    }
}

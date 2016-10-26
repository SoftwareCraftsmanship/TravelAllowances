import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANA_SERVICIO5 on 24/09/2016.
 */
public class Ubicacion {
    private int idUbicacion;
    private String codigoUbi;
    private String nobreUbi;
    private boolean pernocta;


    public Ubicacion(String codigoUbi,String nobreUbi, boolean pernocta){
        this.codigoUbi = codigoUbi;
        this.nobreUbi = nobreUbi;
        this.pernocta = pernocta;
    }

    public void ActualizaUbi(Ubicacion u){
    }

    public void guardar(){
        System.out.println("Exito al guardar");
    }

    @Override
    public String toString() {
        return "Ubicacion{" +
                "codigoUbi='" + codigoUbi + '\'' +
                ", nobreUbi='" + nobreUbi + '\'' +
                '}';
    }
}

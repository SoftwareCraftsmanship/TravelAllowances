import java.util.List;

/**
 * Created by ANA_SERVICIO5 on 28/10/2016.
 */
public class GestionarUbicacion implements IGestionarUbicacion {


    public Ubicacion buscarById(int id) {
       Ubicacion ub = new Ubicacion();
        List<Ubicacion> ubicaciones = ub.getUbicacionList();

        for (Ubicacion ubi : ubicaciones) {
            if (ubi.getIdUbicacion() == id) {
                 ub = ubi;
                 break;
            }
         }
        return ub;

    }

}

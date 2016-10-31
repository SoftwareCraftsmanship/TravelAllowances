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

    IGestionarUbicacion ig;

    public Ubicacion (IGestionarUbicacion ig){
        this.ig=ig;
    }

    public Ubicacion(){

    }

    public Ubicacion(String codigoUbi,String nobreUbi, boolean pernocta){
        this.codigoUbi = codigoUbi;
        this.nobreUbi = nobreUbi;
        this.pernocta = pernocta;
    }

    public Ubicacion buscarById(int id){
        return ig.buscarById(id);
    }

    public List<Ubicacion> getUbicacionList(){
        List<Ubicacion> ubicacionList = new ArrayList<Ubicacion>();
        ubicacionList.add(new Ubicacion("13001","Cartagena",true));
        ubicacionList.add(new Ubicacion("08001","Barranquilla",true));
        ubicacionList.add(new Ubicacion("47001","Santa Marta",true));
        return ubicacionList;
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

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }
}

import java.util.List;

/**
 * Created by ANA_SERVICIO5 on 20/10/2016.
 */
public class GenericCrud<G> implements IConsultar<G>, IEditar<G>, ICrear<G> {

    public <G> G crear(G entidad) {
        return entidad;
    }

    public <G> G Editar(G entidad) {
        return entidad;
    }

    public <G>  List consultarTodo(Class<G> entidad) {
        return null;
    }

    public <G1> G1 consultarById(int id) {
        return null;
    }

}

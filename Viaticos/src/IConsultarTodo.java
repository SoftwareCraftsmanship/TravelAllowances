import java.util.List;

/**
 * Created by MutualSER on 20/10/2016.
 */
interface IConsultarTodo<G> {

    public <G> List  consultarTodo (Class<G> entidad);

}

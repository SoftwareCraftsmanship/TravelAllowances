package Persist;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import Utilidad.Excepciones;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
/**
 * Created by ANA_SERVICIO5 on 20/10/2016.
 */
public class GenericCrud<G> implements IConsultar<G>, IEditar<G>, ICrear<G> {
    private static final Logger LOGGER =  Logger.getLogger(GenericCrud.class.getClass().getName());
    private G entidad;
    public GenericCrud () throws IOException, Excepciones {
        try {
            PropertyConfigurator.configure((new FileInputStream("Viaticos/src/utilidad/configLog.properties")));
            this.entidad = entidad;
        }catch (FileNotFoundException e) {
            throw new Excepciones("No se encontro archivo de configuracion",e);
        }


    }

    public <G> G crear(G entidad) {
        LOGGER.info("Guardado Exitoso");
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

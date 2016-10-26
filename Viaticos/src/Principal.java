import Persist.GenericCrud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ANA_SERVICIO5 on 21/10/2016.
 */
public class Principal {

    private static List<Ubicacion> ubicacionList = new ArrayList<Ubicacion>();

    public static void main(String args[]){

        prueba();
        cargarDatos();
    }

    public static void prueba(){
        try {
            GenericCrud generic = new GenericCrud();
            generic.crear(new Object());
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
    }

    private static void cargarDatos(){

        ubicacionList.add(new Ubicacion("13001","Cartagena",true));
        ubicacionList.add(new Ubicacion("08001","Barranquilla",true));
        ubicacionList.add(new Ubicacion("47001","Barranquilla",true));

        Iterator iter = ubicacionList.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }

}


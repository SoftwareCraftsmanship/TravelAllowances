import Persist.GenericCrud;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ANA_SERVICIO5 on 21/10/2016.
 */
public class Principal {

    private static List<Ubicacion> ubicacionList = new ArrayList<Ubicacion>();

    public static void main(String args[]){
        BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
        int origen;
        int destino;
        try {
            System.out.print("Ubicacion de Origen");
            origen = Integer.parseInt(bf.readLine());
            System.out.print("Ubicacion de destino");
            destino = Integer.parseInt(bf.readLine());
            IGestionarUbicacion gu = new GestionarUbicacion();
            Ubicacion ubi = new Ubicacion(gu);
            System.out.print(gu.buscarById(origen).getNobreUbi());

        }catch(Exception e){
         e.printStackTrace();
        }


    }

    public static void prueba(){
        try {
            GenericCrud generic = new GenericCrud();
            generic.crear(new Object());
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
    }



}


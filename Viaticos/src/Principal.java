/**
 * Created by ANA_SERVICIO5 on 21/10/2016.
 */
public class Principal {
    public static void main(String args[]){

        prueba();
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

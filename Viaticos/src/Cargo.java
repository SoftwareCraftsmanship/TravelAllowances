/**
 * Created by ANA_SERVICIO5 on 24/09/2016.
 */
public class Cargo{
    private int idCargo;
    private String nombre;
    private TipoCargo tipocargo;

    public Cargo(int idCargo, String nombre, TipoCargo tipocargo) {
        this.idCargo = idCargo;
        this.nombre = nombre;
        this.tipocargo = tipocargo;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public TipoCargo getTipocargo() {
        return tipocargo;
    }

    public void setTipocargo(TipoCargo tipocargo) {
        this.tipocargo = tipocargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cargo cargo = (Cargo) o;

        if (idCargo != cargo.idCargo) return false;
        if (nombre != null ? !nombre.equals(cargo.nombre) : cargo.nombre != null) return false;
        return tipocargo != null ? tipocargo.equals(cargo.tipocargo) : cargo.tipocargo == null;

    }

    @Override
    public int hashCode() {
        int result = idCargo;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (tipocargo != null ? tipocargo.hashCode() : 0);
        return result;
    }


}

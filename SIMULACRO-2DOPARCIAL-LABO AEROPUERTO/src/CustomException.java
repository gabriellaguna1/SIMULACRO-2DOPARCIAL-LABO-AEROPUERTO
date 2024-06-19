public class CustomException extends Exception {
    public Integer capacidad;

    public CustomException(Integer capacidad) {
        super("la capacidad del aeropuerto es "+ capacidad+" y menor a la capacidad requerida");
        this.capacidad= capacidad;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }


}

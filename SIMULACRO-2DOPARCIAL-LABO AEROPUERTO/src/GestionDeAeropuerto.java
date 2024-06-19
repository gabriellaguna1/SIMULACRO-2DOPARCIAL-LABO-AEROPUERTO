import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestionDeAeropuerto {
    private static final File jSonFile= new File("C:\\Users\\lagun\\IdeaProjects\\SIMULACRO-2DOPARCIAL-LABO\\G6UyHYt7.json");
    private Aeropuerto[]ListaDeAeropuertos= pasarDeJsonAArray();
    private List<Aeropuerto>aeropuertoXCapacidad= new ArrayList<>();

    public GestionDeAeropuerto() throws IOException {
    }

    public Aeropuerto[] getListaDeAeropuertos() {
        return ListaDeAeropuertos;
    }

    public void setListaDeAeropuertos(Aeropuerto[] listaDeAeropuertos) {
        ListaDeAeropuertos = listaDeAeropuertos;
    }

    public List<Aeropuerto> getAeropuertoXCapacidad() {
        return aeropuertoXCapacidad;
    }

    public void setAeropuertoXCapacidad(List<Aeropuerto> aeropuertoXCapacidad) {
        this.aeropuertoXCapacidad = aeropuertoXCapacidad;
    }

    public void mostrarAeropuertos(){
        for(Aeropuerto a: ListaDeAeropuertos){
            System.out.println(a);
        }
    }

    public Aeropuerto[] pasarDeJsonAArray() throws IOException {
        if(!jSonFile.exists()){
            jSonFile.createNewFile();
        }
        try{
            ObjectMapper mapper= new ObjectMapper();
            return mapper.readValue(jSonFile, Aeropuerto[].class);

        }catch (IOException e){
            e.printStackTrace();
        }
        return null;

    }
    public void pasarAListaConCapacidadX(Integer capacidad) throws CustomException {
        try {
            for (Aeropuerto a : ListaDeAeropuertos) {
                if (a.getCapacidad() > capacidad) {
                    aeropuertoXCapacidad.add(a);
                }
            }
            if(aeropuertoXCapacidad.isEmpty()){
                throw new CustomException(capacidad);
            }
        } catch (CustomException e) {
            e.getMessage();
        }
    }

}

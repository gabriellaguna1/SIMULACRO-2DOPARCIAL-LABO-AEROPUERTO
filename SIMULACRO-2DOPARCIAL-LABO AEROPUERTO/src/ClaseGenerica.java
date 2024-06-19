import java.util.ArrayList;
import java.util.List;

public class ClaseGenerica <T> {
    public List<T> pilotosYTags = new ArrayList<>();


    public ClaseGenerica() {
    }

    public ClaseGenerica(List<T> pilotosYTags) {
        this.pilotosYTags = pilotosYTags;
    }

    public List<T> getPilotosYTags() {
        return pilotosYTags;
    }

    public void setPilotosYTags(List<T> pilotosYTags) {
        this.pilotosYTags = pilotosYTags;
    }
    public void adherirTipo(T nuevo){
        this.pilotosYTags.add(nuevo);
    }
    public void eliminarTipo(T nuevo){
        this.pilotosYTags.remove(nuevo);
    }
    public T traerTipo(T nuevo){
        if(this.pilotosYTags.contains(nuevo)){
            return nuevo;
        }
        return null;
    }
}

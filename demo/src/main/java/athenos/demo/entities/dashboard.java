package athenos.demo.entities;
import java.util.ArrayList;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import uk.co.jemos.podam.common.PodamExclude;



@Entity
public class dashboard extends BaseEntity{
    private String enfoqueSemanal;
    private int semanaIndicada;

    @PodamExclude
    @OneToMany(mappedBy = "dashboard", cascade = CascadeType.PERSIST)
    private ArrayList<Prioridad> prioridades;
    private int tareasCompletadas;
    private int horasEstudio;
    private int entrenamientos;
    private float balanceMensual;
    




    
}

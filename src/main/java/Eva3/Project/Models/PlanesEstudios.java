package Eva3.Project.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "planesestudios") //estaba alegando porque la tabla se llama user
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanesEstudios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idplanestudio")
    private Integer idPlanEstudio;
    @Column(name = "codcarr")
    private Integer codCarr;
    @Column(name = "codplan")
    private String codPlan;
    @Column(name = "nivel")
    private Integer nivel;
    @Column(name = "codasig")
    private Integer codAsig;
    @Column(name = "nom_asig")
    private String nombreAsig;
}

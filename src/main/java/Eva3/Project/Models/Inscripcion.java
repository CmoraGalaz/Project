package Eva3.Project.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "inscripciones") //estaba alegando porque la tabla se llama user
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idinscripcion")
    private Integer idInscripcion;
    @Column(name = "estado")
    private String estado;
    @Column(name = "oportunidad")
    private Integer oportunidad;
    @Column(name = "rut")
    private String rut;
    @Column(name = "idplanestudio")
    private Integer idPlanEstudio;

}

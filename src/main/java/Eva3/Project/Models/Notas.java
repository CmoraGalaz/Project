package Eva3.Project.Models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "notas") //estaba alegando porque la tabla se llama user
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idnotas")
    private Integer idNotas;
    @Column(name = "anio")
    private Integer anio;
    @Column(name = "sem")
    private Integer semestre;
    @Column(name = "rut")
    private String Rut;
    @Column(name = "codasig")
    private Integer codAsig;
    @Column(name = "nota")
    private Double nota;

}

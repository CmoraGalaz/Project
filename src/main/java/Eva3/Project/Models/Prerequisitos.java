package Eva3.Project.Models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "prerequisitos") //estaba alegando porque la tabla se llama user
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prerequisitos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpre")
    private Integer idPrerequisito;
    @Column(name = "cod_asig")
    private Integer codAsig;
    @Column(name = "cod_prereq")
    private Integer codPrereq;
}

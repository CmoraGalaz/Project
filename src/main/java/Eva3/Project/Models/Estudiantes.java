package Eva3.Project.Models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "estudiantes") //estaba alegando porque la tabla se llama user
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiantes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rut")
    private String Rut;
    @Column(name = "nombres")
    private String Nombres;
    @Column(name = "apellidos")
    private String Apellidos;
    @Column(name = "email")
    private String Email;
    @Column(name = "codcarr")
    private Integer CodCarr;
}

package Eva3.Project.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "carreras")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carreras {
    @Id
    @Column(name = "codcar")
    private Integer codcar;
    @Column(name = "nomcarrera")
    private String nomCarrera;
}

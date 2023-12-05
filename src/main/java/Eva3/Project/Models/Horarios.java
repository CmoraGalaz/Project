package Eva3.Project.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "horarios") //estaba alegando porque la tabla se llama user
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Horarios {
    @Id

    @Column(name = "idhora")
    private Integer idHorario;
    @Column(name = "cod_asig")
    private Integer cod_asig;
    @Column(name = "dia")
    private String dia;

}

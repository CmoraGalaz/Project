package Eva3.Project.Repositories;

import Eva3.Project.Models.Notas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INotaRepository extends JpaRepository<Notas,Integer> {
}

package Eva3.Project.Repositories;

import Eva3.Project.Models.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteRepository extends JpaRepository<Estudiantes,String> {
}

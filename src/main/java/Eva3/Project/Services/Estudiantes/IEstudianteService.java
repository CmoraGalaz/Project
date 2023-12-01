package Eva3.Project.Services.Estudiantes;

import Eva3.Project.Models.Estudiantes;

import java.util.List;
import java.util.Optional;

public interface IEstudianteService<T> {
    List<Estudiantes> findAll();

    Optional<Estudiantes> findById(String Rut);

    Estudiantes create(Estudiantes estudiantes);

    Estudiantes update(Estudiantes estudiantes);

    void delete(String Rut);
}

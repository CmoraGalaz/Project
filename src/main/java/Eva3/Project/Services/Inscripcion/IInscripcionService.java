package Eva3.Project.Services.Inscripcion;

import Eva3.Project.Models.Horarios;
import Eva3.Project.Models.Inscripcion;

import java.util.List;
import java.util.Optional;

public interface IInscripcionService<T>{
    List<Inscripcion> findAll();

    Optional<Inscripcion> findById(Integer id);

    Inscripcion create(Inscripcion inscripcion);

    Inscripcion update(Inscripcion inscripcion);

    void delete(Integer id);
}

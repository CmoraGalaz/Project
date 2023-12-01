package Eva3.Project.Services.Horarios;

import Eva3.Project.Models.Horarios;

import java.util.List;
import java.util.Optional;

public interface IHorarioService<T> {
    List<Horarios> findAll();

    Optional<Horarios> findById(Integer id);

    Horarios create(Horarios horarios);

    Horarios update(Horarios horarios);

    void delete(Integer id);
}

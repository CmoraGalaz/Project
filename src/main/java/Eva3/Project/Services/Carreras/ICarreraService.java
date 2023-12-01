package Eva3.Project.Services.Carreras;

import Eva3.Project.Models.Carreras;

import java.util.List;
import java.util.Optional;

public interface ICarreraService<T> {
    List<Carreras> findAll();

    Optional<Carreras> findById(Integer id);

    Carreras create(Carreras carreras);

    Carreras update(Carreras carreras);

    void delete(Integer id);
}

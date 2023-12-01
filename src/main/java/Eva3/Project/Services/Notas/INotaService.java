package Eva3.Project.Services.Notas;

import Eva3.Project.Models.Notas;

import java.util.List;
import java.util.Optional;

public interface INotaService<T>{
    List<Notas> findAll();

    Optional<Notas> findById(Integer id);

    Notas create(Notas notas);

    Notas update(Notas notas);

    void delete(Integer id);
}

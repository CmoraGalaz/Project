package Eva3.Project.Services.PlanEstudios;

import Eva3.Project.Models.PlanesEstudios;

import java.util.List;
import java.util.Optional;

public interface IPlanEstudioService<T>{
    List<PlanesEstudios> findAll();

    Optional<PlanesEstudios> findById(Integer id);

    PlanesEstudios create(PlanesEstudios planesEstudios);

    PlanesEstudios update(PlanesEstudios planesEstudios);

    void delete(Integer id);
}

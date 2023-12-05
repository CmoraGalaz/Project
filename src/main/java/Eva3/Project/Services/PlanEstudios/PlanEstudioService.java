package Eva3.Project.Services.PlanEstudios;


import Eva3.Project.Models.DTOS.EstudiantesInscritos;
import Eva3.Project.Models.Inscripcion;
import Eva3.Project.Models.PlanesEstudios;
import Eva3.Project.Repositories.IPlanEstudioRepository;
import Eva3.Project.Services.Inscripcion.InscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanEstudioService implements IPlanEstudioService<PlanesEstudios> {
    @Autowired
    private IPlanEstudioRepository iPlanEstudioRepository;



    @Override
    public List<PlanesEstudios> findAll() {
        return iPlanEstudioRepository.findAll();
    }

    @Override
    public Optional<PlanesEstudios> findById(Integer id) {
        return iPlanEstudioRepository.findById(id);
    }

    @Override
    public PlanesEstudios create(PlanesEstudios planesEstudios) {
        return iPlanEstudioRepository.save(planesEstudios);
    }

    @Override
    public PlanesEstudios update(PlanesEstudios planesEstudios) {
        return iPlanEstudioRepository.save(planesEstudios);
    }

    @Override
    public void delete(Integer id) {
        iPlanEstudioRepository.deleteById(id);

    }


}

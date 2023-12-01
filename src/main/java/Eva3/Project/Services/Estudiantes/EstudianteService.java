package Eva3.Project.Services.Estudiantes;

import Eva3.Project.Models.Estudiantes;
import Eva3.Project.Repositories.IEstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService implements IEstudianteService<Estudiantes> {

    @Autowired
    private IEstudianteRepository iEstudianteRepository;

    @Override
    public List<Estudiantes> findAll() {
        return iEstudianteRepository.findAll();
    }

    @Override
    public Optional<Estudiantes> findById(String Rut) {
        return iEstudianteRepository.findById(Rut);
    }

    @Override
    public Estudiantes create(Estudiantes estudiantes) {
        return iEstudianteRepository.save(estudiantes);
    }

    @Override
    public Estudiantes update(Estudiantes estudiantes) {
        return iEstudianteRepository.save(estudiantes);
    }

    @Override
    public void delete(String Rut) {
        iEstudianteRepository.deleteById(Rut);

    }
}

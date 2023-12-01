package Eva3.Project.Services.Horarios;

import Eva3.Project.Models.Horarios;
import Eva3.Project.Repositories.IHorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class HorarioService implements IHorarioService<Horarios> {
    @Autowired
    private IHorarioRepository iHorarioRepository;
    @Override
    public List<Horarios> findAll() {
        return null;
    }

    @Override
    public Optional<Horarios> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Horarios create(Horarios horarios) {
        return null;
    }

    @Override
    public Horarios update(Horarios horarios) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}

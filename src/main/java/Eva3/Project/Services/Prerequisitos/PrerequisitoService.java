package Eva3.Project.Services.Prerequisitos;

import Eva3.Project.Models.Prerequisitos;
import Eva3.Project.Repositories.IPrerequisitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrerequisitoService implements IPrerequisitoService<Prerequisitos> {
    @Autowired
    private IPrerequisitoRepository iPrerequisitoRepository;

    @Override
    public List<Prerequisitos> findAll() {
        return iPrerequisitoRepository.findAll();
    }

    @Override
    public Optional<Prerequisitos> findById(Integer id) {
        return iPrerequisitoRepository.findById(id);
    }

    @Override
    public Prerequisitos create(Prerequisitos prerequisitos) {
        return iPrerequisitoRepository.save(prerequisitos);
    }

    @Override
    public Prerequisitos update(Prerequisitos prerequisitos) {
        return iPrerequisitoRepository.save(prerequisitos);
    }

    @Override
    public void delete(Integer id) {
        iPrerequisitoRepository.deleteById(id);

    }
}

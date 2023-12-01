package Eva3.Project.Services.Notas;

import Eva3.Project.Models.Notas;
import Eva3.Project.Repositories.INotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotaService implements INotaService<Notas>{
    @Autowired
    private INotaRepository iNotaRepository;
    @Override
    public List<Notas> findAll() {
        return iNotaRepository.findAll();
    }

    @Override
    public Optional<Notas> findById(Integer id) {
        return iNotaRepository.findById(id);
    }

    @Override
    public Notas create(Notas notas) {
        return iNotaRepository.save(notas);
    }

    @Override
    public Notas update(Notas notas) {
        return iNotaRepository.save(notas);
    }

    @Override
    public void delete(Integer id) {
        iNotaRepository.deleteById(id);

    }
}

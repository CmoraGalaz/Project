package Eva3.Project.Services.Carreras;

import Eva3.Project.Models.Carreras;
import Eva3.Project.Repositories.ICarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CarreraService implements ICarreraService<Carreras>{
    @Autowired
    private ICarreraRepository iCarreraRepository;

    @Override
    public List<Carreras> findAll() {
        return iCarreraRepository.findAll();
    }

    @Override
    public Optional<Carreras> findById(Integer id) {

        return iCarreraRepository.findById(id);
    }

    @Override
    public Carreras create(Carreras carreras) {
        return iCarreraRepository.save(carreras);
    }

    @Override
    public Carreras update(Carreras carreras) {
        return iCarreraRepository.save(carreras);
    }

    @Override
    public void delete(Integer id) {
        iCarreraRepository.deleteById(id);

    }
}

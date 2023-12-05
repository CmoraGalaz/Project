package Eva3.Project.Services.Horarios;

import Eva3.Project.Models.Horarios;
import Eva3.Project.Models.PlanesEstudios;
import Eva3.Project.Repositories.IHorarioRepository;
import Eva3.Project.Services.PlanEstudios.IPlanEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class HorarioService implements IHorarioService<Horarios> {
    @Autowired
    private IHorarioRepository iHorarioRepository;

    @Autowired
    private IPlanEstudioService iPlanEstudioService;
    @Override
    public List<Horarios> findAll() {
        return iHorarioRepository.findAll();
    }

    @Override
    public Optional<Horarios> findById(Integer id) {
        return iHorarioRepository.findById(id);
    }

    @Override
    public Horarios create(Horarios horarios) {
        List<PlanesEstudios> planesEstudios = iPlanEstudioService.findAll();

        for (int i = 0 ; i< planesEstudios.size(); i++){

            if(planesEstudios.get(i).getCodAsig().equals(horarios.getCod_asig())){
                PlanesEstudios planesEstudios1 = planesEstudios.get(i);
                planesEstudios1.setIdhor(horarios.getIdHorario());
                iPlanEstudioService.update(planesEstudios1);

            }

        }
        return iHorarioRepository.save(horarios);
    }

    @Override
    public Horarios update(Horarios horarios) {
        return iHorarioRepository.save(horarios);
    }

    @Override
    public void delete(Integer id) {
        iHorarioRepository.deleteById(id);

    }

}

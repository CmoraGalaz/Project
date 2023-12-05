package Eva3.Project.Services.Inscripcion;

import Eva3.Project.Models.DTOS.EstadoAsignatura;
import Eva3.Project.Models.DTOS.EstudiantesInscritos;
import Eva3.Project.Models.DTOS.InscripcionAsignatura;
import Eva3.Project.Models.DTOS.ValidacionAsignaturasInscritas;
import Eva3.Project.Models.Estudiantes;
import Eva3.Project.Models.Inscripcion;
import Eva3.Project.Models.Mensaje;
import Eva3.Project.Models.PlanesEstudios;
import Eva3.Project.Repositories.IInscripcionRepository;
import Eva3.Project.Services.Estudiantes.EstudianteService;
import Eva3.Project.Services.PlanEstudios.PlanEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InscripcionService implements IInscripcionService<Inscripcion> {
    @Autowired
    private IInscripcionRepository iInscripcionRepository;

    @Autowired
    private EstudianteService estudianteService;

    @Autowired
    private PlanEstudioService planEstudioService;

    @Override
    public List<Inscripcion> findAll() {
        return iInscripcionRepository.findAll();
    }

    @Override
    public Optional<Inscripcion> findById(Integer id) {
        return iInscripcionRepository.findById(id);
    }

    @Override
    public Inscripcion create(Inscripcion inscripcion) {
        return iInscripcionRepository.save(inscripcion);
    }

    @Override
    public Inscripcion update(Inscripcion inscripcion) {
        return iInscripcionRepository.save(inscripcion);
    }

    @Override
    public void delete(Integer id) {
        iInscripcionRepository.deleteById(id);

    }

    public InscripcionAsignatura InscribirAsignaturaEstudiante (InscripcionAsignatura inscripcionAsignatura){
        List<Estudiantes>estudiantes = estudianteService.findAll();
        List<PlanesEstudios>planesEstudiosLis = planEstudioService.findAll();
        List<Inscripcion>inscripcions = iInscripcionRepository.findAll();

        for (int i = 0; i < estudiantes.size();i++){

            if(estudiantes.get(i).getRut().equals(inscripcionAsignatura.rut())){
                for (int w = 0 ; w<planesEstudiosLis.size();w++){
                    if(planesEstudiosLis.get(w).getNombreAsig().equals(inscripcionAsignatura.Asignatura())){

                        Inscripcion inscripcion = new Inscripcion();
                        //inscripcion.setIdInscripcion();
                        inscripcion.setRut(inscripcionAsignatura.rut());
                        inscripcion.setIdPlanEstudio(planesEstudiosLis.get(w).getIdPlanEstudio());
                        for(int y = 0 ; y<inscripcions.size();y++){
                            if((inscripcions.get(y).getRut().equals(inscripcionAsignatura.rut())&&(planesEstudiosLis.get(w).getIdPlanEstudio().equals(inscripcions.get(y).getIdPlanEstudio())))&&(inscripcions.get(y).getEstado().equals("Cursando")))
                            {
                                Inscripcion inscripcion1 = inscripcions.get(y);
                                inscripcion1.setEstado("Reprobado");
                                iInscripcionRepository.save(inscripcion1);
                                inscripcion.setEstado("Cursando");
                                inscripcion.setOportunidad(2);
                                iInscripcionRepository.save(inscripcion);
                                return inscripcionAsignatura;
                            }

                        }
                        inscripcion.setEstado("Cursando");
                        inscripcion.setOportunidad(1);
                        iInscripcionRepository.save(inscripcion);
                    }

                }


            }
        }



        return inscripcionAsignatura;
    }


    public String ValidarEstudiante (ValidacionAsignaturasInscritas validacionAsignaturasInscritas) {
        List<Estudiantes> estudiantes = estudianteService.findAll();
        List<Inscripcion> inscripcions = iInscripcionRepository.findAll();
        String mensaje;
        int count =0;

        for (int i = 0; i< estudiantes.size();i++){
            if(validacionAsignaturasInscritas.Rut().equals(estudiantes.get(i).getRut())){

                for (int o=0; o<inscripcions.size();o++){
                    if(inscripcions.get(o).getRut().equals(validacionAsignaturasInscritas.Rut())&&inscripcions.get(o).getEstado().equals("Cursando")){
                        count++;

                    }


                }

            }





        }
        if(count >= 3){
            mensaje="Horario validado";
            return mensaje;
        }else{
            mensaje="Horario invalido pendiente tomar  "+ (3-count)+" asignaturas";
            return mensaje;
        }

    }

    public String ValidarEstadoAsignatura (EstadoAsignatura estadoAsignatura){
        List<Estudiantes> estudiantes = estudianteService.findAll();
        List<Inscripcion> inscripcions = iInscripcionRepository.findAll();
        String mensaje;
        int count =0;

        for(int i =0; i<estudiantes.size();i++){
            if(estudiantes.get(i).getRut().equals(estadoAsignatura.Rut())){
                for(int a =0;a<inscripcions.size();a++){
                    if(estadoAsignatura.Rut().equals(inscripcions.get(a).getRut())&&inscripcions.get(a).getEstado().equals("Reprobado"))
                    count++;
                }

            }

        }

        if(count >= 2){
            mensaje="Estudiante eliminado de carrera";
            return mensaje;
        }else{
            mensaje="Estudiante Sin restriccion de asignaturas reprobadas";
            return mensaje;
        }



    }

    public Integer EstudiantesInscritos(EstudiantesInscritos estudiantesInscritos){
        List<Inscripcion>inscripcions = iInscripcionRepository.findAll();
        List<PlanesEstudios>planesEstudios = planEstudioService.findAll();
        int count =0;
        for (int i=0;i<planesEstudios.size();i++){
            if(planesEstudios.get(i).getNombreAsig().equals(estudiantesInscritos.NombreAsignatura())){
                for(int o = 0; o<inscripcions.size();o++){

                    if(inscripcions.get(o).getIdPlanEstudio().equals(planesEstudios.get(i).getIdPlanEstudio())&&inscripcions.get(o).getEstado().equals("Cursando")){
                        count++;
                    }
                }

            }

        }

        return count;
    }
}

package Eva3.Project.Controllers;

import Eva3.Project.Models.Carreras;
import Eva3.Project.Models.DTOS.EstadoAsignatura;
import Eva3.Project.Models.DTOS.EstudiantesInscritos;
import Eva3.Project.Models.DTOS.InscripcionAsignatura;
import Eva3.Project.Models.DTOS.ValidacionAsignaturasInscritas;
import Eva3.Project.Models.Mensaje;
import Eva3.Project.Services.Inscripcion.InscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inscripcion")
public class InscripcionController {

    @Autowired
    private InscripcionService inscripcionService;


    @PostMapping
    public ResponseEntity<InscripcionAsignatura> create(@RequestBody InscripcionAsignatura inscripcionAsignatura){
        return new ResponseEntity<>(inscripcionService.InscribirAsignaturaEstudiante(inscripcionAsignatura),HttpStatus.CREATED);
    }

    @GetMapping("/validar")
    public ResponseEntity<String> create(@RequestBody ValidacionAsignaturasInscritas validacionAsignaturasInscritas){
        return new ResponseEntity<>(inscripcionService.ValidarEstudiante(validacionAsignaturasInscritas),HttpStatus.CREATED);
    }
    @GetMapping("/reprobado")
    public ResponseEntity<String> create(@RequestBody EstadoAsignatura estadoAsignatura){
        return new ResponseEntity<>(inscripcionService.ValidarEstadoAsignatura(estadoAsignatura),HttpStatus.CREATED);
    }
    @GetMapping("/cursando")
    public ResponseEntity<Integer> create(@RequestBody EstudiantesInscritos estudiantesInscritos){
        return new ResponseEntity<>(inscripcionService.EstudiantesInscritos(estudiantesInscritos),HttpStatus.CREATED);
    }
}

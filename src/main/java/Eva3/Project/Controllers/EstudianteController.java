package Eva3.Project.Controllers;

import Eva3.Project.Models.Estudiantes;
import Eva3.Project.Services.Estudiantes.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {


    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/all")
    public ResponseEntity<List<Estudiantes>> findAll(){
        List<Estudiantes>estudiantes = estudianteService.findAll();
        return new ResponseEntity<>(estudiantes, HttpStatus.OK);

    }
}

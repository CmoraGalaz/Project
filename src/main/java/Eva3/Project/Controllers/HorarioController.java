package Eva3.Project.Controllers;


import Eva3.Project.Models.Horarios;
import Eva3.Project.Services.Horarios.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/horario")
public class HorarioController {
    @Autowired
    private HorarioService horarioService;

    @GetMapping("/all")
    public ResponseEntity<List<Horarios>> findAll(){
        List<Horarios>horarios = horarioService.findAll();
        return new ResponseEntity<>(horarios, HttpStatus.OK);

    }
}

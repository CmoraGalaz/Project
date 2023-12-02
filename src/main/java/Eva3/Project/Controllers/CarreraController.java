package Eva3.Project.Controllers;

import Eva3.Project.Models.Carreras;

import Eva3.Project.Services.Carreras.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carrera")
public class CarreraController {
    @Autowired
    private CarreraService carreraService;

    @GetMapping("/all")
    public ResponseEntity<List<Carreras>> findAll() {
        List<Carreras> carreras = carreraService.findAll();
        return new ResponseEntity<>(carreras, HttpStatus.OK);
    }
}

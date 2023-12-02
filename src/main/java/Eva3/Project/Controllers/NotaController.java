package Eva3.Project.Controllers;


import Eva3.Project.Models.Notas;
import Eva3.Project.Services.Notas.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nota")
public class NotaController {
    @Autowired
    private NotaService notaService;

    @GetMapping("/all")
    public ResponseEntity<List<Notas>> findAll(){
        List<Notas>notas = notaService.findAll();
        return new ResponseEntity<>(notas, HttpStatus.OK);

    }
}

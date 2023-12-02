package Eva3.Project.Controllers;


import Eva3.Project.Models.Prerequisitos;
import Eva3.Project.Services.Prerequisitos.PrerequisitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/prerequisito")
public class PrerequisitoController {
    @Autowired
    private PrerequisitoService prerequisitoService;

    @GetMapping("/all")
    public ResponseEntity<List<Prerequisitos>> findAll(){
        List<Prerequisitos>prerequisitos = prerequisitoService.findAll();
        return new ResponseEntity<>(prerequisitos, HttpStatus.OK);

    }
}

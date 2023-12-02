package Eva3.Project.Controllers;


import Eva3.Project.Models.PlanesEstudios;
import Eva3.Project.Services.PlanEstudios.PlanEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/planestudio")
public class PlanEstudioController {
    @Autowired
    private PlanEstudioService planEstudioService;

    @GetMapping("/all")
    public ResponseEntity<List<PlanesEstudios>> findAll(){
        List<PlanesEstudios>planesEstudios = planEstudioService.findAll();
        return new ResponseEntity<>(planesEstudios, HttpStatus.OK);

    }
}

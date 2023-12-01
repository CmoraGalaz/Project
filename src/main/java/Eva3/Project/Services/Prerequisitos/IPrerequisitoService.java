package Eva3.Project.Services.Prerequisitos;

import Eva3.Project.Models.Prerequisitos;

import java.util.List;
import java.util.Optional;

public interface IPrerequisitoService<T> {

    List<Prerequisitos> findAll();

    Optional<Prerequisitos> findById(Integer id);

    Prerequisitos create(Prerequisitos prerequisitos);

    Prerequisitos update(Prerequisitos prerequisitos);

    void delete(Integer id);
}

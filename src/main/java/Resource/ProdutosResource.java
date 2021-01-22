package Resource;

import Repository.ProdutosRepository;
import model.ModeloDeCamera;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ModeloDeCamera")
public class ProdutosResource {

    @Autowired
    private ProdutosRepository produtosRepository;

    @RequestMapping
    public List<ModeloDeCamera> listar(){

        return produtosRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void adicionar(@RequestBody ModeloDeCamera produtos){

        produtosRepository.save(produtos);
    }

}

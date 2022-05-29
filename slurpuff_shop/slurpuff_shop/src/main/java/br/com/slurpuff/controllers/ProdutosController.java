/*

package br.com.slurpuff.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.slurpuff.model.Produto;
import br.com.slurpuff.repositories.ProdutoRepository;


@Controller
@RequestMapping("/")
public class ProdutosController {
    @Autowired
    ProdutoRepository produtoRepo;

    ProdutosController(ProdutoRepository produtoR){
        this.produtoRepo = produtoR;
    }

   
    
    @GetMapping("/listarProdutos")
    public ModelAndView listarProdutos(){
        List<Produto> todosOsProdutos = produtoRepo.findAll();

        ModelAndView modelAndView = new ModelAndView("listarProdutos");

        modelAndView.addObject("todosOsProdutos", todosOsProdutos);

        return modelAndView;
    }

    @GetMapping("/cadastroProduto")
    public ModelAndView formAdicionarProduto(){
        ModelAndView modelAndView = new ModelAndView("cadastroProduto");
        modelAndView.addObject(new Produto());
        return modelAndView;
    }
    @PostMapping("/cadastroProduto")
    public String adicionarProduto(Produto aSalvar) {
        this.produtoRepo.save(aSalvar);
        return "redirect:/listarProdutos";
    }

    @GetMapping("/editar/{codigoProduto}")
    public ModelAndView formEditarProduto(@PathVariable("codigoProduto") long codigoProduto){
        Produto produto = produtoRepo.findById(codigoProduto)
        .orElseThrow(() -> new IllegalArgumentException("Código inválido:" + codigoProduto));

        ModelAndView modelAndView = new ModelAndView("editarProduto");
        modelAndView.addObject(produto);
        return modelAndView;
    }

    @PostMapping("/editar/{codigoProduto}")
    public ModelAndView editarProduto(@PathVariable("codigoProduto") long codigoProduto, Produto produto){
        produtoRepo.save(produto);
        return new ModelAndView("redirect:/listarProdutos");
    }

    @GetMapping("/remover/{codigoProduto}")
    public ModelAndView removerProduto(@PathVariable("codigoProduto") long codigoProduto){
        Produto aRemover = produtoRepo.findById(codigoProduto)
        .orElseThrow(() -> new IllegalArgumentException("Código inválido" + codigoProduto));

        produtoRepo.delete(aRemover);
        return new ModelAndView("redirect:/listarProdutos");
    }
}

*/
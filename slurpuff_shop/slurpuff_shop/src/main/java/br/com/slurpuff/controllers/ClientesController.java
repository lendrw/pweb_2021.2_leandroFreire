package br.com.slurpuff.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.slurpuff.model.Cliente;
import br.com.slurpuff.repositories.ClienteRepository;

    
@Controller
@RequestMapping("/")
public class ClientesController{

    @Autowired
    ClienteRepository clienteRepo;

    ClientesController(ClienteRepository clienteR){
        this.clienteRepo = clienteR;
    }

    @GetMapping
    public String index(){
        return "index.html";
    }
    
    @GetMapping("/listarClientes")
    public ModelAndView listarClientes(){
        List<Cliente> todosOsClientes = clienteRepo.findAll();

        ModelAndView modelAndView = new ModelAndView("listarClientes");

        modelAndView.addObject("todosOsClientes", todosOsClientes);

        return modelAndView;
    }

    @GetMapping("/cadastro")
    public ModelAndView formAdicionarCliente(){
        ModelAndView modelAndView = new ModelAndView("cadastro");
        modelAndView.addObject(new Cliente());
        return modelAndView;
    }
    @PostMapping("/cadastro")
    public String adicionarCliente(Cliente aSalvar) {
        this.clienteRepo.save(aSalvar);
        return "redirect:/listarClientes";
    }

    @GetMapping("/editarCadastro/{codigoCliente}")
    public ModelAndView formEditarCliente(@PathVariable("codigoCliente") long codigoCliente){
        Cliente cliente = clienteRepo.findById(codigoCliente)
        .orElseThrow(() -> new IllegalArgumentException("Código inválido:" + codigoCliente));

        ModelAndView modelAndView = new ModelAndView("editarCadastro");
        modelAndView.addObject(cliente);
        return modelAndView;
    }

    @PostMapping("/editarCadastro/{codigoCliente}")
    public ModelAndView editarCadastro(@PathVariable("codigoCliente") long codigoCliente, Cliente cliente){
        clienteRepo.save(cliente);
        return new ModelAndView("redirect:/listarClientes");
    }

    @GetMapping("/remover/{codigoCliente}")
    public ModelAndView removerCliente(@PathVariable("codigoCliente") long codigoCliente){
        Cliente aRemover = clienteRepo.findById(codigoCliente)
        .orElseThrow(() -> new IllegalArgumentException("Código inválido" + codigoCliente));

        clienteRepo.delete(aRemover);
        return new ModelAndView("redirect:/listarClientes");
    }
}


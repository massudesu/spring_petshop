package com.dt2.petshop;
import com.dt2.petshop.*;
import org.springframework.beans.propertyeditors.ClassEditor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("api")
    public String intervalo(){
        return "O intervalo é 15:40 :(";
    }

    @GetMapping("oi")
    public String hello(){
        return "Ooooiiiiiiii";
    }

    @GetMapping("cliente")
    public Cliente show(){
        Cliente cliente = new Cliente("Nicolas", "11979855463", "4909090909");
        return cliente;
    }

}

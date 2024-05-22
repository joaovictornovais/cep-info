package br.com.joao.cepinfo.controllers;

import br.com.joao.cepinfo.entities.Address;
import br.com.joao.cepinfo.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/{cep}")
    public Address getAddress(@PathVariable String cep) {
        return addressService.getAddress(cep);
    }

}

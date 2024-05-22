package br.com.joao.cepinfo.services;

import br.com.joao.cepinfo.entities.Address;
import br.com.joao.cepinfo.exceptions.CustomErrorDecoder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "address", url = "https://api.postmon.com.br/v1/cep/", configuration = {
        CustomErrorDecoder.class
})
public interface AddressService {

    @RequestMapping(method = RequestMethod.GET, value="{cep}")
    Address getAddress(@PathVariable String cep);

}

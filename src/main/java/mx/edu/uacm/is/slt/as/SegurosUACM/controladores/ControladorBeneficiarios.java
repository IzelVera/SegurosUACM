package controladores;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import mx.edu.uacm.is.slt.as.SegurosUACM.modelos.*;

@RestController
public class ControladorBeneficiarios {
	
	@GetMapping("/beneficiarios" )
	public List<BeneficiarioPoliza> getALL(){
		RestClient clienteRest = RestClient.create();
		List<BeneficiarioPoliza> beneficiarios = clienteRest.get()
			.uri("http://nachintoch.mx:8080/beneficiarios")
			.retrieve().body(new ParameterizedTypeReference<>() {});
		
		return beneficiarios;
		
	}
	
}

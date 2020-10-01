package webRestController;

import java.util.List;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Compte;
import com.example.demo.repository.CompteRepo;


@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BanqueRestController {
	
	@Autowired
	private CompteRepo compteRepo;
	
	@GetMapping("/comptes")
	public List<Compte> listComptes() {
		return compteRepo.findAll();
		
	}
	
	@GetMapping("/comptes/{code}")
	public Compte getComptes(@PathParam(value="code") Long code) {
		
		return compteRepo.findById(code).get();
		
	}
	
	@PostMapping("/comptes")
	public Compte saveCompte(Compte compte) {
		
		return compteRepo.save(compte);
		
	}
	
	@PutMapping("/comptes/{code}")
	public Compte updateCompte(@PathParam(value="code") Long code , Compte compte) {
		
		compte.setCode(code);
		return compteRepo.save(compte);
		
	}
	
	@DeleteMapping("/comptes/{code}")
	public void deleteCompte(@PathParam(value="code") Long code) {
		
		compteRepo.deleteById(code);
		
	}

}

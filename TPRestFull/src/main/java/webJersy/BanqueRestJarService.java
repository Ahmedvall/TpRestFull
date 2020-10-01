package webJersy;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Compte;
import com.example.demo.repository.CompteRepo;


@Component
@Path("/banque")
public class BanqueRestJarService {
	
	@Autowired
	private CompteRepo compteRepo;
	
	@Path("/comptes")
	@GET
	@Produces
	public List<Compte> listComptes() {
		return compteRepo.findAll();
		
	}
	
	@Path("/comptes/{code}")
	@GET
	//@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces
	public Compte getComptes(@PathParam(value="code") Long code) {
		
		return compteRepo.findById(code).get();
		
	}
	
	@Path("/comptes")
	@POST
	//@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces
	public Compte saveCompte(Compte compte) {
		
		return compteRepo.save(compte);
		
	}
	
	@Path("/comptes/{code}")
	@PUT
	//@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces
	public Compte updateCompte(@PathParam(value="code") Long code , Compte compte) {
		
		compte.setCode(code);
		return compteRepo.save(compte);
		
	}
	
	@Path("/comptes/{code}")
	@DELETE
	//@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces
	public void deleteCompte(@PathParam(value="code") Long code) {
		
		compteRepo.deleteById(code);
		
	}

}

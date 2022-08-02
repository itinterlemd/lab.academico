package interlemd.instituto.api.academico.controllers;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.tomcat.util.http.HeaderUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crudejemplo")
@CrossOrigin(origins = "http://localhost:4200")
public class CrudEjemploReource {
	
	/*@GetMapping("/obtenertodos")
	public ResponseEntity<Object> consulartodos(){
	
	 return new ResponseEntity("{'value':'consulartodos'}", HttpStatus.OK);
	 }*/
	
/**
 * 
 * @param id
 * @return
 */
	@GetMapping("/obtenertodos/{id}")
	public ResponseEntity<Object> consulartodosById(@PathVariable(value = "id", required = false) final Long id){
		System.out.println(" consulartodos id:"+id); 
	
	 return new ResponseEntity("{'value':'consulartodos pathvariable id '}", HttpStatus.OK);
	 }
	/**
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/obtenertodos/{id}/retornaranio")
	public ResponseEntity<Object> consulartodosByIdanio(@PathVariable(value = "id", required = false) final Long id){
		System.out.println(" consulartodos id:"+id); 
	
	 return new ResponseEntity("{'value':'consulartodos retrona año '}", HttpStatus.OK);
	 }
	/**
	 * 
	 * @param anio
	 * @param mes
	 * @return
	 */
	@GetMapping("/obtenertodos")
	public ResponseEntity<Object> consulartodosByAnio(@RequestParam(required = false) Integer anio,@RequestParam(required = false) Integer mes){
		System.out.println(" consulartodos anio:"+anio);
		System.out.println(" consulartodos mes:"+mes); 
		
		if(anio==null || mes==null)
			 return new ResponseEntity("{'value':'consulartodos todos'}", HttpStatus.OK);
		
		
	
	 return new ResponseEntity("{'value':'consulartodos queryparam'}", HttpStatus.OK);
	 }
	
	
	/**
	 * Método para guradar una entidad
	 * @param ejemploEntidad
	 * @return
	 * @throws URISyntaxException
	 */
	 @PostMapping("/obtenertodos")
	    public ResponseEntity<EjemploEntidad> createDatoEquipo(@RequestBody EjemploEntidad ejemploEntidad) throws URISyntaxException {
		     if (ejemploEntidad.getId() != null) {
	            //return  ResponseEntity.badRequest().body("{'error':'Id no pude tener valor'}");
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	        }
	        System.out.println("REST request to save EjemploEntidad : {}" + ejemploEntidad);    
	        EjemploEntidad result=new EjemploEntidad();
	        result.setId("1");
	        result.setNombre("nombre1");
	     
	        return ResponseEntity
	            .created(new URI("/obtenertodos/" + result.getId()))
	            .body(result);
	    }
	
}

class EjemploEntidad {
	
	String id;
	String nombre;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{id:"+this.id+", nombre:"+nombre+"}";
	}
	
}

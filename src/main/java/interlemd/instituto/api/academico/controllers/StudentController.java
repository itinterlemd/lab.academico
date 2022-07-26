package interlemd.instituto.api.academico.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import interlemd.instituto.api.academico.modelo.Student;
import interlemd.instituto.api.academico.services.StudentService;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {
	
	@Autowired
	private StudentService studentService; 
	
	
	@GetMapping("/lista")
	public ResponseEntity<List<Student>> list(){
	System.out.println("Inicio Controllador");
	 List<Student> list = studentService.list();
	System.out.println("Fin Controllador");	 
	 return new ResponseEntity(list, HttpStatus.OK);
	 }
	
	

}

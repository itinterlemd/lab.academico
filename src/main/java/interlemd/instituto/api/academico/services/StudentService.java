package interlemd.instituto.api.academico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import interlemd.instituto.api.academico.modelo.Student;
import interlemd.instituto.api.academico.repository.StudentRepository;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	 public List<Student> list(){
			System.out.println("Inicio StudentService");
			List<Student> list= studentRepository.findAll();
			System.out.println("Fin StudentService");
			return list;
	    }
	
	
	 public void  save(Student producto){
			studentRepository.save(producto);
	    }

	   /* public Optional<Producto> getOne(int id){
	        return productoRepository.findById(id);
	    }

	    public Optional<Producto> getByNombre(String nombre){
	        return productoRepository.findByNombre(nombre);
	    }

	    public void  save(Producto producto){
	        productoRepository.save(producto);
	    }

	    public void delete(int id){
	        productoRepository.deleteById(id);
	    }*/


}

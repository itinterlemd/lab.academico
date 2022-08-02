/**
 * 
 */
package interlemd.instituto.api.academico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import interlemd.instituto.api.academico.dtos.StudentDTO;
import interlemd.instituto.api.academico.modelo.Student;

/**
 * @author enunezt
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	//@Query(value = "SELECT p.ID_STUDENT as studentId FROM Student p WHERE p.ID_STUDENT>0", nativeQuery = true)
	@Query(value = "SELECT new interlemd.instituto.api.academico.dtos.StudentDTO(p.studentId) FROM Student p WHERE p.studentId>0")
	List<StudentDTO> findAllIds();

}

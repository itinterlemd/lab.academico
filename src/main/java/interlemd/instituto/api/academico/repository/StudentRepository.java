/**
 * 
 */
package interlemd.instituto.api.academico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import interlemd.instituto.api.academico.modelo.Student;

/**
 * @author enunezt
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}

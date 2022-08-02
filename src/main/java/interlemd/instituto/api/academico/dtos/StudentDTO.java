package interlemd.instituto.api.academico.dtos;
public class StudentDTO {
	private Long studentId;
	

	public StudentDTO(Long studentId) {
		super();
		this.studentId = studentId;
	}

	/**
	 * @return the studentId
	 */
	public Long getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

}
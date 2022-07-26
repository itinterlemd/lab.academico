package interlemd.instituto.api.academico.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="STUDENT")
public class Student {
	
	@Id
	@Column(name = "ID_STUDENT")
	private Long studentId;
	
	@Column(name = "F_NAME")
	private String firtName;
	
	@Column(name = "L_NAME")
	private String lastName;
	
	@Column(name = "CONTACT")
	private String contactNo;
	
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
	/**
	 * @return the firtName
	 */
	public String getFirtName() {
		return firtName;
	}
	/**
	 * @param firtName the firtName to set
	 */
	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the contactNo
	 */
	public String getContactNo() {
		return contactNo;
	}
	/**
	 * @param contactNo the contactNo to set
	 */
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	

}

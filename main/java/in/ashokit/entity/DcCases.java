package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Dc_Cases")
public class DcCases {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer caseId;		
	private Integer caseNum;		
	private Long appId;		
	private Long planId;		


}

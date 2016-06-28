package br.edu.fjn.ws.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity(name = "tb_evaluation")
public class Evaluation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "evaluation_seq")
	@SequenceGenerator(name = "evaluation_seq", sequenceName = "evaluation_seq", initialValue = 1, allocationSize = 1)
	private Integer id;
	
	private String trainee;
	
	private String supervisor;
	
	@Column(nullable = false)
	private String dateEvaluation;
	
	private String dateResponse;
	
	private String personalPresentation;
	
	private boolean statusPersonalPresentation;
	
	private String assiduity;
	
	private boolean statusAssiduity;
	
	private String punctuality;
	
	private boolean statusPunctuality;
	
	private String initiative;
	
	private boolean statusInitiative;
	
	private String interpersonalRelationship;
	
	private boolean statusInterpersonalRelationship;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTrainee() {
		return trainee;
	}

	public void setTrainee(String trainee) {
		this.trainee = trainee;
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public String getDateEvaluation() {
		return dateEvaluation;
	}

	public void setDateEvaluation(String dateEvaluation) {
		this.dateEvaluation = dateEvaluation;
	}

	public String getDateResponse() {
		return dateResponse;
	}

	public void setDateResponse(String dateResponse) {
		this.dateResponse = dateResponse;
	}

	public String getPersonalPresentation() {
		return personalPresentation;
	}

	public void setPersonalPresentation(String personalPresentation) {
		this.personalPresentation = personalPresentation;
	}

	public boolean isStatusPersonalPresentation() {
		return statusPersonalPresentation;
	}

	public void setStatusPersonalPresentation(boolean statusPersonalPresentation) {
		this.statusPersonalPresentation = statusPersonalPresentation;
	}

	public String getAssiduity() {
		return assiduity;
	}

	public void setAssiduity(String assiduity) {
		this.assiduity = assiduity;
	}

	public boolean isStatusAssiduity() {
		return statusAssiduity;
	}

	public void setStatusAssiduity(boolean statusAssiduity) {
		this.statusAssiduity = statusAssiduity;
	}

	public String getPunctuality() {
		return punctuality;
	}

	public void setPunctuality(String punctuality) {
		this.punctuality = punctuality;
	}

	public boolean isStatusPunctuality() {
		return statusPunctuality;
	}

	public void setStatusPunctuality(boolean statusPunctuality) {
		this.statusPunctuality = statusPunctuality;
	}

	public String getInitiative() {
		return initiative;
	}

	public void setInitiative(String initiative) {
		this.initiative = initiative;
	}

	public boolean isStatusInitiative() {
		return statusInitiative;
	}

	public void setStatusInitiative(boolean statusInitiative) {
		this.statusInitiative = statusInitiative;
	}

	public String getInterpersonalRelationship() {
		return interpersonalRelationship;
	}

	public void setInterpersonalRelationship(String interpersonalRelationship) {
		this.interpersonalRelationship = interpersonalRelationship;
	}

	public boolean isStatusInterpersonalRelationship() {
		return statusInterpersonalRelationship;
	}

	public void setStatusInterpersonalRelationship(
			boolean statusInterpersonalRelationship) {
		this.statusInterpersonalRelationship = statusInterpersonalRelationship;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((assiduity == null) ? 0 : assiduity.hashCode());
		result = prime * result
				+ ((dateEvaluation == null) ? 0 : dateEvaluation.hashCode());
		result = prime * result
				+ ((dateResponse == null) ? 0 : dateResponse.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((initiative == null) ? 0 : initiative.hashCode());
		result = prime
				* result
				+ ((interpersonalRelationship == null) ? 0
						: interpersonalRelationship.hashCode());
		result = prime
				* result
				+ ((personalPresentation == null) ? 0 : personalPresentation
						.hashCode());
		result = prime * result
				+ ((punctuality == null) ? 0 : punctuality.hashCode());
		result = prime * result + (statusAssiduity ? 1231 : 1237);
		result = prime * result + (statusInitiative ? 1231 : 1237);
		result = prime * result
				+ (statusInterpersonalRelationship ? 1231 : 1237);
		result = prime * result + (statusPersonalPresentation ? 1231 : 1237);
		result = prime * result + (statusPunctuality ? 1231 : 1237);
		result = prime * result
				+ ((supervisor == null) ? 0 : supervisor.hashCode());
		result = prime * result + ((trainee == null) ? 0 : trainee.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evaluation other = (Evaluation) obj;
		if (assiduity == null) {
			if (other.assiduity != null)
				return false;
		} else if (!assiduity.equals(other.assiduity))
			return false;
		if (dateEvaluation == null) {
			if (other.dateEvaluation != null)
				return false;
		} else if (!dateEvaluation.equals(other.dateEvaluation))
			return false;
		if (dateResponse == null) {
			if (other.dateResponse != null)
				return false;
		} else if (!dateResponse.equals(other.dateResponse))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (initiative == null) {
			if (other.initiative != null)
				return false;
		} else if (!initiative.equals(other.initiative))
			return false;
		if (interpersonalRelationship == null) {
			if (other.interpersonalRelationship != null)
				return false;
		} else if (!interpersonalRelationship
				.equals(other.interpersonalRelationship))
			return false;
		if (personalPresentation == null) {
			if (other.personalPresentation != null)
				return false;
		} else if (!personalPresentation.equals(other.personalPresentation))
			return false;
		if (punctuality == null) {
			if (other.punctuality != null)
				return false;
		} else if (!punctuality.equals(other.punctuality))
			return false;
		if (statusAssiduity != other.statusAssiduity)
			return false;
		if (statusInitiative != other.statusInitiative)
			return false;
		if (statusInterpersonalRelationship != other.statusInterpersonalRelationship)
			return false;
		if (statusPersonalPresentation != other.statusPersonalPresentation)
			return false;
		if (statusPunctuality != other.statusPunctuality)
			return false;
		if (supervisor == null) {
			if (other.supervisor != null)
				return false;
		} else if (!supervisor.equals(other.supervisor))
			return false;
		if (trainee == null) {
			if (other.trainee != null)
				return false;
		} else if (!trainee.equals(other.trainee))
			return false;
		return true;
	}
}

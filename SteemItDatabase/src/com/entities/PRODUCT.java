package com.entities;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PRODUCT
 *
 */
@Entity
public class PRODUCT implements Serializable {

	   
	@Id
	@SequenceGenerator(name="SEQ_GEN", allocationSize=1, initialValue=1)
	@GeneratedValue(generator="SEQ_GEN", strategy=GenerationType.SEQUENCE)
	private Long ID;
	private String NAME;
	private String TYPE;
	private static final long serialVersionUID = 1L;

	public PRODUCT() {
		super();
	}   
	public Long getID() {
		return this.ID;
	}

	public void setID(Long ID) {
		this.ID = ID;
	}   
	public String getNAME() {
		return this.NAME;
	}

	public void setNAME(String NAME) {
		this.NAME = NAME;
	}   
	public String getTYPE() {
		return this.TYPE;
	}

	public void setTYPE(String TYPE) {
		this.TYPE = TYPE;
	}
   
}

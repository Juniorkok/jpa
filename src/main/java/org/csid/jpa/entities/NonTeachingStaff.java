package org.csid.jpa.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "NS")

public class NonTeachingStaff extends Staff{
	private String areaexpertise;
	
	public NonTeachingStaff() {
		super();
	}

	public NonTeachingStaff( int sid, String sname, String areaexpertise ){
		super( sid, sname );
		this.areaexpertise = areaexpertise;
	}

	public String getAreaexpertise() {
		return areaexpertise;
	}

	public void setAreaexpertise(String areaexpertise) {
		this.areaexpertise = areaexpertise;
	}

}

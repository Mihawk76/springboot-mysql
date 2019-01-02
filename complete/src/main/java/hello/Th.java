package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Th {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    //@GeneratedValue(strategy=GenerationType.SEQUENCE, name="user_id")
    //@GeneratedValue(strategy=GenerationType.SEQUENCE)
    //@SequenceGenerator( name="user_id", sequenceName="subscription_id_user", allocationSize=7)
    private Integer id;

    private Integer SubId;

    private String TimeStamps;

    private Integer Value;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getSubId() {
		return SubId;
	}

	public void setSubId(Integer SubId) {
		this.SubId = SubId;
	}

	public String getTimeStamps() {
		return TimeStamps;
	}

	public void setTimeStamps(String TimeStamps) {
		this.TimeStamps = TimeStamps;
	}

	public Integer getValue() {
		return Value;
	}

	public void setValue(Integer Value) {
		this.Value = Value;
	}
    
    
}


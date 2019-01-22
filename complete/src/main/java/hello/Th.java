package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity // This tells Hibernate to make a table out of this class
public class Th {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    //@GeneratedValue(strategy=GenerationType.SEQUENCE, name="user_id")
    //@GeneratedValue(strategy=GenerationType.SEQUENCE)
    //@SequenceGenerator( name="user_id", sequenceName="subscription_id_user", allocationSize=7)
    private Integer id;

    @Column(name="sub_id", nullable=false, length=11)
    private Integer SubId;

    @Column(name="time_stamps", nullable=false, length=30)
    private String TimeStamps;

    @Column(name="value", nullable=false, length=5)
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


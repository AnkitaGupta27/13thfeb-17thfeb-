package mvcspring.model;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Valentine_table")
public class Valentine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String location;
	private String date;
	private List<String> gifts;
	
	public Valentine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Valentine(int id, String location, String date, List<String> gifts) {
		super();
		this.id = id;
		this.location = location;
		this.date = date;
		this.gifts = gifts;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<String> getGifts() {
		return gifts;
	}
	public void setGifts(List<String> gifts) {
		this.gifts = gifts;
	}
	@Override
	public String toString() {
		return "Valentine [id=" + id + ", location=" + location + ", date=" + date + ", gifts=" + gifts + "]";
	}
	
	
	
	
	
}

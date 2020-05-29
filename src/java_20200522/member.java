package java_20200522;

public class member {
	private String id;
	private String name;
	
	
	
	
	public member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public member(String id) {
		this.id = id;
	}

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}

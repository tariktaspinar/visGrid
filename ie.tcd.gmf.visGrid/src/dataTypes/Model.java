package dataTypes;

public class Model {
	private String name;
	private String type;
	private Model parent;
	
	public Model(String name, String type, Model parent){
		this.name = name;
		this.type = type;
		this.parent = parent;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Model getParent() {
		return parent;
	}
	public void setParent(Model parent) {
		this.parent = parent;
	}
	
	
}

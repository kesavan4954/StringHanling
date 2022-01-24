package stringHandling;

public class UseOfThis {
	String name;
	
    public UseOfThis(String name) {
		
		this.name = name;
	}
	public UseOfThis() {
		System.out.println("Default Running");
	}
	public void show() {
		
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		UseOfThis obj = new UseOfThis("Ajith");
		obj.show();
		
		UseOfThis obj1 = new UseOfThis("Kesavan");
		obj1.show();
		
		UseOfThis obj2 = new UseOfThis();
		obj2.show();	

	}

}

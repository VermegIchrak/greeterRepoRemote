package edu.esprit.greeter;

public class Greeter {

	public String v;
    public String var5;
    public String var3;
    public String var4;
	/**
	 * sayHello method
	 * @param name
	 * @return "Hello"+ name
	 */
	
public String sayHello(String name){
	if(name.equals("MAN"))
		throw new IllegalArgumentException();
	return"hello"+name;
}

}

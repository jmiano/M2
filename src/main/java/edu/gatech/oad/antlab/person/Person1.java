package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 1
 *  returns their name and a
 *  modified string 
 *  
 *  @author Zheheng Fan
 *  @version 2018/9/4
 */
public class Person1 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person1(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	    if (input == null || input.length() == 0) {
	    	return input;
		}
        String newstr = "";
	    int rotationindex = 2 % input.length();
	    for (int i = 0; i < input.length(); i++) {
	    	newstr += input.charAt((i + rotationindex) % input.length());
		}
		return newstr;


	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
	/**
	 * the tester
	 *
	 * @param args the array
	 *
	 */
	public static void main(String[]args) {
		Person1 niceperson = new Person1("ZhehengFan");
		System.out.println(niceperson.calc("ZhehengFan"));
		System.out.println(niceperson.calc(null));
	}


}

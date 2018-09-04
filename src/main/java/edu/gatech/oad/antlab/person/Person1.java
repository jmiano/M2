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
		int length = 2 % (input.length());
		reverse(input, 0, input.length() - 2 - 1);
		reverse(input, input.length() - length, input.length() - 1);
		reverse(input, 0, input.length() - 1);
		return input;
	}
	private void reverse(String input, int start, int end) {
		for (int i = start, j = end; i < j; i++, j--) {
			String temp = input[j];
			input[j] = input[i];
			input[i] = temp;
		}
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

	public static void main(String[]args) {
		System.out.println(cal("ZhehengFan"));
	}


}

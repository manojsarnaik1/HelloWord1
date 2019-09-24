package Validation;

import java.util.Arrays;


/*Deep Copy

>>Whenever we need own copy not to use default implementation we call it as deep copy, 
whenever we need deep copy of the object we need to implement according to our need.
>>So for deep copy we need to ensure all the member class also implement the Cloneable interface 
and override the clone() method of the object class.
A deep copy means actually creating a new array and copying over the values.
*/

/*            0  1  2
 * values--->[3][7][9]
 * 
 *            0  1  2 
 *values---> [3][7][9]
 *
 *    Shallow Copy
 * */
 
//Code explaining deep copy
 class Ex23 {
 private int[] data;
 // altered to make a deep copy of values
 public Ex23(int[] values) {
     data = new int[values.length];
     for (int i = 0; i < data.length; i++) {
         data[i] = values[i];
     }
 }
 public void showData() {
     System.out.println(Arrays.toString(data)+"==="+data);
 }
}

public class DeepCopy {
	public static void main(String[] args) {
		int[] vals = {1, 7, 9};
        Ex23 e = new Ex23(vals);
        Ex23 e2 = e;
        e.showData(); // prints out [3, 7, 9]
        vals[0] = 13;
        e2.showData(); // prints out [3, 7, 9]
       // changes in array values will not be 
       // shown in data values. 
	}
}

package Lec1;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5; 
		x -=5;  // x = x-5; // Assignment Operator 
		System.out.println(x);// o/p =0
		
		
		x +=9;  // x = x+9; // Assignment Operator 
		System.out.println(x);  //o/p =9
		

	}

}                  // SEE OPERATORS BELOW

//          Arithmetic Operators
// * : Multiplication
// / : Division
// % : Modulo
// + : Addition
// – : Subtraction

//------------------------------------
		
//           Unary Operators
//Unary Operators need only one operand. They are used to increment, decrement, or negate a value. 
//
// - , Negates the value.
// + , Indicates a positive value (automatically converts byte, char, or short to int).
// ++ , Increments by 1.
// Post-Increment: Uses value first, then increments.
// Pre-Increment: Increments first, then uses value.
// -- , Decrements by 1.
// Post-Decrement: Uses value first, then decrements.
// Pre-Decrement: Decrements first, then uses value.
// ! , Inverts a boolean value.

//------------------------------------

//           Assignment Operator
//      += , Add and assign.
//		-= , Subtract and assign.
//		*= , Multiply and assign.
//		/= , Divide and assign.
//		%= , Modulo and assign.

//-------------------------------------------

//           Relational Operators
//Relational Operators are used to check for relations like equality, greater than, and less than. They return boolean results after the comparison and are extensively used in looping statements as well as conditional if-else statements. The general format is , 
// variable relation_operator value 
// Relational/Comparison operators compare values and return boolean results:
//
// == , Equal to.
// != , Not equal to.
// <  , Less than.
// <= , Less than or equal to.
// >  , Greater than.
// >= , Greater than or equal to.

//---------------------------------------

//     Logical Operators
//Logical Operators are used to perform “logical AND” and “logical OR” operations, similar to AND gate and OR gate in digital electronics. They have a short-circuiting effect, meaning the second condition is not evaluated if the first is false.
//Conditional operators are:
//
// &&  Logical AND: returns true when both conditions are true.
// ||  Logical OR : returns true if at least one condition is true.
// !   Logical NOT: returns true when a condition is false and vice-versa
//

//-------------------------------------------

//      Bitwise Operators
//Bitwise Operators are used to perform the manipulation of individual bits of a number and with any of the integer types. They are used when performing update and query operations of the Binary indexed trees. 
//
// & (Bitwise AND) – returns bit-by-bit AND of input values.
// | (Bitwise OR)  – returns bit-by-bit OR  of input values.
// ^ (Bitwise XOR) – returns bit-by-bit XOR of input values.
// ~ (Bitwise Complement) – inverts all bits (one’s complement).




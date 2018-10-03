/**
 * 
 * @author parth
 *
 */
import java.util.Scanner;

public class InputRectangle 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		//Read Length of Rectangle
		
		System.out.print("Enter the length of the rectangle: ");
		double rectangleLength = in.nextDouble();
		
		//Read Width of Rectangle
		
		System.out.print("Enter the width of the rectangle: ");
		double rectangleWidth = in.nextDouble();
		
		//Compute Area
		
		double rectangleArea = rectangleWidth*rectangleLength;
		
		//Compute Perimeter
		
		double rectanglePerimeter = (2*rectangleWidth) + (2*rectangleLength);
		
		//Compute Diagonal Length
		
		double rectangleDiagonal = Math.sqrt(rectangleWidth*rectangleWidth) + (rectangleLength*rectangleLength);
		
		//Print Final Answers
		
		System.out.printf("Area of the Rectangle:, %8.2f", rectangleArea);
		System.out.println();
		
		System.out.printf("Perimeter of the Rectangle:, %8.2f", rectanglePerimeter);
		System.out.println();

		System.out.printf("Diagonal Length of the Rectangle:, %8.2f", rectangleDiagonal);
		System.out.println();
	}		
}
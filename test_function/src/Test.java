import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		
//Shortcut to comment out: Ctrl-SHIFT-7
//Shortcut for System.out.println(): sysout+Ctrl+SPACE
		
//Calculations:
System.out.println(Math.abs(-10));
//Rounding up: 
System.out.println(Math.ceil(9.5));
//Rounding down:
System.out.println(Math.floor(9.5));
//Round:
System.out.println(Math.round(9.5));
//Minimum:
System.out.println(Math.min(6,1));
//Maximum:
System.out.println(Math.max(1, 6));
//Logarithm:
System.out.println(Math.log(6));
//Calculate: 2^10
System.out.println(Math.pow(2, 10));
//Random number between 0 and 5:
System.out.println(Math.random()*10);;

//Abbreviations:
long c = 123;
c += 123;
c --;
System.out.println(c);
float a = 6;
float b = 5;
float sum = a + b;
float dif = a - b;
float product = a * b;
float quot = a/b;
float q = 255f/4f;
System.out.println(q);		
float remainder = a%b;
System.out.println(sum);
System.out.println(dif);
System.out.println(product);
System.out.println(quot);
System.out.println(remainder);

//TEST IF SOMETHING IS ODD OR EVEN:
int ab = 3;
if(ab%2 >0) {System.out.println("odd");}
else System.out.println("even");

//Scanner:		
Scanner scan = new Scanner (System.in);
System.out.println("Please enter a number in the range of 1 to 10: ");
int x = scan.nextInt();
if(x ==10) {System.out.println("You have thrown a straigt 10 out of 10!");}
else if(x<10 && x>=7) {System.out.println("Your number is smaller than 10, however it's equal to or greater 7.");}
else if(x<7 && x>=4) {System.out.println("Your number is smaller than 7, however it's equal to or greater 4.");}
else if(x<4 && x>=2) {System.out.println("Your number is smaller than 4, however it's equal to or greater 2.");}
else if(x<2 && x>=1) {System.out.println("Your number is smaller than 2, however it's equal to or greater 1.");}
else {System.out.println("Your number is greater than 10 or smaller than 1! Your input is not valid.");}

////Cases with scanner example:
//Scanner scan1 = new Scanner (System.in);
//System.out.println("Please name a number in the range of 1 to 5: ");
//int u = scan1.nextInt();
//switch(u) {
//case 5: System.out.print("It's 5 ");
//break;
//case 4: System.out.print("It's 4");
//break;
//case 3: System.out.print("It's 3");
//break;
//case 2: System.out.print("It's 2");
//break;
//case 1: System.out.print("It's 1");
//break;
//default : System.out.print("This case wasn't implemented.");

//Substrings
Scanner input = new Scanner(System.in);
System.out.println("Please write: World.");
String l = input.next();
if(l.contentEquals("World")) {System.out.println("WOW!");}
else System.out.println("Wrong.");
String z = "I live in munic";
int pos = z.lastIndexOf(" ");
System.out.println(z.substring(pos));

//COMBINE IN FOR-LOOP
for(int i=1;i<=15;i++) {if(i%3==0 && i%5==0) {System.out.println("ZickZack");}
else if(i%3==0) {System.out.println("Zick");}
else if(i%5==0) {System.out.println("Zack");}
else {System.out.println(i);}


//Count words without the usage of lists:
String file = "Faust.txt";
System.out.println(file);
Scanner input3 = new Scanner(Paths.get(file));
int countYou = 0;
int countI = 0;
while(input3.hasNext()){
String word = input3.next();
word = word.toLowerCase();
System.out.println(word);
if(word.equals("ich")){countYou++;}
if(word.equals("du")){countI++;}
}
System.out.println("Ich: "+countYou);
System.out.println("Du: "+countI);

//ARRAYS
String[] name = new String[7]; 
name[0] = "Erik";
name[1] = "Max";
name[2] = "Jan";
name[3] = "Luis";
name[4] = "Bernhard";
name[5] = "Simone";
name[6] = "Sebastian";
System.out.println(name[0]);
System.out.println(name[2]);
System.out.println(name[5]);
System.out.println(name[6]);
System.out.println(Arrays.toString(name));

////ARRAYSCAN
//Scanner scan3 = new Scanner(System.in);
//System.out.println("How many students are in this course?");
//int numberOfStudents = scan3.nextInt();
//String[] names = new String[numberOfStudents];
//System.out.println("Please enter "+names.length +" firstnames:");
//for(int n = 0;n<names.length;n++) {names[n] = scan3.next();}
//System.out.println(Arrays.toString(names));

//ARRAYS SHORT VERSION:
String os []= {"Windows", "Linux", "Mac"};
for(String osElement:os) {System.out.println(osElement);}

//LARGEST NUMBER OF AN INT ARRAY:
int []p=new int[10];
int t[]= {3,6,2,4,5,8,7,1};
int maxItem=Integer.MIN_VALUE;
////Alternative:  for(int item:t) {maxItem = Math.max(maxItem, item);
////System.out.println(maxItem);
for(int item:t) {System.out.println(item); if(maxItem<item) {maxItem=item;}
System.out.println("The biggest number is: "+maxItem);
}

//MULTI-DIMENSIONAL ARRAYS
boolean[][] board = new boolean[8][8];
board[0][1]=true;
for(boolean[] row:board) {
	System.out.println(Arrays.toString(row));
}
}	
}
}
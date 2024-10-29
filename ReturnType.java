public class ReturnType{

public static void main(String[] args){


  	checkTheDate();

  	doTheTask();

  	messageTo();


 	int result = add(12 , 13);

 	int value = sub(22 , 23);

  	int marks = mark(608 , 749 , 984 , 845);

 	}


		 public static void checkTheDate(){
  		System.out.println("Check the Today's Date");
 		}

 		public static void messageTo(){
   		System.out.println("Good Evening");
  		}


  		public static int doTheTask(){
  		System.out.println("did the task");
  		return 12;
	    }
  

  		public static int add(int a , int b){
  		int addedValue = a + b;
  		System.out.println(addedValue);
   		return a + b;
  		}


    	public static int sub(int a , int b){
   		int substractedValue = a - b;
  		System.out.println(substractedValue);
   		return a - b;
		}
  

  		public static int mark(int a , int b , int c , int d){
  		int marks = a + b + c + d;
  		System.out.println(marks);
  		return d + c + a + b; 
  		}	

				}
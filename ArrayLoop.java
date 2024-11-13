public class ArrayLoop{

  public static void main(String[] args) {

    byte [] numberOfAlphabet = {26,24,22,18,16,14,12,10,8,6,2};

    for(int i=0; i<=10; i++){
    System.out.println(numberOfAlphabet[i]);                         // Left to Right
     }

   	for(int i=10; i>=0; i--){
    System.out.println(numberOfAlphabet[i]);                         //Right to Left
   	 }
   
    for(int i=5; i>=0; i--){
    System.out.println(numberOfAlphabet[i]);                         //Middle to Left  
   	 }
     
    for(int i=0; i<=5; i++){
    System.out.println(numberOfAlphabet[i]);                         //Left to Middle
     }

   	for(int i=0; i<=10; i=i+2){
   	System.out.println(numberOfAlphabet[i]);                         //Skipping one Element
   	 }


    short[]damsInIndia = {8647,8174,9034,9208,7589,8795,8975,8239,6584,1213};
        
    for(int i=0; i<=9; i++){
    System.out.println(damsInIndia[i]);                              // Left to Right
     }

    for(int i=9; i>=0; i--){
    System.out.println(damsInIndia[i]);                              //Right to Left
     }
   
    for(int i=5; i>=0; i--){
    System.out.println(damsInIndia[i]);                              //Middle to Left  
     }
     
    for(int i=0; i<=5; i++){
    System.out.println(damsInIndia[i]);                             //Left to Middle
     }

    for(int i=0; i<=9; i=i+2){
    System.out.println(damsInIndia[i]);                             //Skipping one Element 
     }
        

    float[]oneUsd = {0.8765f, 0.1213f, 0.1323f, 0.1445f, 0.8555f,  0.322f, 2.1213f};

    for(int i=0; i<=6; i++){
    System.out.println(oneUsd[i]);                                  // Left to Right
     }

    for(int i=6; i>=0; i--){
    System.out.println(oneUsd[i]);                                  //Right to Left
     }
   
    for(int i=3; i>=0; i--){
    System.out.println(oneUsd[i]);                                  //Middle to Left  
     }
     
    for(int i=0; i<=3; i++){
    System.out.println(oneUsd[i]);                                  //Left to Middle
     }

    for(int i=0; i<=6; i=i+2){
    System.out.println(oneUsd[i]);                                  //Skipping one Element 
     }

     
    boolean[]isJavaEasy = {true,true,false,false,true,false,true,false,true,true};

    for(int i=0; i<=9; i++){
    System.out.println(isJavaEasy[i]);                             // Left to Right
     }

    for(int i=9; i>=0; i--){
    System.out.println(isJavaEasy[i]);                             //Right to Left
     }
   
    for(int i=5; i>=0; i--){
    System.out.println(isJavaEasy[i]);                            //Middle to Left  
     }
     
    for(int i=0; i<=5; i++){
    System.out.println(isJavaEasy[i]);                            //Left to Middle
     }

    for(int i=0; i<=9; i=i+2){
    System.out.println(isJavaEasy[i]);                            //Skipping one Element 
     }

      
    long[]creditCardNumbers = {543210987654321l, 93568366921558l,9852222279834l,7258356742971l, 7823655963392l, 637285757875l,960949658901L,9461000000000L};

    for(int i=0; i<=7; i++){
    System.out.println(creditCardNumbers[i]);                    // Left to Right
     }

    for(int i=7; i>=0; i--){
    System.out.println(creditCardNumbers[i]);                   //Right to Left
     }
   
    for(int i=4; i>=0; i--){
    System.out.println(creditCardNumbers[i]);                   //Middle to Left  
     }
     
    for(int i=0; i<=4; i++){
    System.out.println(creditCardNumbers[i]);                   //Left to Middle
     }

    for(int i=0; i<=7; i=i+2){
    System.out.println(creditCardNumbers[i]);                  //Skipping one Element 
     }
      

   }


 }




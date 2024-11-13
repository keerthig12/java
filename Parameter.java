public class Parameter{

    public static void main(String [] args){

        indianflagColor("white");

        universityName("VTU", "KOPPALA");
        universityName("REVA", "JAIN");

        studentdetail("JAKIYA", 21 , 988467223L);
        studentdetail("KEERTHI", 21, 636282838L);
        studentdetail("DEEPA", 22, 8236622863L);

        userName("Keerthi", 'F', 75.86f, 2000575756l);
        
    }


    public static void indianflagColor(String name){                                                        //ONE PARAMETER

        System.out.println(name + " : Represents Peace, Purity, Truth and Integrity");
    
    }

    public static void universityName(String nameOne ,String nameTwo){                                      //TWO PARAMETER

        System.out.println(nameOne + " " + nameTwo);                    

    }

     public static void studentdetail(String name, int age , long phno){                                   //THREE PARAMETER

        System.out.println("NAME :" + name +", " + "AGE :" + age + ", "+ "PHONE NUMBER :" +phno);

    }

    public static void userName(String user, char gender, float value , long number){                      //FOUR PARAMETER
  
        System.out.println("NAME : " + user + "," +  "Gender : " + gender + "," + "Percentage :" + value + "," + "Users in Karnataka : " + number);
    }
    

}
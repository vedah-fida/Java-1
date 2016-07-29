/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package head.first.code;

/**
 *
 * @author ken
 */
public class HeadFirstCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
        int beerNum = 2;
        String word = "bottles";
        while (beerNum > 0) {
            if (beerNum == 1){
                word = "bottles";
            }
        
        System.out.println("I Rule the world");
        System.out.println("I am a winner");
        System.out.println(beerNum + "" + word + "of beer on the wall");
        System.out.println("Take one down");
        System.out.println("Pass it around");
        beerNum = beerNum - 1;
        
        if (beerNum > 0) {
            System.out.println(beerNum + "" + " of beer on the wall");
                        
        } // end if loop
        else {
           System.out.println("No more bottles of beer on the wall"); 
        }//end else loop 
        } //end while loop
        */ 
   
        String[] first_list = {"Kenya", "Uganda", "Tanzania"};
	String[] second_list = {"Nairobi", "Kampala" ,"Dodoma"};
	String[] third_list = {"Uhuru", "Yoweri", "Pombe","Kagame","Mugabe"};
		
//find out length of strings
	int length_first = first_list.length;
	int length_second = second_list.length;
	int length_third = third_list.length;
//generate random numbers
	int rand1 = (int) (Math.random() * length_first);
	int r_2 =(int) (Math.random() * length_second);
	int r_3 = (int) (Math.random() * length_third);
//build the phrase
	String phrase = first_list[rand1] + " " + second_list[r_2] + " " + third_list[r_3];
//print the phrase
	System.out.println("Our new phrase is," + phrase);
  } //end main
}

 

# Game

Here I have written a code for a wording game. Which has 2 options like one is finding missing letters and complete the word and the other one is solving the jumbled word.

For that I have created 2 classes one is MissingLetters and the other one is JumbledWord

And here I have written 10 words which are used in two different types of games like finding the missing letters and rearranging the jumbled word. For that I havetaken an String.

And stored 10 words in it and I have created the object of the String to store the 10 words. 

      String[] word={"PRODAPT","BANGLORE","IPRIMED","STRING","ENGLISH","GRAMMER","PAPER","PRODUCT","NOTEPAD","PLACE"};
      String n[]=new String [10];
      
After completion of the game I have to provide the score for that game so that I have taken an integer variable score and assigned it with 0. To check the entered word is correct or not I need one variable so that I used i variable.       
      
      int score=0;
      int i=0;
      
Here scanner class is used to enter the answers for the game and also used System.in to give input. 

      Scanner sc=new Scanner(System.in);
      
To check the entered word or string is correct or not I have used for loop and if condition. If the word is matching it will increment the score by one. Like that the loop will execute for 10 times. 
  
       for(String s:word)
       {
         if(n[i].equals(s))
          {
           score=score+1;
          }
         i++;
       }
      
       
Like this the same code is implemented for jumbled word also. After completing the game finally it will display the score. 

       System.out.println("\nYour score is :"+score);
       
In Game class i have created the objects of those 2 classesanth used switch case to select which game to play.

        switch(ch)
          {
           case 1: Missingletter a=new Missingletter();
                   break;
           case 2: Jumbledword b=new Jumbledword();
                   break;
         default : System.out.println("Wrong choice");
          }
          
  And finally atlast it will display the score.        

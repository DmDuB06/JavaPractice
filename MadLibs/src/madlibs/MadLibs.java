
package madlibs;

import java.util.Random;
import java.util.Scanner;

public class MadLibs {

    Scanner scanner = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNums;
    Random rand = new Random();
    
    //Getters
    
    public String getStory() {
        return story;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAdjective1() {
        return adjective1;
    }
    
    public String getAdjective2() {
        return adjective2;
    }
    
    public String getNoun1() {
        return noun1;
    }
    
    public String getNoun2() {
        return noun2;
    }
    
    public String getNoun3() {
        return noun3;
    }
    
    public String getAdverb() {
        return adverb;
    }
    
    public String getRandomNums() {
        return randomNums;
    }
          
          
    //Setters
    
    public void setStory(String newStory) {
        this.story = newStory;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setAdjective1(String newAdj1) {
        this.adjective1 = newAdj1;
    }
    
    public void setAdjective2(String newAdj2) {
        this.adjective1 = newAdj2;
    }
    
    public void setNoun1(String newNoun1) {
        this.noun1 = newNoun1;
    }
    
    public void setNoun2(String newNoun2) {
        this.noun1 = newNoun2;
    }
    
    public void setNoun3(String newNoun3) {
        this.noun1 = newNoun3;
    }
    
    public void setAdverb(String newAdverb) {
        this.adverb = newAdverb;
    }
    
   public void setRandomNums() {
       
   }
   
   public void printInstruction() {
       System.out.println("Welcome to the MadLibs game.  If you type in "
                + "words, we will give you a story.  Start by typing in  a name.");
   }
   
   public void putTogetherTheStory() {
       String story = "Jesse and her best friend " +getName()+ " went to Disney World today! "
               + "They saw a " + getNoun1() + " in a show in the Magic Kingdom"
               +" and ate a " + getAdjective1()+ " feast for dinner.  The next day I"
               + " ran " + getAdverb() + " to meet Mickey Mouse in his " + getNoun2() + " "
               + "and then that night I gazed at the " + getRandomNums() + " " +
               getAdjective2() + "fireworks shooting from the " + getNoun3() + ".";
       setStory(story);
       //resume hackerrank day 6 video at 11:25
   }
   
    public static void main(String[] args) {
        // TODO code application logic here
        MadLibs game = new MadLibs();
        game.printInstruction();
    }
    
}


package cointoss;

import java.util.Random;

/**
 *
 * @author David M. Dubois
 */
public class CoinToss {

    public String tossACoin() {
        Random rand = new Random();
        // Calls Math method. rand will grab a random int. 
        // abs is absolute value to ensure number is a positive int.
        // Mod % by 2 to see if it is divisible by 2.  % 2 Will provide the remainder,
        // of the random number, even number will have remainder of 0, odd number
        // will have a remainder of 1.
        int toss = Math.abs(rand.nextInt()) % 2;
        if (toss == 0) {
            return "HEADS";
        } else {
            return "TAILS";
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        CoinToss game = new CoinToss();
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        
    }
    
}

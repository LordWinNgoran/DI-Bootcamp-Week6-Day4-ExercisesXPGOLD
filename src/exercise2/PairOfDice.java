//Exercise 2 : PairOfDice
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Write a PairOfDice class in which the instance variables die1 and die2 are private.
* Your class will need methods that can be used to find out the values of die1 and die2.
* Include other improvements in the class, if you can think of any.
* date: 03/02/2023
*/
package exercise2;

public class PairOfDice {
	private int die1;
    private int die2;
    
    public PairOfDice() {
        this.die1 = 0;
        this.die2 = 0;
    }
    
    public int getDie1() {
        return this.die1;
    }
    
    public int getDie2() {
        return this.die2;
    }
    
    public void setDie1(int die1) {
        this.die1 = die1;
    }
    
    public void setDie2(int die2) {
        this.die2 = die2;
    }
    
    public int rolledDicePair() {
        int diceRolledNbre = 0;
        
        while(this.die1 + this.die2 != 2) {
            diceRolledNbre++;
            this.die1 = (int) (1 + Math.random() * (6 - 1));
            this.die2 = (int) (1 + Math.random() * (6 - 1));
        }
        
        return diceRolledNbre;
    }
    
    public static void main(String[] args) {
        PairOfDice pdc = new  PairOfDice();
        System.out.println(pdc.rolledDicePair());
    }

}

//Exercise 1 : Walking The Dog
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:In this exercise, we are going to have two classes, Dog and DogOwner.
* date: 03/02/2023
*/

package exercise1;

public class Dog {

    private int time;
    
    public void setDrinkTime(int time) {
        // TODO: implement method stub
        this.time = time;
    }

    public int getDrinkTime() {
        // TODO: implement method stub
        return this.time;
    }

    /**
     * The dog needs to go for a walk if it had a drink more than 4 hours ago;
     * i.e., if getDrinkTime() returns a value > 4.
     */
    public boolean needsToGo() {
        if(getDrinkTime() > 4) {
            return true;
        }
        return false;
    }

}

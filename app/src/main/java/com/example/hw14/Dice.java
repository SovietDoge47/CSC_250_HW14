package com.example.hw14;
import java.util.Random;

public class Dice
{
    private int numberOfSides;
    private int numberOfRolls;

    public Dice(int numberOfSides)
    {
        this.numberOfSides = numberOfSides;
        this.numberOfRolls = numberOfRolls;
    }

    public int roll()
    {
        Random r = new Random();
        return r.nextInt(this.numberOfSides)+1;
    }
}

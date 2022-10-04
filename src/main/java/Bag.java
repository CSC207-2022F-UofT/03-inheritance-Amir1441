/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

import java.util.*;


public abstract class Bag {
    private String colour;
    private int numberOfContents;
    private int capacity;
    private String[] contents;
    /*
     * TODO: Create the following private instance variables
     *       - a String named color
     *       - an int named numberOfContents
     *       - an int named capacity
     *       - an array of Strings named contents
     */




    /*
     * TODO: Create a constructor that takes two arguments:
     *       - a String representing the Bag's colour
     *       - an int representing the Bag's capacity
     *
     * The other attributes (private instance variables) should
     * be empty (e.g. numberOfContents is 0 and an empty String array for
     * its contents.)
     */
    public Bag(String colour, int capacity){
        this.numberOfContents = 0;
        this.contents = new String[] {"Hello", "World"};
        this.colour = colour;
        this.capacity = capacity;
    }








    /*
     * TODO: Create a variety of 'getter' functions.
     *       These should be named:
     *           - getColor
     *           - getNumberOfContents
     *           - getCapacity
     */

    public String getColour() {
        return colour;
    }
    public int getNumberOfContents() {
        return numberOfContents;
    }
    public int getCapacity() {
        return capacity;
    }



    /*
     * TODO: Create a setter function called setColor which sets the
     *       color of this bag to the given color.
     */

    public void setColour(String colour) {
        this.colour = colour;
    }



    /**
     * TODO: Create a method called popItem that returns a String.
     *       The string should be the last item added to this Bag
     *       and the item should be removed from this Bag.
     *       Remember to modify numberOfContents accordingly.
     * <p>
     * If there are no items in this Bag, return null.
     *
     */

    public String popItem() {
        List al = Arrays.asList(contents);
        int index = al.size() - 1;
        al.remove(index);
        numberOfContents = numberOfContents - 1;
        return null;

    }



        /**
         * Increase this bag's capacity by n.
         *
         * @param n the amount to increase this Bag's capacity by
         */
        public void increaseCapacity(int n){
            capacity = capacity + n;


        }


        /**
         * Return the details of this Bag.
         * This method requires you to have created the private
         * instance variables mentioned above.
         *
         * @return
         */
        @Override
        public String toString () {
            return this.colour + " Bag (" + this.numberOfContents + " / " +
                    this.capacity + ")";
        }

        public void addItem(String item) {
            if (numberOfContents < capacity) {
                contents[numberOfContents] = item;
                numberOfContents++;
            }
        }

        /*
         * Below we have defined an abstract method.
         * This method takes no arguments and does not return anything.
         * It increases the capacity of this Bag.
         *
         * You will need to implement this method in
         * HandBag.java and CrossbodyBag.java.
         *
         * We recommend you look at HandBag.java first.
         */
        public abstract void enhance();


    }







    /*
     * TODO: Create a method called addItem that takes in a String
     *       representing an item in the Bag.
     *       The item is added into the Bag if the number of items
     *       in the bag is < the capacity of the Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     *       This method should return true if the item was added
     *       and false otherwise.
     *
     */






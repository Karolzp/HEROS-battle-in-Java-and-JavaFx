package com.heroes.model;

import java.util.ArrayList;
import java.util.List;


/**
 * Class including different validation methods
 */
public class Validation {

    /**
     * @author Yaro & Karol
     * @param unit
     * @param squaresList
     * @return ArrayList<Square>
     */
    public static List<Square> createArrayOfSquareToMove(Unit unit, List<Square> squaresList){
        List<Square>squaresToMove = new ArrayList<>();
        for (Square square : squaresList){
            if ((Math.abs(square.getLocationX() - unit.getX()) + Math.abs(square.getLocationY()-unit.getY()) <= unit.getMoveRange()) && square.getIsStandable()){
                squaresToMove.add(square);
            }
        }
        System.out.println(unit.getName());                             //testing and debuging
        for (int i = 0; i < squaresToMove.size(); i++){                 //testing and debuging
            System.out.println(squaresToMove.get(i).getName());         //testing and debuging
        }
        return squaresToMove;
    }
}

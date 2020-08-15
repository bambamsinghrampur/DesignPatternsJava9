package com.premaseem.houseBuilder;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
/* "Abstract Builder" */
public abstract class HouseBuilder {

    public House getHouse () {
        return house;
    }
   //what component to build
    private House house =null;
    // house set via constructer injection ,here composition is followed strong form of association
    //a house is destroyed if a houseBuilder is destroyed
    public HouseBuilder(){
     house = new House();
   }

    public abstract void addRooms();

    public void addSecuritySystem(){
        System.out.println("adding security system");
    }

    public void addPlumbingSystem(){
        System.out.println("adding plumbing system");
    }

    public void addAirConditionerSystem(){
        System.out.println("adding air conditioning system");
    }

    public void paintHouse(String color){
        System.out.println("paiting house with color " + color);
        house.setExteriorColor(color);
    }

}

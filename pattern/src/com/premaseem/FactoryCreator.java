package com.premaseem;

import com.premaseem.factory.AbstractIceCreamFactory;
import com.premaseem.factory.AmulIceCreamFactory;
import com.premaseem.factory.DairyQueenCreamFactory;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class FactoryCreator {
        static AbstractIceCreamFactory getFactory (String brand) {
            if (brand.equalsIgnoreCase("Amul")){
                return new AmulIceCreamFactory();
            }else {
                return new DairyQueenCreamFactory();
            }
    }
}

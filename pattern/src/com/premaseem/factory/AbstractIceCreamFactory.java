package com.premaseem.factory;

import com.premaseem.icecreams.IceCream;
import com.premaseem.milkshake.MilkShake;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public abstract class AbstractIceCreamFactory {
    public abstract IceCream createIceCream(String choice);
    public abstract MilkShake createMilkShake(String choice);

}

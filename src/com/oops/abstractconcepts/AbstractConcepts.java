package com.oops.abstractconcepts;

//We can create only public abstract or default abstract class
public abstract class AbstractConcepts {

    //Default access specifier is package level access
    //We can not use private with Abstract method
     abstract void getValue();

     //Not require to over ride the method
    public void test()
    {
        System.out.println("call test ");
    }
}
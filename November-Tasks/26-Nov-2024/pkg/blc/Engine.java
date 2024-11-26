//BLC class of TestCar

package com.blc;

public class Engine
{
    private String model;

    public Engine(String model)
    {
        this.model = model;
    }

    public String getModel()
    {
        return model;
    }

    @Override
    public String toString()
    {
        return "Engine Model = "+model;
    }

}
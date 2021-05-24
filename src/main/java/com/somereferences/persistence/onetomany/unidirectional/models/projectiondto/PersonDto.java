package com.somereferences.persistence.onetomany.unidirectional.models.projectiondto;

public class PersonDto {
    private String AttributeTwo;
    private double AttributeThree;

    public PersonDto(String attributeTwo, double attributeThree) {
        AttributeTwo = attributeTwo;
        AttributeThree = attributeThree;
    }

    public String getAttributeTwo() {
        return AttributeTwo;
    }

    public double getAttributeThree() {
        return AttributeThree;
    }

    public void setAttributeTwo(String attributeTwo) {
        AttributeTwo = attributeTwo;
    }

    public void setAttributeThree(double attributeThree) {
        AttributeThree = attributeThree;
    }
}

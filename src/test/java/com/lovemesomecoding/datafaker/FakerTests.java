package com.lovemesomecoding.datafaker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.lovemesomecoding.datafaker.model.User;

import net.datafaker.Faker;

class FakerTests {

    private Faker faker = new Faker();

    @Test
    public void testUser() {

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();

        User user = User.builder().firstName(firstName).lastName(lastName).build();

        System.out.println(user.toString());
    }

    @Test
    public void testLorem() {

        String lorem = faker.lorem().fixedString(100);

        System.out.println("lorem fixedString: " + lorem);

        lorem = faker.lorem().paragraph(10);

        System.out.println("lorem paragraph: " + lorem);

        lorem = faker.lorem().maxLengthSentence(200);

        System.out.println("lorem maxLengthSentence: " + lorem);
    }
    
    @Test
    public void testAddress() {

        String address = faker.address().fullAddress();
        
        System.out.println("fullAddress: " + address);
        
        String latlon = faker.address().latLon(",");
        
        System.out.println("latlon: " + latlon);
        
        String utahZip = faker.address().zipCodeByState("UT");
        
        System.out.println("utahZip: " + utahZip);
        
    }

}

package ie.gmit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class PassengerTest {
    private Passenger myPass;

    @Test
    void testConstructorTitle(){
        myPass= new Passenger("Mr","Samim","123456789123",631111131,19);
        assertEquals("Mr",myPass.getTitle());
    }
    @Test
    void testConstructorInvalidTitle(){
        final String invalid = "Invalid title provided";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class,()-> new Passenger("Miss","Samim","123456789123",631111131,19));
                assertEquals(invalid, exceptionThrown.getMessage());
    }


    @Test
    void testConstructorName(){
        myPass= new Passenger("Mr","Samim","123456789123",631111131,19);
        assertEquals("Mr",myPass.getName());
    }
    @Test
    void testConstructorInvalidName(){
        final String invalid1 = "Invalid Name provided";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class,()-> new Passenger("Mr","Sa","123456789123",631111131,19));
        assertEquals(invalid1, exceptionThrown.getMessage());
    }

}
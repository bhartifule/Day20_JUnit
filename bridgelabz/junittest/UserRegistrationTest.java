package com.bridgelabz.junittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bridglabz.junt.UserRegistration;

public class UserRegistrationTest {
	static UserRegistration userRegistration;
    @BeforeAll
    public static void init(){
        userRegistration = new UserRegistration();
    }
    @Test
    public void firstNmeShouldBeTrue(){
        boolean value = userRegistration.checkFirstName("Bharti");
        Assertions.assertEquals(true , value);
    }
    @Test
    public void firstNmeShouldBeFalse(){
        boolean value = userRegistration.checkFirstName("Bharti");
        Assertions.assertEquals(false , value);
    }
    @Test
    public void lastNameTest2_ShouldReturnTrue() {
        boolean value = userRegistration.checkLastName("Fule");
        Assertions.assertEquals(true, value);
    }
    @Test
    public void lastNameTest2_ShouldReturnFalse() {
        boolean value = userRegistration.checkLastName("Fule");
        Assertions.assertEquals(false, value);
    }

    @Test
    public void emailTest3_ShouldReturnTrue() {
        boolean value = userRegistration.checkEmail("Bharatifule@gmail.com");
        Assertions.assertEquals(true, value);
    }
    @Test
    public void emailTest3_ShouldReturnFalse() {
        boolean value = userRegistration.checkEmail("bhartifule@gmail.com");
        Assertions.assertEquals(false, value);
    }

    @Test
    public void numberTest4_ShouldReturnTrue() {
        boolean value = userRegistration.phoneNumber("91 9956561212");
        Assertions.assertEquals(true, value);
    }
    @Test
    public void numberTest4_ShouldReturnFalse() {
        boolean value = userRegistration.phoneNumber("918958861212");
        Assertions.assertEquals(false, value);
    }

    @Test
    public void passWordTest5_ShouldReturnTrue() {
        boolean value = userRegistration.passWord("Bharti@123");
        Assertions.assertEquals(true ,value);
    }
    @Test
    public void passWordTest5_ShouldReturnFalse() {
        boolean value = userRegistration.passWord("Bharti@123");
        Assertions.assertEquals(false ,value);
    }



}

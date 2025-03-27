package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerCharacterTest {

    @Test
    void getX_shouldReturn0() {
        PlayerCharacter playerCharacter = new PlayerCharacter();
        int expected = 0;
        int actual = playerCharacter.getX();
        assertEquals(expected, actual);
    }

    @Test
    void getY_shouldReturn0() {
        PlayerCharacter playerCharacter = new PlayerCharacter();
        int expected = 0;
        int actual = playerCharacter.getY();
        assertEquals(expected, actual);
    }

}
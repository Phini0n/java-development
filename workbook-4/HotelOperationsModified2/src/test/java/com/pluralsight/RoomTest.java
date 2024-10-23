package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_beOccupiedAndDirty() {
        // Arrange
        Room rm = new Room(4, 5600);

        // Act
        rm.checkIn();

        // Assert
        boolean actualIsDirty = rm.isDirty();
        boolean actualIsOccupied = rm.isOccupied();
        assertTrue(actualIsDirty);
        assertTrue(actualIsOccupied);
    }


    public void checkIn_should_beUnoccupiedAndDirty() {
        // Arrange
        Room rm = new Room(4, 5600);

        // Act
        rm.checkIn();
        rm.checkIn();

        // Assert
        boolean actualIsDirty = rm.isDirty();
        boolean actualIsOccupied = rm.isOccupied();
        assertTrue(actualIsDirty);
        assertFalse(actualIsOccupied);
    }

    @Test
    public void checkout_should_beUnoccupiedAndDirty() {
        // Arrange
        Room rm = new Room(4, 5600);

        // Act
        rm.checkIn();
        rm.checkout();

        // Assert
        boolean actualIsDirty = rm.isDirty();
        boolean actualIsOccupied = rm.isOccupied();
        assertTrue(actualIsDirty);
        assertFalse(actualIsOccupied);
    }

    @Test
    public void cleanRoom_shouldBeUnoccupiedAndClean() {
        // Arrange
        Room rm = new Room(4, 5600);

        // Act
        rm.checkIn();
        rm.checkout();
        rm.cleanRoom();

        // Assert
        boolean actualIsDirty = rm.isDirty();
        boolean actualIsOccupied = rm.isOccupied();
        assertFalse(actualIsDirty);
        assertFalse(actualIsOccupied);
    }

    @Test
    public void cleanRoom_shouldBeOccupiedAndDirty() {
        // Arrange
        Room rm = new Room(4, 5600);

        // Act
        rm.checkIn();
        rm.cleanRoom();

        // Assert
        boolean actualIsDirty = rm.isDirty();
        boolean actualIsOccupied = rm.isOccupied();
        assertTrue(actualIsDirty);
        assertTrue(actualIsOccupied);
    }
}
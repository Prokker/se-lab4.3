package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }

    @Test
    void fire_Success_DecreasesTorpedoCount() { // fire működése
        // Arrange
        TorpedoStore store = new TorpedoStore(5, 0.0);

        // Act
        store.fire(2); //fire használata

        // Assert
        assertEquals(3, store.getTorpedoCount());
    }
    @Test
    void isEmpty_TRUE() { // isEmpty használata
        // Arrange
        TorpedoStore store = new TorpedoStore(0);

        // Act + Assert
        assertTrue(store.isEmpty());
    }

    @Test
    void isEmpty_FALSE() { // isEmpty használata
        // Arrange
        TorpedoStore store = new TorpedoStore(2);

        // Act + Assert
        assertFalse(store.isEmpty());
    }

    @Test
    void getTorpedoCount_CORRECTNumber() { // getTorpedoCount használata
        // Arrange
        TorpedoStore store = new TorpedoStore(7);

        // Act + Assert
        assertEquals(7, store.getTorpedoCount());
    }
}

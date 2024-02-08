package org.campus02.bilder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PictureTest
{
    Picture picture;

    @BeforeEach
    void setUp()
    {
        picture = new Picture(10,10);
    }

    @Test
    @DisplayName("Test für die Skalierung")
    void scale()
    {
        Assertions.assertEquals(100, picture.totalPixels());
    }
}
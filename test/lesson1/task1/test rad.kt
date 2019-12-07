package lesson1.task1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import kotlin.math.PI

class Test {
    @Test
    @Tag("Trivial")
    fun angleInRadian() {
        Assertions.assertEquals(0.63256, angleInRadian(36, 14, 35), 1e-5)
        Assertions.assertEquals(PI / 2.0, angleInRadian(90, 0, 0), 1e-5)
    }
}
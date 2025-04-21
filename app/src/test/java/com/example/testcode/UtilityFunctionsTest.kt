package com.example.testcode

import org.junit.Test
import org.junit.Assert.*
import java.time.LocalDate
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class UtilityFunctionsTest {

    // --- Tests for formatGreeting ---

    @Test
    fun formatGreeting_withRegularName_returnsCorrectFormat() {
        assertEquals("Hello, WORLD!", formatGreeting("world"))
    }

    @Test
    fun formatGreeting_withNullName_returnsGuest() {
        assertEquals("Hello, GUEST!", formatGreeting(null))
    }

    @Test
    fun formatGreeting_withEmptyName_returnsEmptyUppercase() {
        assertEquals("Hello, !", formatGreeting(""))
    }

    // --- Tests for calculateDueDate ---

    @Test
    fun calculateDueDate_withValidInputs_returnsCorrectDate() {
        val startDate = LocalDate.of(2024, 1, 1)
        val expectedDate = LocalDate.of(2024, 1, 6) // 10 days / 2 divisor = 5 days added
        assertEquals(expectedDate, calculateDueDate(startDate, 10, 2))
    }

    @Test(expected = ArithmeticException::class)
    fun calculateDueDate_withZeroDivisor_throwsException() {
        // This test expects an ArithmeticException due to division by zero
        calculateDueDate(LocalDate.of(2024, 1, 1), 10, 0)
    }

    // --- Tests for parseAndSum ---

    @Test
    fun parseAndSum_withValidNumbers_returnsCorrectSum() {
        assertEquals(6, parseAndSum(listOf("1", "2", "3")))
    }

    @Test
    fun parseAndSum_withEmptyList_returnsZero() {
        assertEquals(0, parseAndSum(emptyList()))
    }

    @Test(expected = NumberFormatException::class)
    fun parseAndSum_withInvalidNumber_throwsException() {
        // This test expects a NumberFormatException because "abc" cannot be parsed to Int
        parseAndSum(listOf("1", "abc", "3"))
    }
}

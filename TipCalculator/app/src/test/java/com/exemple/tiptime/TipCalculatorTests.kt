package com.exemple.tiptime

import com.example.tiptime.calculateTip
import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {

    @Test
    fun calculateTip_10PercentNoRoundUp() {
        val amount = 100.0
        val tipPercent = 10.0
        val roundUp = false

        val formatedTip = NumberFormat.getCurrencyInstance().format(10)
        val actualTip = calculateTip(amount, tipPercent, roundUp)

        assertEquals(actualTip, formatedTip)
    }
}
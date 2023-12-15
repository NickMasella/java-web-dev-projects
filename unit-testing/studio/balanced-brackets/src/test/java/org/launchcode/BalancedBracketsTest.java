package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void multipleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void balancedBracketsPlusStuffAtTheEndReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]a"));
    }
    @Test
    public void balancedBracketsPlusStuffAtBeginningReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("a[]"));
    }

    @Test
    public void balancedBracketsPlusStuffInTheMiddleReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[a]"));
    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyOpenBracketPlusStuffReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("aasdf[asdf"));
    }

    @Test
    public void onlyClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void wrongOrderBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void wrongOrderBracketsPlusStuffReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("asdfa]aasdf[asdf"));
    }

}
/*
package com.learning.algorithms.arrays;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountNumberParserTest {
    @Test
    public void testGetAccountNumbers_IndividualNumbers() throws IOException {

        File testFile = getTestFile("account-number-123456789.txt");
        List<String> accountNumbers = AccountNumberParser.getAccountNumber(testFile);
        assertEquals("Cannot parse account number", "123456789", accountNumbers.get(0));
    }

    @Test
    public void testGetAccountNumbers_NumberSet() throws IOException {

        File testFile = getTestFile("account-numbers.txt");
        List<String> accountNumbers = AccountNumberParser.getAccountNumber(testFile);
        assertEquals("Cannot parse all account numbers", 12, accountNumbers.size());
        assertEquals("Cannot parse account number", "000000000", accountNumbers.get(0));
        assertEquals("Cannot parse account number", "000000051", accountNumbers.get(accountNumbers.size() - 1));
    }

    private File getTestFile(String fileName) {

        URL testFileUrl = ClassLoader.getSystemResource(fileName);
        return new File(testFileUrl.getPath());
    }

    @Test
    public void testParseAccountNumber() {

        char [][] testAccountNumber = {
                {' ','_',' ', ' ','_',' ', ' ','_',' ', ' ','_',' ', ' ','_',' ', ' ','_',' ', ' ','_',' ', ' ', '_',' ', ' ','_',' '},
                {'|',' ','|', '|',' ','|', '|',' ','|', '|',' ','|', '|',' ','|', '|',' ','|', '|',' ','|', '|', ' ','|', '|',' ','|'},
                {'|','_','|', '|','_','|', '|','_','|', '|','_','|', '|','_','|', '|','_','|', '|','_','|', '|', '_','|', '|','_','|'}
        };

        String accountNumber = AccountNumberParser.parseAccountNumber(testAccountNumber);
        assertEquals("Cannot parse account number", "000000000", accountNumber);
    }

    @Test
    public void testParseDigit() {

        List<char[][]> testDigits = getTestDigits();

        assertEquals("Cannot parse digit", '0', AccountNumberParser.parseDigit(testDigits.get(0)));
        assertEquals("Cannot parse digit", '1', AccountNumberParser.parseDigit(testDigits.get(1)));
        assertEquals("Cannot parse digit", '2', AccountNumberParser.parseDigit(testDigits.get(2)));
        assertEquals("Cannot parse digit", '3', AccountNumberParser.parseDigit(testDigits.get(3)));
        assertEquals("Cannot parse digit", '4', AccountNumberParser.parseDigit(testDigits.get(4)));
        assertEquals("Cannot parse digit", '5', AccountNumberParser.parseDigit(testDigits.get(5)));
        assertEquals("Cannot parse digit", '6', AccountNumberParser.parseDigit(testDigits.get(6)));
        assertEquals("Cannot parse digit", '7', AccountNumberParser.parseDigit(testDigits.get(7)));
        assertEquals("Cannot parse digit", '8', AccountNumberParser.parseDigit(testDigits.get(8)));
        assertEquals("Cannot parse digit", '9', AccountNumberParser.parseDigit(testDigits.get(9)));
    }

    private List<char[][]> getTestDigits() {

        char[][] testDigit0 = new char[][] {
                {' ','_',' '},
                {'|',' ','|'},
                {'|','_','|'},
        };

        char[][] testDigit1 = new char[][] {
                {' ',' ',' '},
                {' ',' ','|'},
                {' ',' ','|'},
        };

        char[][] testDigit2 = new char[][] {
                {' ','_',' '},
                {' ','_','|'},
                {'|','_',' '},
        };

        char[][] testDigit3 = new char[][] {
                {' ','_',' '},
                {' ','_','|'},
                {' ','_','|'},
        };

        char[][] testDigit4 = new char[][] {
                {' ',' ',' '},
                {'|','_','|'},
                {' ',' ','|'},
        };

        char[][] testDigit5 = new char[][] {
                {' ','_',' '},
                {'|','_',' '},
                {' ','_','|'},
        };

        char[][] testDigit6 = new char[][] {
                {' ','_',' '},
                {'|','_',' '},
                {'|','_','|'},
        };

        char[][] testDigit7 = new char[][] {
                {' ','_',' '},
                {' ',' ','|'},
                {' ',' ','|'},
        };

        char[][] testDigit8 = new char[][] {
                {' ','_',' '},
                {'|','_','|'},
                {'|','_','|'},
        };

        char[][] testDigit9 = new char[][] {
                {' ','_',' '},
                {'|','_','|'},
                {' ','_','|'},
        };

        List<char[][]> testDigits = new ArrayList<>();
        testDigits.add(testDigit0);
        testDigits.add(testDigit1);
        testDigits.add(testDigit2);
        testDigits.add(testDigit3);
        testDigits.add(testDigit4);
        testDigits.add(testDigit5);
        testDigits.add(testDigit6);
        testDigits.add(testDigit7);
        testDigits.add(testDigit8);
        testDigits.add(testDigit9);

        return testDigits;
    }

    @Test
    public void testParseDigit_failure() {

        char[][] testDigit = new char[][] {
                {' ','_',' '},
                {'|','?','|'},
                {'|','_','|'},
        };

        AccountNumberParser.parseDigit(testDigit);


    }

}*/

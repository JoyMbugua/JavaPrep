package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {
    @Test
    public void cipherText_instiatesCorrectly(){
        Cipher newWord = new Cipher("abc", 1);
        assertEquals(true, newWord instanceof Cipher);
    }
}
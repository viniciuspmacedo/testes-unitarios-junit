package com.example;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    @Test
    void checkTrueAge() {
        Pessoa pessoa = new Pessoa("Vinicius", LocalDate.of(1983, 11, 22));
        Assertions.assertEquals(40, pessoa.getAge());
    }

    @Test
    void checkIsOverEighteen(){
        Pessoa pessoa = new Pessoa("Vinicius", LocalDate.of(1983, 11, 22));
        Assertions.assertTrue(pessoa.isOverEighteen());
    }
    @Test
    void checkIsUnderEightenn(){
        Pessoa pessoa = new Pessoa("Vinicius", LocalDate.of(2023, 11, 22));
        Assertions.assertFalse(pessoa.isOverEighteen());
    }
}

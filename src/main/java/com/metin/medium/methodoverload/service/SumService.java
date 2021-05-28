package com.metin.medium.methodoverload.service;

import org.springframework.stereotype.Service;

@Service
public class SumService {

    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    public int sum(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }
}

package com.example.expense.application;

import com.example.expenses.readers.Reader;

public class ExpensesApplication {

    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.array();
//        HttpReader httpReader = new HttpReader();
//        httpReader.hello();
    }

}

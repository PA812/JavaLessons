package com.company.Lesson3.exaptions;

import java.io.Closeable;
import java.io.IOException;

public class TestCloseApp implements Closeable {


    @Override
    public void close() throws IOException {
        System.out.println("close");
    }
}

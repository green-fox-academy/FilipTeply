package com.greenfoxacademy.filip3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PrinterApp implements CommandLineRunner {


    Printer printer;
    MyColor color;

    @Autowired
    public PrinterApp(Printer printer, MyColor color) {
        this.printer = printer;
        this.color = color;
    }

    public static void main(String[] args) {
        SpringApplication.run(PrinterApp.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        printer.log("hello");
        color.printColor();
    }
}



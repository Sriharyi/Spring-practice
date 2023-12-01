package com.deviro.maven.services.impl;

import com.deviro.maven.services.BluePrinter;
import com.deviro.maven.services.GreenPrinter;
import com.deviro.maven.services.RedPrinter;

public class FactoryClass {
  public ColourPrinterImpl build() {
    RedPrinter redPrinter = new TamilRedPrinter();
    BluePrinter bluePrinter = new TamilBluePrinter();
    GreenPrinter greenPrinter = new TamilGreenPrinter();
    return new ColourPrinterImpl(redPrinter, bluePrinter, greenPrinter);
  }
}

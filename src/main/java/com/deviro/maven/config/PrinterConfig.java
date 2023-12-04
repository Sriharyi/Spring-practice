package com.deviro.maven.config;

import com.deviro.maven.services.*;
import com.deviro.maven.services.impl.ColourPrinterImpl;
import com.deviro.maven.services.impl.TamilBluePrinter;
import com.deviro.maven.services.impl.TamilGreenPrinter;
import com.deviro.maven.services.impl.TamilRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

  @Bean
  public RedPrinter redPrinter() {
    return new TamilRedPrinter();
  }

  @Bean
  public GreenPrinter greenPrinter() {
    return new TamilGreenPrinter();
  }

  @Bean
  public BluePrinter bluePrinter() {
    return new TamilBluePrinter();
  }

  @Bean
  public ColourPrinter colourPrinter() {
    return new ColourPrinterImpl(redPrinter(), bluePrinter(), greenPrinter());
  }
}

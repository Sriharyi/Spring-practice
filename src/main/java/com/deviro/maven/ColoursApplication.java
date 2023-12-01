package com.deviro.maven;

import com.deviro.maven.services.ColourPrinter;
import com.deviro.maven.services.impl.FactoryClass;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class ColoursApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ColoursApplication.class, args);
  }

  @Override
  public void run(final String... args) {
    final ColourPrinter colourPrinter = new FactoryClass().build();
    log.info(colourPrinter.print());
  }
}

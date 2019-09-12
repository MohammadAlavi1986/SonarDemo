package me.smash.decorato;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;

public class DecoratorDemo {

  private static final String FILE_NAME = "/Users/mohammad/Downloads/codegraph/codegraph/jenkins/"
      + "Jenkinsfile.CI";

  public static void main(String[] args) throws IOException {
    try (BufferedReader reader = new BufferedReader(
        new InputStreamReader(new LowerCaseInputStream(Files.newInputStream(Paths.get(FILE_NAME))),
            StandardCharsets.UTF_8))) {
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    }
  }

}

package com.clearscore.util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FileUtils {


  public static List<String> readLines(String filename)  {
    try {
      URL resource = ClassLoader.getSystemResource(filename);
      if (resource == null) {
        System.err.println("Unable to find file");
        return Collections.emptyList();
      }

      Path path = Paths.get(resource.toURI());
      return Files.readAllLines(path);

    } catch (IOException | URISyntaxException e) {
      System.err.println("Problem reading file " + e.getMessage());
      return Collections.emptyList();
    }
  }
}

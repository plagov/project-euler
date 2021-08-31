package net.projecteuler.util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class FileUtil {

  public static String readInputFile(String resourceFile) {
    try {
      Path path = Paths.get(
        Objects.requireNonNull(
          FileUtil.class.getClassLoader().getResource(resourceFile),
          String.format("Resource %s could not be found", resourceFile)
        ).toURI()
      );
      return Files.readString(path, StandardCharsets.UTF_8);
    } catch (URISyntaxException | IOException exception) {
      throw new IllegalArgumentException("Invalid location: " + resourceFile, exception);
    }
  }
}

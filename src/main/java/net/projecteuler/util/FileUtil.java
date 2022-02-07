package net.projecteuler.util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
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

  public static List<List<Integer>> parseFileTo2dListOfIntegers(String resourceFile) {
    return Arrays.stream(FileUtil.readInputFile(resourceFile).split("\n"))
      .map(line -> Arrays.stream(line.split(" ")).map(Integer::valueOf).toList()).toList();
  }
}

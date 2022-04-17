package ru.yandex.practicum;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class QA2 {

//    C:\Users\Victor\IdeaProjects\praktikum\src\ru\yandex\practicum\QA2.java
//    src\ru\yandex\practicum\QA2.java

    private static final String QA2_ABSOLUTE_PATH =
            "C:\\Users\\Victor\\IdeaProjects\\praktikum\\src\\ru\\yandex\\practicum\\QA2.java";

    private static final String QA2_RELATIVE_PATH =
            "src\\ru\\yandex\\practicum\\QA2.java";


    public static void main(String[] args) throws IOException {

//        Save reports to lists
        ArrayList<MonthReport> monthReports = new ArrayList<>();

//        Read file to oneline
        String content = readFileContentsOrNull(QA2_RELATIVE_PATH);
//        System.out.println(content);

//        Read file to List
        List<String> lines = readAllLines(QA2_RELATIVE_PATH);
/*        for (String line : lines) {
            System.out.println(line);
        }*/

// Read all files in directory
        List<Path> filePaths = Files.list(Paths.get("resources")).toList();
        for (Path path : filePaths) {
            String file = readFileContentsOrNull(path);
//            System.out.println(file);
        }

// Read file in loop
        for (int i = 1; i <= 3; i++) {
            List<String> fileLines = readAllLines(String.format(
                    "resources\\text%d.txt", i));
//            System.out.println(fileLines);
        }



        String csvExample = "Victor,Bodrov,1994\r\nIvan,Ivanov,2000";
        System.out.println("CSV:");
        System.out.println(csvExample);
        System.out.println();

        String[] csvLines = csvExample.split(System.lineSeparator());
        System.out.println("Array of lines: " + Arrays.toString(csvLines));

        String csvLine = csvLines[1];
        System.out.println("First line: " + csvLine);

        String values[] = csvLine.split(",");
        System.out.println("First line values: " + Arrays.toString(values));

        String firstName = values[0];
        System.out.println("First Name: " + firstName);

        String lastName = values[1];
        System.out.println("Last Name: " + lastName);

        int yearOfBirth = Integer.parseInt(values[2]);
        System.out.println("Year Of Birth: " + yearOfBirth);

        String s = "Hello";
        SoftReference<String> sr = new SoftReference<>("Hello2");
        WeakReference<String> wr = new WeakReference<>("Hello2");
        WeakHashMap<Integer, String> weakMap = new WeakHashMap<>();
    }

    private static String readFileContentsOrNull(String path) {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл с месячным отчётом. Возможно, файл не находится в нужной директории.");
            return null;
        }
    }

    private static String readFileContentsOrNull(Path path) {
        try {
            return Files.readString(path);
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл с месячным отчётом. Возможно, файл не находится в нужной директории.");
            return null;
        }
    }

    private static List<String> readAllLines(String path) {
        try {
            return Files.readAllLines(Path.of(path));
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл с месячным отчётом. Возможно, файл не находится в нужной директории.");
            return Collections.emptyList();
        }
    }
}

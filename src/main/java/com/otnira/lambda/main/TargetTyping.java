package com.otnira.lambda.main;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class TargetTyping {

    public static void main(String[] args) throws IOException {
        String value = System.getProperty("user.dir");

        File f = new File(value);

        // without target typing
        System.out
                .println("Without target typing example, to find file that ends with xml");
        for (File resFile : f.listFiles((File sf) -> sf.getName().endsWith(
                ".xml"))) {
            System.out.printf("%s%n", resFile.getAbsolutePath());
        }

        // simplified expression with target typing
        System.out
                .println("With target typing example, to find file that ends with xml");
        for (File resFile : f.listFiles(sf -> sf.getName().endsWith(".xml"))) {
            System.out.printf("%s%n", resFile.getAbsolutePath());
        }

        // file filter, the instance is inferred as file
        System.out
                .println("With file filter, to find file/directory that ends with \"src\"");
        FileFilter src = theInstance -> theInstance.getName().endsWith("src");

        for (File resFile : f.listFiles(src)) {
            System.out.printf("%s%n", resFile.getAbsolutePath());
        }

        // directory filter, the instance is inferred as Path
        System.out
                .println("With path filter, to find directory that ends with \"src\"");
        DirectoryStream.Filter<Path> anotherFilter = theInstance -> theInstance
                .endsWith("src");
        Files.newDirectoryStream(f.toPath(), anotherFilter).forEach(
                p -> System.out.println(p.toString()));
    }
}

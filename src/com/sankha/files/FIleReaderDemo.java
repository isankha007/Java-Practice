package com.sankha.files;

import com.mysql.cj.CharsetSettings;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

import static java.nio.file.Files.*;

public class FIleReaderDemo {
    public static void main(String[] args) throws IOException {
        String path="/hcl.txt";

        // Files.readLines(new File(path), Charsets.UTF_8);

       /* File f = new File("src/com/sankha/files/hcl.txt");
        try {
            FileInputStream inputStream = new FileInputStream(f);
            Scanner sc = new Scanner(inputStream, "UTF-8");
            // do some things ...
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
                //  do some more things ...
            }
            // do some final things
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/
//        Path path= Path.of("/hcl.txt");
//        try (
//                InputStream inputStream = new FileInputStream(source);
//                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
//
//                OutputStream outputStream = new FileOutputStream(target);
//        ) {
//            byte[] buffer = new byte[4 * 1024];
//            int read;
//            while ((read = bufferedInputStream.read(buffer, 0, buffer.length)) != -1) {
//                outputStream.write(buffer, 0, read);
//            }
//        }

    }
}

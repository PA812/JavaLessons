package com.company.Lesson7;

import java.io.*;
import java.net.URL;
import java.util.Arrays;

public class ApplicationIO {
    public static void main(String[] args) {
        //inStream();
        //outStream();
        //byteInput();
        //streamFromURL();
        //buffInStream();
        characterIO();//для работы со сроками

    }

    private static void characterIO() {
        try (Reader reader = new FileReader("file.txt");
        BufferedReader bufferedReader = new BufferedReader(reader, 1024);
        Writer writer = new BufferedWriter(new FileWriter("writer.txt"))) {
//            char[]buff = new char[1024];
//            int read = reader.read(buff);
//           String str = new String(buff, 0, read);
//            System.out.println("str = " + str);
            String s = bufferedReader.readLine();
            System.out.println("s = " + s);
            writer.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void buffInStream() {
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("file.txt"))) {
            byte[] buff = new byte[6];
            in.read(buff);
            System.out.println("new String(buff) = " + new String(buff));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void streamFromURL() {
        try (InputStream in = new URL("https://itstep.dp.ua/").openStream();
             OutputStream out = new FileOutputStream("index.html")) {
            byte[] buff = new byte[1024];
            int count;
            int iter = 0;

            System.out.println("Avail = " + in.available());
            while ((count = in.read(buff)) != -1) {
                out.write(buff, 0, count);
                iter++;
            }
            System.out.println("iter = " + iter);
            // System.out.println("buff = " + Arrays.toString(buff));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void byteInput() {
        byte[] b = new byte[]{11, 22, 33, 44};
        try {
            InputStream in = new ByteArrayInputStream(b);
            int read;
            while ((read = in.read()) != -1) {
                System.out.println("read = " + read);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private static void outStream() {
        try (OutputStream out = new FileOutputStream("input.txt")) {
            String text = "Hello from method;";
            //File file = new File("");
            out.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inStream() {
//        InputStream in = null;
//        try {
//            in = new FileInputStream("myinput.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            if (in != null) {
//                try {
//                    in.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

        try (InputStream in = new FileInputStream("myinput.txt")) {
            byte[] buff = new byte[in.available()];
            int count;
            //in.skip(6);
            System.out.println("in.available() = " + in.available());
            int iter = 0;

//            if (in.available() > 0) {
//                int read = in.read(buff, 0, buff.length);
//                String text = new String(buff, 0, read, "utf8");
//                System.out.println("text = " + text);
//            }
            while ((count = in.read(buff)) != -1) {
                String text = new String(buff, 0, count, "utf8");
                System.out.println("text = " + text);
                iter++;
            }
            System.out.println("iter = " + iter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

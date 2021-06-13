package fileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        boolean run = true;
        int command = 0;
        while (run) {
            System.out.println("please input 1 for findLines");
            System.out.println("please input 2 for printSizeOfPackage");
            System.out.println("please input 3 for createFileWithContent");
            try {

                command = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                command = 0;
            }
            switch (command) {
                case 1:
                    System.out.println("please input path");
                    String path = scanner.nextLine();
                    System.out.println("please input word");
                    String word = scanner.nextLine();
                    findLines(path, word);
                    break;
                case 2:
                    System.out.println("please input path");
                    String packagePath = scanner.nextLine();
                    printSizeOfPackage(packagePath);
                    break;
                case 3:
                    System.out.println("please input path");
                    String newPath = scanner.nextLine();
                    System.out.println("please input file name");
                    String fileName = scanner.nextLine();
                    System.out.println("please input content");
                    String content = scanner.nextLine();
                    createFileWithContent(newPath, fileName, content);
                    break;
                default:
                    System.out.println("wrong command");

            }
        }
    }

    private static void createFileWithContent(String newPath, String fileName, String content) {
        String path = newPath + File.separator + fileName + ".txt";

        File file = new File(path);

        try {
            file.createNewFile();

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            bufferedWriter.write(content);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void printSizeOfPackage(String packagePath) {
        double sum = 0;

        File file = new File(packagePath);
        if (file.exists()) {
            File[] list = file.listFiles();
            for (File f : list) {
                sum += f.length();
            }
            System.out.println((sum / 1024 / 1024) + " mb");
        } else {
            System.out.println("input right path");
        }

    }

    private static void findLines(String txtPath, String keyword) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(txtPath));

            String line = null;

            while (bufferedReader.readLine() != null) {
                line = bufferedReader.readLine();
                if (line.contains(keyword)) {

                    System.out.println(line);
                }
            }
            if (line == null) {
                System.out.println("no results found");
            }
        } catch (FileNotFoundException e) {
            System.err.println("Не удается найти указанный файл");
        }
    }
}

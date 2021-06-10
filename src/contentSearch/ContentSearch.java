package contentSearch;

import java.io.*;
import java.util.Scanner;

public class ContentSearch {
    public static void main(String[] args) {
        searchByWord();
    }

    private static void searchByWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input path");
        String path = scanner.nextLine();
        System.out.println("please input word");
        String word = scanner.nextLine();
        File file = new File(path);
        String[] files = file.list();
        String line;

        for (int i = 0; i < files.length; i++) {
            String newPath = "C:\\Users\\User\\IdeaProjects\\java2021\\src\\fileSearch\\files\\filesFolder" + "\\" + files[i];

            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(newPath));
                try {
                    while ((line = bufferedReader.readLine()) != null) {
                        if (line.contains(word)) {
                            System.out.println(files[i]);
                        } else if (!line.contains(word) && i != files.length - 1) {
                            continue;
                        } else {
                            System.out.println("chka");
                            searchByWord();
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}

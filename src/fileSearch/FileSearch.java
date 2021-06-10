package fileSearch;

import java.io.File;
import java.util.Scanner;

public class FileSearch {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(searchFile());

    }
    private static boolean searchFile(){
        System.out.println("Please input path");
        String path=scanner.nextLine();
        System.out.println("Please input file name");
        String name=scanner.nextLine();
        File file=new File(path);
        String[] files=file.list();

        for (String s : files) {
            if (s.equalsIgnoreCase(name)){
                return true;
            }
        }
       return false;
    }
}

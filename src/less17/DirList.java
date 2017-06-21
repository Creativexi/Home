package less17;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        File f1 = new File("src");
        printInfo(f1, "");
    }
    private static void printInfo(File file, String str){
        if( file.isDirectory()){
            System.out.println(str + file.getName());
            for(File f : file.listFiles()){
                printInfo(f, str + " ");
            }
        }
        else{
            System.out.println(str + file.getName());
        }
    }
}

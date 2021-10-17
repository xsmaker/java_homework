package X1;

import javax.naming.directory.SearchResult;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextSearchFile {
    public static List<File> searchFile(File folder, final String keyword) {
        List<File> result = new ArrayList<File>();
        if (folder.isFile())
            result.add(folder);
        File[] subFolders = folder.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                if (file.isDirectory()) {
                    return true;
                }
                if (file.getName().toLowerCase().contains(keyword)) {
                    return true;
                }
                return false;
            }
        });
        if (subFolders != null) {
            for (File file : subFolders) {
                if (file.isFile()) {
                    result.add(file);
                } else {
                    result.addAll(searchFile(file, keyword));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String pathName;
        String keyWord;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入pathname");
        pathName = scanner.nextLine();
        System.out.println("请输入keyword");
        keyWord = scanner.nextLine();
        List<File> files = searchFile(new File(pathName), keyWord);
        System.out.println("共找到：" +files.size() +"个文件");
        for (File file : files){
            System.out.println(file.getAbsolutePath());
        }
    }
}
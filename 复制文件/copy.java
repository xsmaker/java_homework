package X2;

import java.io.*;
import java.util.Objects;

public class copy {
    public static void copy(File source, File targetDir){
        if (source.isFile()){
            copyFile(source, targetDir);
        }else {
            targetDir = new File(targetDir, source.getName());
            if (!targetDir.exists()) {
                targetDir.mkdirs();
            }
            File[] subFiles = source.listFiles();
            if (subFiles != null){
                for (int i = 0; i < subFiles.length; i ++ ){
                    copy(subFiles[i], targetDir);
                }
            }
        }
    }
    private static void copyFile(File sourceFile, File targetDir){
        if (!targetDir.exists()){
            targetDir.mkdirs();
        }
        File target = new File(targetDir, sourceFile.getName());
        InputStream is = null;
        OutputStream os = null;
        try{
            is = new FileInputStream(sourceFile);
            os = new FileOutputStream(target);
            byte[] b = new byte[1024];
            int len = 0;
            System.out.println("开始拷贝");
            while ((len = is.read(b)) != -1){
                os.write(b, 0, len);
            }
            System.out.println("拷贝完成");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if (Objects.nonNull(os)){
                    os.close();
                }
                if (Objects.nonNull(is)){
                    is.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        File sourFile = new File("F:\\1");
        File tarFileDir = new File("E:\\");
        copy(sourFile, tarFileDir);
    }
}

package lab13;


import java.io.File;
import java.util.ArrayList;

public class FileScanner {

    ArrayList<String> fileNames;

    public FileScanner() {
        this.fileNames = new ArrayList<>();
    }

    void scanDirectory(File folder) {
        File[] folderEntries = folder.listFiles();
        for (File entry : folderEntries) {
            fileNames.add(entry.getName());
        }
    }


}
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FilesTest {
    public static void main(String[] args) {
        String folder = "./data";
        String file = "data.txt";
        List<String> list = Arrays.asList("Spam", "Ham", "Blam", "Clam");

        Path folderDir = Paths.get(folder);
        Path fileDir = Paths.get(folder, file);

        try {
//            if (Files.notExists(folderDir)) {
//                Files.createDirectories(folderDir);
//            }
            if (Files.exists(fileDir)) {
//                Files.createFile(fileDir);
                Files.write(fileDir, list);
                list = Files.readAllLines(fileDir);
                for (String line : list) {
                    System.out.println(line);
                }
                list.add("Span");
                list.add("Can");
                list.add("Man");
                Files.write(fileDir, list, StandardOpenOption.APPEND);
                list = Files.readAllLines(fileDir);
                for (String line : list) {
                    System.out.println(line);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Done");
    }
}

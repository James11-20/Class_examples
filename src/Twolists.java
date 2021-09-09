import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Twolists {
    public static void main(String[] args) throws IOException {
        var Names = new ArrayList<String>();
        var Numbers = new ArrayList<Integer>();
        var fileName = "namesGDP";
        var filepath = Paths.get(fileName);
        var allLines = Files.readAllLines(filepath);
        for(var line: allLines){
            var splitLine = line.split(",");
            Names.add(splitLine[0]);
            Numbers.add(Integer.parseInt(splitLine[1]));

        }
        for(int i = 0;i < Names.size(); i++){
            System.out.println("Student "+Names.get(i)+ "has GDP "+ Numbers.get(i));
        }

    }
}
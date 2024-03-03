package bg.tu_varna.sit.b4.f22621694.coursework;
import java.util.*;
import java.io.*;

public class File {
    private File file;

    public void open() {
        try {
            FileWriter output = new FileWriter("asd.txt");

        } catch(Exception e){
            e.getStackTrace();
        }
    }

    /*
    public void save(){};
    public void saveAS(){};
    public void close(){};
     */
}

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
class filehandling
{
    public static void main(String args[]) throws IOException
    {
        int ch;
        FileReader fr = new FileReader("D:\\VS Code\\JAVA\\Files\\sample.txt");
        FileWriter fw = new FileWriter("D:\\VS Code\\JAVA\\Files\\new sample.txt");
        while((ch = fr.read()) != -1)
        {
            System.out.print((char)ch);
            fw.write((char)ch);
        }
        fr.close();
        fw.close();
    }
}

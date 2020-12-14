import jdk.swing.interop.SwingInterOpUtils;

//Assembler By fayssal hamdi , wuhan university of technolgy

import java.io.*;

public class RunAssembler
{
    public static void main(String[] args)
    {

        String FileToAssemble = args[0] ; // specify the directory by example: "C:\\Users\\lenovo\\Desktop\\nand2tetris\\projects\\04\\Mult.asm";

        try {
            Assembler assembler = new Assembler(FileToAssemble);
            assembler.firstAssembler();
            assembler.secondAssembler();
            assembler.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("file \'" + FileToAssemble + "\' not found");
        } catch (IOException ex)
        {
            System.out.println("error has occured :(");
        }
    }
}
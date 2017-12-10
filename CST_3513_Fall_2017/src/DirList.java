/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drcho_000
 */
import java.util.regex.*;
import java.io.*;
import java.util.*;

public class DirList {
    
    public static void main(String[] args)
    {
        File path = new File(".");
        String[] list;
        
        if(args.length == 0)
            list = path.list();
        else
            list = path.list(new DirFilter(args[0]));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list)
            System.out.println(dirItem);
    }
}

class DirFilter implements FilenameFilter 
{
    private Pattern pattern;
    public DirFilter(String regex)
    {
        pattern = Pattern.compile(regex);
    }
    
    public boolean accept(File dir, String name)
    {
        return pattern.matcher(name).matches();
    }
}


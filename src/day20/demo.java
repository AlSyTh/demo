package day20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;

public class demo {
	public static void main(String[] args) throws IOException {
	File f=new File("resourse\\Ê¥Ðæ.txt");
	System.out.println(f.exists());
	Reader read=new FileReader(f);
	BufferedReader br=new BufferedReader(read);
	String line="";
	HashMap<Integer,String> hm=new HashMap<>();
	HashMap<Integer,String> list =new HashMap<>();
	int count=0;
	while(null!=(line=br.readLine()))
		if(line.contains("ÕýÎÄ")){
			hm.put( count,line);
			count++;
		}else {
			if(list.get(count)==null)
			{
				list.put(count,line);
				continue;
			}
			list.put(count, list.get(count)+line+"\n");
		}
	System.out.print(hm.get(100));
	System.out.print(list.get(100));
	}
	
}

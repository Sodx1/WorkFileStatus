package lab8;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class das {

	public static void main(String[] args) throws IOException {
		
		int[] array = null;
		
		
	    try (BufferedReader in = new BufferedReader(new FileReader("f.txt")))
	    {
	        array = in.lines().mapToInt(Integer::parseInt).toArray();
	    }
	    catch (IOException | NumberFormatException e)
	    {e.printStackTrace();}
	    int[] bos = new int [array.length];
	    int dos = array.length;
	    ///
	    int i = 0;
	    int a=0;
	    int b =0;
	    boolean fl = false;
	    for(int j=0; j<array.length; j++) {
	    	if(array[j] == 0) {
	    		fl = true;
	    		System.out.println("Не могу!Там 0.");
	    		System.exit(0);
	    		break;
	    	}
	    
	    	
	    	if(array[j]<0) {
				bos[dos-1] = array[j];
				dos--;
				a++;
	    	}
	    	if(array[j]>0) {
				bos[i] = array[j];
				i++;
				b++;
				
	    	}
	   
	    }
	 	if(a != b) {
    		System.out.println("Не могу! Не поровну.");
    		System.exit(0);
    	}
	    if (!fl) {   
		 try(FileWriter file = new FileWriter("g.txt")){
		    if (bos != null)
		    {
		        for (i = 0; i < bos.length; i++) 
		        {
		        	String s = Integer.toString(bos[i]);
						
		            file.write(s);
		            file.write(System.lineSeparator());
		        }
		    }
		    System.out.print("Выполнил!");
		  } catch (IOException | NumberFormatException f) {f.printStackTrace();}
	    }
	}
}

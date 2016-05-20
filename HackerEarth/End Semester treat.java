// End Semester treat!

// https://www.hackerearth.com/problem/algorithm/end-semester-treat-1/

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
        int noOfResources = Integer.parseInt(br.readLine());
        String [] resources = br.readLine().split(" ");
        int noOfTasks = Integer.parseInt(br.readLine());
        String[][] resourcesOccupied = new String[noOfTasks][noOfResources];
        String[][] resourcesRequired = new String[noOfTasks][noOfResources];
        for(int h=0;h<noOfTasks;h++){
        	resourcesOccupied[h] = br.readLine().split(" ");
        }
        for(int h=0;h<noOfTasks;h++){
        	resourcesRequired[h] = br.readLine().split(" ");
        }
        int count=0;
        while(count<noOfTasks){
        for( int z=0;z<noOfTasks;z++){
            
            int j;
            //checking if 1st process sattisfy the resource req
            if(resourcesRequired[z]!=null){
            
            for(j =0;j<resourcesRequired[z].length;j++){
                   if(Long.parseLong(resourcesRequired[z][j]) - Long.parseLong(resourcesOccupied[z][j]) > Long.parseLong(resources[j])){               
                       break;
                   }
            }
                  
                    if(j==resourcesRequired[z].length){
                      
                   for(int k=0;k<resources.length;k++){
                      long value = Long.parseLong(resources[k]) + Long.parseLong(resourcesOccupied[z][k]);
                     
                       resources[k] = String.valueOf(value);
                   }
                   resourcesRequired[z]=null;
                }
        } 
            }
        count++;
        }
        boolean result=true;
        for(int l=0;l<noOfTasks;l++){
            
            if(resourcesRequired[l]!=null){
                result=false;
                break;
            }
        }
        if(result){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        }
        
 
       
    }
}

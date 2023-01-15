PROBLEM - TO FIND ALL THE POSSIBLE PATH TO REACH TO THE DESTINATION FROM THE SOURCE IN JAVA LANGUAGE  
SOLUTION 
CODE 
import java.util.Scanner;
import java.util.*;
public class ShortPath {

  public static void main(String[] args) throws Exception {

    try (Scanner scn = new Scanner(System.in)) {
        System.out.println("Enter row :");
        int n = scn.nextInt();
        System.out.println("Enter Column :");
        int m = scn.nextInt();

        ArrayList< String> paths = getMazePaths(1, 1, n, m);

        System.out.println(paths);
    }
  }

  // sr - source row
  // sc - source column
  // dr - destination row
  // dc - destination column
  public static ArrayList< String> getMazePaths(int sr, int sc, int dr, int dc) {

    if (sr == dr && sc == dc)
    {
      ArrayList< String> bres = new ArrayList< >();
      bres.add("");
      return bres;
    }
    else if (sr > dr || sc > dc)
    {
      ArrayList< String> bres = new ArrayList< >();
      return bres;
    }

    ArrayList< String> paths = new ArrayList< >();
    for (int hms = 1; hms <= dc - sc; hms++)
    {
        ArrayList< String> hpaths = getMazePaths(sr, sc + hms, dr, dc);

        for (String hpath : hpaths)
        {
          paths.add("h" + hms + hpath);
        }
      }
  
      for (int vms = 1; vms <= dr - sr; vms++)
      {
        ArrayList< String> vpaths = getMazePaths(sr + vms, sc, dr, dc);
  
        for (String vpath : vpaths) {
          paths.add("v" + vms + vpath);
        }
      }
  
      for (int dms = 1; dms <= dr - sr && dms <= dc - sc; dms++)
      {
        ArrayList< String> dpaths = getMazePaths(sr + dms, sc + dms, dr, dc);
  
        for (String dpath : dpaths)    {
          paths.add("d" + dms + dpath);
        }
      }
      return paths;
   }
  }

OUTPUT 
Enter row :
3
Enter Column :
2
[h1v1v1, h1v2, v1h1v1, v1v1h1, v1d1, v2h1, d1v1]

PROBLEM :To implement dijkstra algorithm in java 
SOLUTION 
CODE 
import java.util.*;  
import java.io.*;  
import java.lang.*;  
  
public class DijkstraExample   
{  
static final int totalVertex = 9;  
int minimumDistance(int distance[], Boolean spSet[])  
{  
int m = Integer.MAX_VALUE, m_index = -1;  
  
for (int vx = 0; vx < totalVertex; vx++)  
{  
if (spSet[vx] == false && distance[vx] <= m)   
{  
m = distance[vx];  
m_index = vx;  
}  
}  
return m_index;  
  
}  
void printSolution(int distance[], int n)  
{  
System.out.println("The shortest Distance from source 0th node to all other nodes are: ");  
for (int j = 0; j < n; j++)  
System.out.println("To " + j + " the shortest distance is: " + distance[j]);  
}  
void dijkstra(int graph[][], int s)  
{  
int distance[] = new int[totalVertex];  
Boolean spSet[] = new Boolean[totalVertex];  
for (int j = 0; j < totalVertex; j++)   
{  
distance[j] = Integer.MAX_VALUE;  
spSet[j] = false;  
}  
distance[s] = 0;  
for (int cnt = 0; cnt < totalVertex - 1; cnt++)   
{  
int ux = minimumDistance(distance, spSet);  
spSet[ux] = true;  
for (int vx = 0; vx < totalVertex; vx++)  
if (!spSet[vx] && graph[ux][vx] != -1 && distance[ux] != Integer.MAX_VALUE && distance[ux] + graph[ux][vx] < distance[vx])  
{  
distance[vx] = distance[ux] + graph[ux][vx];  
}  
}  
printSolution(distance, totalVertex);  
}  
public static void main(String argvs[])  
{  
int grph[][] = new int[][] { { -1, 3, -1, -1, -1, -1, -1, 7, -1 },  
    { 3, -1, 7, -1, -1, -1, -1, 10, 4 },  
    { -1, 7, -1, 6, -1, 2, -1, -1, 1 },  
    { -1, -1, 6, -1, 8, 13, -1, -1, 3 },  
    { -1, -1, -1, 8, -1, 9, -1, -1, -1 },  
    { -1, -1, 2, 13, 9, -1, 4, -1, 5 },  
    { -1, -1, -1, -1, -1, 4, -1, 2, 5 },  
    { 7, 10, -1, -1, -1, -1, 2, -1, 6 },  
    { -1, 4, 1, 3, -1, 5, 5, 6, -1 } };  
      
DijkstraExample obj = new DijkstraExample();  
obj.dijkstra(grph, 0);  
}  
}  

OUTPUT

The shortest Distance from source 0th node to all other nodes are: 
To 0 the shortest distance is: 0
To 1 the shortest distance is: 3
To 2 the shortest distance is: 8
To 3 the shortest distance is: 10
To 4 the shortest distance is: 18
To 5 the shortest distance is: 10
To 6 the shortest distance is: 9
To 7 the shortest distance is: 7
To 8 the shortest distance 

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdbool.h>

int main() {
	
	int arrT[10], netBT[10], finT[10], turnAT[10], waitT[10];
	int i = 0, n;
	float avgWT = 0, avgTAT = 0;
	
	printf("Enter the no. of Process\n");
	scanf("%d", &n);
	
	printf("Enter the Arrival Time for the processes\n");
	for(i = 0; i < n; i++)
	{
	    scanf("%d", &arrT[i]);
	}
	
	printf("Enter the Net Burst Time for the processes\n");
	for(i = 0; i < n; i++)
	{
	    scanf("%d", &netBT[i]);
	}
	
	
	
	finT[0] = netBT[0] - arrT[0];
	turnAT[0] = finT[0] - arrT[0];
	waitT[0] = turnAT[0] - netBT[0];
	
	for(i = 1; i < n; i++)
	{
	    finT[i] = finT[i-1] + netBT[i];
	    turnAT[i] = finT[i] - arrT[i];
	    waitT[i] = turnAT[i] - netBT[i];
	    avgWT += waitT[i];
	    avgTAT += turnAT[i];
	}
	avgTAT += turnAT[0];
	avgTAT = avgTAT/n;
	avgWT = avgWT/n;
	
	printf("Pro \t Ar.Tm \t N.B.T \t F.T \t T.A.T \t Wait Tme \n");
	for(i = 0; i < n; i++)
	{
	    printf("P[%d] \t %d \t %d \t %d \t %d \t %d\n",i , arrT[i], netBT[i], finT[i], turnAT[i], waitT[i]);
	}
	
	printf("Avg. waiting Time = %.2f ms \n", avgWT);
	printf("Avg. Turn Around Time = %.2f ms \n", avgTAT);
	
	return 0;
}
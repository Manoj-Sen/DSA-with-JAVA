class Solution 
{ 
    static long countStr(long n)
  {
	    return 1+n+n+(n*(n-1))+(n*(n-2)*(n-1)/2)+(n*(n-1)/2);
	}
} 

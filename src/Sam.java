class Sam {

	static void countEachChar(String str) 
   { 
	//ASCII values ranges upto 256
	int counter[] = new int[256]; 

	//String length
	int len = str.length(); 
int arr[]=new int[len];
int count=0;
	/* This array holds the occurrence of each char, For example
	 * ASCII value of A is 65 so if A is found twice then 
	 * counter[65] would have the value 2, here 65 is the ASCII value
	 * of A
	 */
	for (int i = 0; i < len; i++) 
		counter[str.charAt(i)]++; 

	// We are creating another array with the size of String
	char array[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) { 
	   array[i] = str.charAt(i); 
	   int flag = 0; 
	   for (int j = 0; j <= i; j++) { 

		/* If a char is found in String then set the flag 
		 * so that we can print the occurrence
		 */
		if (str.charAt(i) == array[j])  
			flag++;                 
	   } 

	   if (flag == 1)  
	      System.out.println("Occurrence of char " + str.charAt(i)
		 + " in the String is:" + counter[str.charAt(i)]);  
	   int k=0;
       int arr[0]=count+counter[str.charAt(i)];
	} 
       
   }
	
	int d = counter[0] + counter[2];System.out.println(d);
	int c = counter[1] + counter[len - 1];System.out.println(c);if(d==c)System.out.println("true");else
	{
		System.out.println("false");
	}

	public static void main(String[] args) {
		String str = "abcdabcdaaaa";
		countEachChar(str);
	}
}
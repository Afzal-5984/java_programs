public class NESTED_FOR {
	public static void main(String[] args){
		for (int i = 0;i<3;i++){
			for (int j = 0; j<6;j++){
				System.out.print("* ");
			}
			System.out.println();
			
			
			
		}System.out.println("------------------");
	   pattern_num();
	   pattern_2();
	   pattern_3();
	   pattern_4();
	   pattern_5();
	   pattern_6();
	   pattern_7();
	   pattern_8();
	   pattern_9();
	   pattern_10();
	   pattern_11();
	   pattern_12();
	   pattern_13();
	   pattern_14();
	   pattern_15();
	   pattern_16();
	   pattern_17();
	   pattern_18();
	   pattern_19();
	   pattern_20();
	   pattern_21();
	}

    public static void pattern_num(){
		int x = 1;
		for (int i=0;i<3;i++){
			for (int j=0;j<5;j++){
				System.out.print(x++ +" ");
			}System.out.println();
		}System.out.println("------------------");
	}
	
	public static void pattern_2(){
		for (int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}System.out.println("------------------");
	}

	public static void pattern_3(){
		for (int i=1;i<=4;i++){
			for (int j=4;j>=i;j--){
				System.out.print("* ");
			}
			System.out.println();
		}System.out.println("------------------");
	}


	public static void pattern_4(){
		int n=4;
		for (int i=1;i<=n;i++){
			for (int j=1;j<=i;j++){
				System.out.print("*");
			}System.out.println();
		}
		for (int i=1;i<=n-1;i++){
			for(int j=n-1;j>=i;j--){
				System.out.print("*");
			}System.out.println();
		}System.out.println("------------------");		
	}

	public static void pattern_5(){
		int n =4 ;
	    for (int i=1 ; i<=n;i++){
			for (int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++){
				System.out.print("*");
			}System.out.println();
		}System.out.println("------------------");
	}

	public static void pattern_6(){
		int n =4;
		for (int i=1;i<=n;i++){
			for (int j=1;j<=n;j++){
				if (i==1 || i==n || j==1 || j==n){
					System.out.print("*");
				}
			    else {
					System.out.print(" ");
			   }
			}
			System.out.println();
		}System.out.println("------------------");
		
	}

	public static void pattern_7(){
		int n=4;
		for (int i=1;i<=n;i++){
			for (int j=1;j<=i;j++){
				if(((i+j)&1)==0){
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}System.out.println();
		}System.out.println("------------------");
	}
	public static void pattern_8(){
		int n=4;
		for (int i=1;i<=n;i++){
			boolean flag = (i&1)!=0;
			for (int j=1 ;j<=i;j++){
				if(flag){
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
				
			  flag = !flag;
			}
		System.out.println();	
	  }System.out.println("------------------");
	}

	public static void pattern_9(){
		int n=4;
		for (int i=1;i<=n;i++){
			for (int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++){
				System.out.print("*");
			}
			for (int j=1;j<=i-1;j++){
				System.out.print("*");
			}
		System.out.println();
		}System.out.println("------------------");
	}


	public static void pattern_10(){
		int n=4;
		for (int i=1;i<=n;i++){
			for (int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for (int j=1;j<=(2*(i-1)+1);j++){
				System.out.print("*");
			}
		System.out.println();
		}System.out.println("------------------");
	}

	public static void pattern_11(){
		int n=4;
		for (int i=0;i<n;i++){
			char ch= (char)('A'+i);
		 for (int j=0;j<=i;j++){
			 System.out.print(ch);
		 }System.out.println();
		}System.out.println("------------------");
	}
	
	public static void pattern_12(){
		int n=4;
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				char ch = (char)('A'+j);
				System.out.print(ch);
			}System.out.println();
		}System.out.println("------------------");
	}
//homework
	public static void pattern_13(){
	 int n=4;
	 for (int i=1;i<=n;i++){
		 for (int j=1;j<=n-i;j++){
			 System.out.print(" ");
		 }
		 for (int j=1;j<=(2*(i-1)+1);j++){
			 System.out.print("*");
		 }
		 
	   System.out.println();
	 }
	 for (int i=n-1 ;i>=1 ;i--){
		 for (int j=1 ;j<=n-i;j++){
			 System.out.print(" ");
		 }
		 for(int j=1;j<=(2*i-1);j++){
			 System.out.print("*");
		 }
	 System.out.println();
	 } System.out.println("------------------");
	
	}


	public static void pattern_14(){
		int n=4;
		for (int i=1;i<=n;i++){
			int x=1;
			for (int j=1 ;j<=n-i;j++){
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++){
				
				System.out.print(x++);
			}System.out.println();
		}System.out.println("------------------");
	}

	public static void pattern_15(){
			int n=4;
			
			for (int i=1;i<=n;i++){
			int x=1;
			 for (int j=1;j<=i;j++){
				System.out.print(x++);
	         }
			System.out.println();
		   }System.out.println("------------------");
	}
	
		public static void pattern_16(){
			int n=4;
			
			for (int i=1;i<=n;i++){
			int x=1;
			 for (int j=n;j>=i;j--){
				System.out.print(x++);
	         }
			System.out.println();
		   }System.out.println("------------------");
	}

		public static void pattern_17(){
			int n=4;
			int x=1;
			for (int i=1;i<=n;i++){
			 for (int j=1 ;j<=i;j++){
				System.out.print(x);
	         }
			 ++x;
			System.out.println();
		   }System.out.println("------------------");
	}

	public static void pattern_18(){
			int n=4;
			int x=4;
			for (int i=1;i<=n;i++){
			 for (int j=n;j>=i;j--){
				System.out.print(x);
	         }
			 --x;
			System.out.println();
		   }System.out.println("------------------");
	}
		
		public static void pattern_19(){
			int n=4;
			for (int i=1;i<=n;i++){
			char ch = (char)('E'- i);
			 for (int j=n;j>=i;j--){
				System.out.print(ch);
	         }
			System.out.println();
		   }System.out.println("------------------");
	}
	
	public static void pattern_20(){
			int n=4;
			for (int i=1;i<=n;i++){	
			char ch = 'A';
			 for (int j=n;j>=i;j--){
				System.out.print(ch);
				ch +=1;
	         }
			System.out.println();
			
		   }System.out.println("------------------");
	}

	public static void pattern_21(){
		int n=5;
		for(int i=0;i<n;i++){
			char ch = (char) ('A'+n-i-1);
			for (int j=0;j<=i;j++){
				System.out.print(ch++);
			}
		System.out.println();	
		}
	}



}

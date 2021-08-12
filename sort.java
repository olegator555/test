import java.util.Scanner;
class sort
{

	public static void main(String[] args)   // kkwdmwkmkwmk
	{
		Scanner scan = new Scanner(System.in);
		int mas[] = new int[10];
		for(int i=0;i<10;i++)
		{
			mas[i]=scan.nextInt();
		}
		System.out.println();
		for(int i=0;i<10;i++)
			System.out.print(mas[i]+" ");
		System.out.print("\n");
		bubble back = new bubble(mas);
		bubble back1 = new bubble(mas);
		bubble one = new bubble();
		
		one.bubblesort(mas);

		back.print();
		back.insert();
		System.out.println();
		back1.print();
		back1.quicksort(mas,0,9);
		for(int i=0;i<10;i++)
			System.out.print(mas[i]+" ");
		System.out.println();




	}
	static class bubble
	{
		int[] mas = new int[10];
		int[] rec = new int[10];
		bubble(int[] mas) {
		for(int i=0;i<10;i++)
			rec[i]=mas[i];
		};
		bubble() {};
		
		void bubblesort(int mas[])
		{
			this.mas=mas;

			for(int i=0; i<9;i++)
				for(int j=0;j<9;j++)
					if(mas[j]>mas[j+1])
					{
						int temp=mas[j];
						mas[j]=mas[j+1];
						mas[j+1]=temp;
					} 

			for(int i=0;i<10;i++)
				System.out.print(mas[i]+" ");
			System.out.println("\n");

		}

		void insert()
		{
			int[] mas1 = new int[10];
			mas1 = rec;
			int t=0;
			int temp=0;
			
			for(int i=0;i<9;i++)
			{
				t=i+1;
				temp=mas1[t];
				for(int j=i+1;j>0;j--)
				{
					if(temp<mas1[j-1])
					{
						mas1[j]=mas1[j-1];
						t=j-1;

					}
				}
				mas1[t]=temp;
			}
			for(int i =0;i<10;i++)
				System.out.print(mas1[i]+" ");
			System.out.println();
		}

		void quicksort(int[] mas2, int start, int end)
		{
			int i=start;
			int j=end;
			int med = mas2[(start+end)/2];
			while(i <= j)
			{
				while(mas2[i]<med) 
					i++;
				while(mas2[j]>med)
					j--;
				if(i<=j)
				{
					int temp = mas2[i];
					mas2[i]=mas2[j];
					mas2[j]=temp;
					i++;
					j--;

				}
			}
			if(start<j) 
				quicksort(mas2,start,j);
			if(end>i) 
				quicksort(mas2,i,end);
			
			
		}
		void print()
		{
			
			for(int i=0; i<10;i++)
			{
				System.out.print(rec[i] +" ");
			}
			System.out.println();
		}

	}
}
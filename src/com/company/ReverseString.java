package com.company;



public class ReverseString {
        static void print(String st)
        {
            for(int i=st.length()-1;i>=0;i--)
            {
                char c = st.charAt(i);
                System.out.print(c);
            }
            System.out.println();
        }
}

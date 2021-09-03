package com.company;

public class DelDuplicate {
    static void change(String st)
    {
        String[] words = st.split(" +");
        int count = words.length;
        int k=0;

        for(int i=0; i<count; i++)
        {
            for(int j=0;j<count;j++)
            {
                if(words[i].equals(words[j]))
                    k++;
                if(k>1)
                {
                    st=st.replace(words[i],"");
                }



            }
            k=0;

        }
        System.out.println(st);
    }
    static void del(String st, String word)
    {
        st.replace(word,"");
    }
    static void print(String st)
    {

        System.out.print(st);


        System.out.println();
    }
}

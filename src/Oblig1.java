////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        if (a.length==0){
            throw new NoSuchElementException("Array er tom");
        }


        ombyttinger(a);


        return a[a.length-1];
    }

    public static int ombyttinger(int[] a) {
        int counter = 0;

        for (int j = 0; j < a.length-1; j++)
            if (a[j] >a[j+1])
            {

                // swap arr[j+1] and arr[i]
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                counter++;
            }

        return counter;
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {

        if (a.length==0){
            return 0;
        }



        // Sjekk usortert array
        for(int i=1;i<a.length;i++)
        {
            if (a[i - 1] > a[i])
            {
                throw new IllegalStateException("Ikke sortert");
            }
        }


        int res = 1;

        // Velger hver element
        for (int i = 1; i < a.length; i++)
        {
            int j = 0;
            for (j = 0; j < i; j++)
                if (a[i] == a[j])
                    break;

            if (i == j)
                res++;
        }


        return res;
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {

        if (a.length==0){
            return 0;
        }




        int res = 1;

        // Velger hver element
        for (int i = 1; i < a.length; i++)
        {
            int j;
            for (j = 0; j < i; j++)
                if (a[i] == a[j])
                    break;

            if (i == j)
                res++;
        }


        return res;

    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {


        //  We are counting the number of even and odd numbers
        int oddCount=0,evenCount=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                evenCount++;
            }
            else{
                oddCount++;
            }
        }


        // creating


        int []odd= new int[oddCount];
        int []even= new int[evenCount];

        int oddindex=0,evenindex=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                even[evenindex]=a[i];
                evenindex++;
            }
            else{
                odd[oddindex]=a[i];
                oddindex++;
            }
        }

        oddCount--;
        evenCount--;
        for(int i=0;i<oddCount;i++)
        {
            for(int j=i;j<oddCount;j++)
            {
                if (odd[j] > odd[j+1])
                {
                    // bytt arr[j+1] and arr[i]
                    int temp = odd[j];
                    odd[j] = odd[j+1];
                    odd[j+1] = temp;
                }

            }
        }

        for(int i=0;i<evenCount;i++)
        {
            for(int j=i;j<evenCount;j++)
            {
                if (even[j] > even[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = even[j];
                    even[j] = even[j+1];
                    even[j+1] = temp;
                }

            }
        }

        int mainIndex=0;
        for(int i=0;i<=oddCount;i++)
        {
            a[mainIndex]=odd[i];
            mainIndex++;
        }

        for(int i=0;i<=evenCount;i++)
        {
            a[mainIndex]=even[i];
            mainIndex++;
        }

    }







    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {

        if (a.length==0){
            return;
        }

        int n=a.length;
        char last=a[n-1];
        for(int i=n-1;i>0;i--)
        {
            a[i]=a[i-1];
        }
        a[0]=last;


    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        int sLength=s.length();
        int tLength=t.length();

        if(sLength==0){
            return t;
        }
        else if(tLength==0)
        {
            return s;
        }
        else{
            String res="";
            int first=0,second=0;
            while(first<sLength || second<tLength)
            {
                if(first<sLength)
                {
                    res+=s.charAt(first);
                    first++;
                }
                if(second<tLength)
                {
                    res+=t.charAt(second);
                    second++;
                }
            }
            return res;
        }



    }

    /// 7b)
    public static String flett(String... s) {

        int first=0;
        String res="";
        int biggest=0;
        for(String i:s)
        {
            if (i.length()>biggest)
            {
                biggest=i.length();
            }
        }

        while(first<biggest)
        {
            for (String i :s)
            {
                if(first<i.length())
                {
                    res+=i.charAt(first);
                }
            }
            first++;
        }
        return res;

    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1

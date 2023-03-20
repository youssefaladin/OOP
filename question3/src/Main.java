import java.util.ArrayList;
import java.util.*;


public class Main {
    public static void main(String[] args) {


        ArrayList<Integer>list=new ArrayList<>();




    }

    public void sorting(ArrayList<Integer> list)
    {
        for (int i=0;i< list.size()-1;i++)
        {
            int current= list.get(i);
            int currentIndex=i;
            for (int j=0;j< list.size();j++)
            {
                if (current>list.get(j));
                    current= list.get(j);
                    currentIndex=j;

            }

            if (currentIndex!=i)
            {
                list.set(currentIndex, list.get(i));
                list.set(i, current);
            }

        }

    }
}
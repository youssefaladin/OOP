import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer>max=new ArrayList<>();
        System.out.println("ENTER YOUR VALUES");
        Integer number =obj.nextInt();

        while (number.intValue()!=0 )
        {
            max.add(number);
            number=obj.nextInt();
        }

    }
    public static Integer  maximum(ArrayList <Integer> max)
    {
        if(max.size()==0)
            return null;
        Integer maximum1 = max.get(0);
        for (int i = 0; i < max.size(); i++) {
            if (max.get(i) > maximum1)
                maximum1 = max.get(i);
        }
        return maximum1;
    }
}
public class myinteger {
    private int value;

    public myinteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public boolean Even () {
        if (value %2==0)
        {
            return true;
        }
        else
            return false;
    }
    public boolean odd () {
        if (value %2==1)
        {
            return true;
        }
        else
            return false;
    }
    public boolean prime () {
        for(int i=0;i<value;i++)
        {
            if(value%i==0)
                return false;
        }
        return true;
    }
    public static boolean Even (int x) {
        if (x %2==0)
        {
            return true;
        }
        else
            return false;
    }
    public static boolean odd (int x) {
        if (x %2==1)
        {
            return true;
        }
        else
            return false;
    }
    public static boolean prime (int x) {
        for(int i=0;i<x;i++)
        {
            if(x%i==0)
                return false;
        }
        return true;
    }
    public static boolean Even (myinteger x) {
        if (x.value %2==0)
        {
            return true;
        }
        else
            return false;
    }
    public static boolean odd (myinteger x) {
        if (x.value %2==1)
        {
            return true;
        }
        else
            return false;
    }
    public static boolean prime (myinteger x) {
        for(int i=0;i<x.value;i++)
        {
            if(x.value%i==0)
                return false;
        }
        return true;
    }
}

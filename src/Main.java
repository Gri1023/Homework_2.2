public class Main {
    public static void main(String[] args) {
        int result = 0;
        int x =5, y = -7, m;
        if (y<0)
        {
            y=-y;
            m=-1;
        }
        else
            m=1;

        while (y>0)
        {
            if (y%2 == 0)
            {
                x=x+x;
                y=y/2;
            }
            else
            {
                result = result + x;
                y = y -1;
            }
        }
        if (m<0)
            result = -result;

        System.out.println(result);
    }
}
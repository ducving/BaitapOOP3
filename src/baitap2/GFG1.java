package baitap2;

public class GFG1 {
    public static void main (String[] args)
    {
        // Initializing String variable with null value
        String ptr =null;

        // Checking if ptr.equals null or works fine.
        try
        {
            // This line of code throws NullPointerException
            // because ptr is null
            if (ptr.equals("âs"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }
    }
// dòng lệnh try phát sinh lỗi nên chuyển xuống catch va thực thi lệnh sout!
}

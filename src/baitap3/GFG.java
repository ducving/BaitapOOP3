package baitap3;

public class GFG {
    public static void main (String[] args)
    {
        // Initializing String variable with null value
        String str = null;
        String message = (str == null) ? "" : str.substring(0,5);
        System.out.println(message);
        // Initializing String variable with null value
        str = "Geeksforgeeks";
        message = (str == null) ? "" : str.substring(0,5
        );
        System.out.println(message);
//   khi chạy đoạn mã trên dòng Geeksforgeeks sẽ bị cắt thành Geeks ta sủ dụng lênh
//   subString để thực hiện cắt đoạn mã đó.
//        điều kiện ? khối lệnh : Khối lệnh
    }
}

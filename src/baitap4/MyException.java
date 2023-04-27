package baitap4;
// Một lớp đại diện cho ngoại lệ do người dùng định nghĩa
public class MyException extends Exception{
    public MyException(String s){
//        gọi hàm ngoại lệ gốc
        super(s);
    }
}
//Một lớp sử dụng MyException ở trên
 class Main{
    public static void main(String[] args)  {
        try {
            throw new MyException("GeeksGeeks");
        }
        catch (MyException ex){
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}
//đoạn mã trên gồm 2 lớp
//lớp MyException là lớp con của  Exception
//sử dụng để tạo phương thức MyException(String s)
//lớp Main
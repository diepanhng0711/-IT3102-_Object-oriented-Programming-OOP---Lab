package hust.soict.hedspi.lab02;

public class JavaFundamental {
    public static void main(String args[]) {
    //1. Chú ý khi làm việc với các số thực
    System.out.println(2.0 - 1.1);
    System.out.println(5.0 - 4.1);
    //Kết quả không chính xác tuyệt đối do giới hạn lưu trữ

    //2. Lệnh printf trong Java
    System.out.printf("%.2f", 10.98765);
    System.out.printf("\n");
    System.out.printf("%.2f\n", 10.98265);

    //3. Khai báo hằng trong Java
    final double PI = 3.14159; //Khi khai báo hằng BẮT BUỘC phải gán giá trị cho biến luôn
    final long MICROS = 24*60*60*1000*1000; //overflow => MICROS/ MILIS = 5 chứ không phải 1000
    final long MILIS = 24*60*60*1000;
    System.out.println(MICROS/ MILIS);
    System.out.println(PI);

    //4. Lưu ý font chữ
    System.out.println(12345 + 5432l); //l trong 5432l là long chứ không phải là 1
    
    //5. Lưu ý trong chuyển đổi kiểu
    System.out.println((int) (char) (byte) -1);

    //6. char và String trong phép cộng
    System.out.println("H" + "a"); //Phép nối xâu
    System.out.println('h' + 'a'); //Phép cộng số học => ký tự chuyển thành giá trị mã UNICODE tương ứng

    System.out.println(1 + 2 + "3"); //33
    System.out.println("1" + 2 + 3); //123 do "1" là string => 2, 3 chuyển thành String
    
    //7. Ký tự kiểu char trong Java là UNICODE
    char a = '\u0061';
    System.out.println(a);
    }
}

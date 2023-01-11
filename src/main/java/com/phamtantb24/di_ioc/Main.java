package com.phamtantb24.di_ioc;
//Cac class khong nen phu thuoc vao ke thua cap thap,ma nen phu
//thuoc vao Abstraction(lop truu tuong)

//Dependency Injection là việc các Object nên phụ thuộc vào các Abstract Class
// và thể hiện chi tiết của nó sẽ được Inject vào đối tượng lúc runtime.
public class Main {
    public static void main(String[] args) {
        Outfit outfit = new Vest();
        Man man = new Man(outfit);//Inject outfit into man
        //Neu nhu co nhieu thuoc tinh hon 10-15 thi rat mat thoi gian neu inject bang tay
        //Vi the IOC ra doi.
        //Bây giờ giả sử, chúng ta định nghĩa trước toàn bộ các dependency có trong Project,
        // mô tả nó và tống nó vào 1 cái kho và giao cho một thằng tên là framework quản lý.
        // Bất kỳ các Class nào khi khởi tạo, nó cần dependency gì,
        // thì cái framework này sẽ tự tìm trong kho rồi inject vào đối tượng thay chúng ta.
        // sẽ tiện hơn phải không?
    }
}

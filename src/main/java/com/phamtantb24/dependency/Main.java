package com.phamtantb24.dependency;

//tight-coupling : "lien ket rang buoc" moi quan he giua cac class qua chat che
//khi thay doi class nay se anh huong den class khac
//loosely-coupled : "giam bot su phu thuoc giua cac class voi nhau"
//Bang cach su dung interface sortalgorithm ta khong can phai quan
// tam dau la doi tuong duoc truyen vao(bubble or quick) chi can tap trung vao logic cua code
public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        BubbleSort bubbleSort = new BubbleSort();
        VeryComplexService service = new VeryComplexService(quickSort);
        VeryComplexService service1 = new VeryComplexService(bubbleSort);
    }
}

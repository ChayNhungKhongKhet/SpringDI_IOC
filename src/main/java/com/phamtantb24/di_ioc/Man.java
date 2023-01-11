package com.phamtantb24.di_ioc;


public class Man {
    private Outfit outfit;
    //Bây giờ Man sẽ hoạt động với Outfit mà thôi. Và Outfit ở đâu ra?
    // Chúng ta tạo ra và đưa nó vào (Inject) người đàn ông Man.
    public Man(Outfit outfit) {
        this.outfit = outfit;
    }

}

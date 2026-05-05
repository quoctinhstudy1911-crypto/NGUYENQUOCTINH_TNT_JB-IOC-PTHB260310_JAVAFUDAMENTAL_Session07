package com.stu;

public class Book {
    private String title;
    private String author;
    private double price;

    public void printInfo()
    {
        System.out.println("THÔNG TIN CỦA CỦA CUỐN SÁCH LÀ: ");
        System.out.println("Tên sách: "+ this.title);
        System.out.println("Tác giả: "+ this.author);
        System.out.println("Giá sản phẩm: "+ this.price);
    }
}

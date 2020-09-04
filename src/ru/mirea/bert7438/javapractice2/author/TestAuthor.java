package ru.mirea.bert7438.javapractice2.author;

public class TestAuthor {
    public static void main(String[] args) {
        Author rowling = new Author("Joan Rowling", "jrowling@gmail.com", 'f');
        System.out.println(rowling);
        rowling.setEmail("joanthebest@yahoo.com");
        System.out.println(rowling);
    }


}

package ru.mirea.bert7438.javapractice2.author;

public class Author {
    private String name;
    private String email;
    private char gender;

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String toString(){
        return "Author\nname: " + name + "\nemail: " + email + "\ngender: " + gender;
    }
}

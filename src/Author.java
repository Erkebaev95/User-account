public class Author {
    private final String surname;
    private final String name;
    private final String birthday;
    private final String county;
    private final Book[] books;

    public Author(String surname, String name, String birthday, String county, Book[] books) {
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
        this.county = county;
        this.books = books;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getCounty() {
        return county;
    }

    public Book[] getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", county='" + county + '\'' +
                '}';
    }
}
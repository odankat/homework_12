public class Main {
    public static void main(String[] args) {
        Author levTolstoi = new Author("Толстой", "Лев");
        Author ivanTurgenev = new Author("Тургенев", "Иван");
        Book warAndPeace = new Book("Война и Мир", levTolstoi, 1867);
        Book fatherAndSons = new Book("Отцы и дети", ivanTurgenev, 1862);
        System.out.println("warAndPeace = " + warAndPeace.getAuthor());
        System.out.println(warAndPeace);
        System.out.println(fatherAndSons);
        System.out.println(warAndPeace.equals(ivanTurgenev));
        System.out.println(fatherAndSons.hashCode());
        System.out.println(warAndPeace.hashCode());
        System.out.println(warAndPeace.hashCode());
        System.out.println(fatherAndSons.hashCode());
        System.out.println(warAndPeace.equals(warAndPeace));
        System.out.println(ivanTurgenev.hashCode());
        Book book1 = new Book("fsd",ivanTurgenev,344);
        book1 = warAndPeace;
        System.out.println(warAndPeace.equals(book1));
        System.out.println(warAndPeace.equals(ivanTurgenev));









    }
}
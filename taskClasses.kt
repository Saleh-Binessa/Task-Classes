class Book(var title: String, val author: String, var yearPublished: Int) {
    fun getBookInfo() {
        println("$title by $author ($yearPublished)")
    }
}

fun  main() {
    val myFavoriteBook = Book("Rich Dad Poor Dad", "Robert Kiosaki", 1997)
    myFavoriteBook.getBookInfo()
}
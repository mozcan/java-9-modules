module book {
    //exports com.book.service; // We can export this package for amy module who requires it
    exports com.book.service to order; // We can export this package for spesific module
}
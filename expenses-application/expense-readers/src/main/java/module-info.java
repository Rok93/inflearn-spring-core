module expense.readers {
    exports  com.example.expenses.readers;
    exports  com.example.expenses.readers.file;
    exports  com.example.expenses.readers.http;

    requires json.simple;
}

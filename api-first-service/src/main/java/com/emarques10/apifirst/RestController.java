package com.emarques10.apifirst;

import com.example.api.LibraryApi;
import com.example.models.Book;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class RestController implements LibraryApi {
    @Override
    public ResponseEntity<List<Book>> getAllBooksInLibrary() {
        return null;
    }
}

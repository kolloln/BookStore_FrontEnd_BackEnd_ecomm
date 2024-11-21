// src/app/add-book/add-book.component.ts
import { Component } from '@angular/core';
import { BookService } from '../book.service';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html'
})
export class AddBookComponent {
  book = { title: '', author: '', isbn: '' };

  constructor(private bookService: BookService) {}

  addBook(): void {
    this.bookService.addBook(this.book).subscribe(() => {
      // reset form or handle success message
    });
  }
}

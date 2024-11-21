import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http'; // Import HttpClientModule

import { AppComponent } from './app.component'; // Import the AppComponent
import { BookListComponent } from './book-list/book-list.component';

@NgModule({
  declarations: [
    AppComponent, // Declare your components
    BookListComponent
  ],
  imports: [
    BrowserModule, // Import BrowserModule
    HttpClientModule // Import HttpClientModule for HTTP requests
  ],
  providers: [],
  bootstrap: [AppComponent] // Bootstrap your main component
})
export class AppModule { }

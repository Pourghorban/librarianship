# مستندات API کتاب‌ها

## دریافت تمام کتاب‌ها
- **URL:** `/api/books`
- **Method:** `GET`
- **Response:**
  ```json
  [
      {
          "id": 1,
          "title": "Book Title",
          "author": "Author Name",
          "isbn": "123-4567890123"
      },
      ...
  ]
## دریافت کتاب بر اساس ID
- **URL:** `/api/books/{id}`
- **Method:** `GET`
- **Path Parameters:** `id (Long): شناسه کتاب`
- **Response:**
  ```json
    {
      "id": 1,
      "title": "Book Title",
      "author": "Author Name",
      "isbn": "123-4567890123"
    }
## ایجاد کتاب جدید
- **URL:** `/api/books`
- **Method:** `POST`
- **Request Body:**
  ```json
    {
      "title": "New Book Title",
      "author": "New Author Name",
      "isbn": "987-6543210987"
    }
- **Response:**
  ```json
    {
    "id": 2,
    "title": "New Book Title",
    "author": "New Author Name",
    "isbn": "987-6543210987"
    }
## به‌روزرسانی کتاب
- **Method:** `PUT`
- **Path Parameters:** `id (Long): شناسه کتاب`
- **Request Body:**
  ```json
    {
    "title": "Updated Book Title",
    "author": "Updated Author Name",
    "isbn": "987-6543210987"
    }
- **Response:**
  ```json
    {
      "id": 2,
      "title": "Updated Book Title",
      "author": "Updated Author Name",
      "isbn": "987-6543210987"
    }

## حذف کتاب
- **URL:** `/api/books/{id}`
- **Method:** `DELETE`
- **Path Parameters:** `id (Long): شناسه کتاب`
- **Response:** `Response: 200 OK (در صورت موفقیت)`

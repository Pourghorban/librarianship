# مستندات API کاربران

## دریافت تمام کاربران
- **URL:** `/api/users`
- **Method:** `GET`
- **Response:**
  ```json
  [
      {
          "id": 1,
          "name": "John Doe",
          "email": "john.doe@example.com",
          "phone": "123-456-7890",
          "userType": "CUSTOMER"
      },
      ...
  ]
## دریافت کاربر بر اساس ID
- **URL:** `/api/users/{id}`
- **Method:** `GET`
- **Path Parameters:** `id (Long): شناسه کاربر`
- **Response:**
  ```json
    {
    "id": 1,
    "name": "John Doe",
    "email": "john.doe@example.com",
    "phone": "123-456-7890",
    "userType": "CUSTOMER"
    }

## ایجاد کاربر جدید
- **URL:** `/api/users`
- **Method:** `POST`
- **Request Body:**
  ```json
    {
        "name": "Jane Doe",
        "email": "jane.doe@example.com",
        "phone": "987-654-3210",
        "userType": "SELLER"
    } 
- **Response:**
  ```json
    {
        "id": 2,
        "name": "Jane Doe",
        "email": "jane.doe@example.com",
        "phone": "987-654-3210",
        "userType": "SELLER"
    }
## به‌روزرسانی کاربر
- **URL:** `/api/users/{id}`
- **Method:** `PUT`
- **Path Parameters:** `id (Long): شناسه کاربر`
- **Request Body:**
  ```json
    {
    "name": "Jane Doe",
    "email": "jane.doe@example.com",
    "phone": "987-654-3210",
    "userType": "SELLER"
    }
- **Response:**
  ```json
    {
      "id": 2,
      "name": "Jane Doe",
      "email": "jane.doe@example.com",
      "phone": "987-654-3210",
      "userType": "SELLER"
    }
## حذف کاربر
- **URL:** `/api/users/{id}`
- **Method:** `PUT`
- **Path Parameters:** `id (Long): شناسه کاربر`
- **Request Body:**
- **Response:** `200 OK (در صورت موفقیت)`

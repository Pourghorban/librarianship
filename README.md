# پروژه مدیریت کاربران و کتاب‌ها

این پروژه یک سیستم مدیریت کاربران و کتاب‌ها است که از Spring Boot استفاده می‌کند.

## پیش‌نیازها
- Java 8 
- Maven

## نحوه اجرای پروژه

برای اجرای پروژه از کامند لاین، مراحل زیر را دنبال کنید:

1. مخزن را کلون کنید:
    ```bash
    git clone https://github.com/yourusername/librarianship.git
    cd librarianship
    ```

2. وابستگی‌ها را نصب کنید و پروژه را بیلد کنید:
    ```bash
    mvn clean install
    ```

3. پروژه را اجرا کنید:
    ```bash
    mvn spring-boot:run
    ```

پروژه روی پورت 80 اجرا خواهد شد. برای دسترسی به APIهای تعریف شده، به آدرس `http://localhost` بروید.

## مستندات API

مستندات کامل APIها در دایرکتوری [docs](./docs) قرار دارد. فایل‌های مرتبط:

- [API کاربران](./docs/api_users.md)
- [API کتاب‌ها](./docs/api_books.md)

# Kot.cloud UI Automation Tests

Автоматизированные UI тесты для сайта https://kot.cloud

## Стек

- Java 17
- Selenide
- JUnit 5
- Gradle
- Allure Report
- GitHub Actions

## Что покрыто тестами

### Main Page Tests
- Проверка открытия главной страницы
- Проверка отображения navigation
- Проверка CTA кнопки

### Navigation Tests
- Проверка секций:
    - Преимущества
    - Возможности
    - Клиенты
    - Адаптивность
    - О компании
    - Пользователи
    - Стоимость
    - Контакты

## Архитектура

Проект реализован с использованием:

- Page Object Pattern
- Step Objects
- Allure Steps
- Base Test Configuration

## Запуск тестов

```bash
./gradlew clean test
```

## Генерация Allure отчета

```bash
allure serve build/allure-results
```

## GitHub Actions

Тесты автоматически запускаются при:
- push
- pull request
- manual dispatch

## Пример Allure отчета

Allure содержит:
- steps
- screenshots
- execution time
- test structure
- attachments


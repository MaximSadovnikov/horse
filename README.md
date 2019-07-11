# horse

### Постановка задачи

Имеется шахматная доска размером **width** на **height**. **Width** обозначает ширину доски по горизонтали. **Height** высоту доски по вертикали. Даны начальное **start** и конечное **end** положение коня, например, B1 и A3. Латинскими буквами обозначается позиция на доске по горизонтали, цифрами позиция по вертикали, аналогично тому как это делается в Excel. Подсчитать за какое минимальное количество ходов конь достигнет конечного положения. В случае, если конечное положение не достижимо возвратить «-1».

## 1. Maven

Так как сборка происходит с использованием maven, то для начала его нужно установить. Для этого надо проедалать следующие шаги (для Windows): 
1. Скачать файл с сайта по [ссылке](https://maven.apache.org/download.cgi); 
2. Распаковываем архив в папке Program Files;
3. Добавляем системную переменную Path.

Для Mac Os:
1. Тот же что и для Windows;
2. Перенести папку из Downloads/ в /Applications/;
3. Добавление пути в файле .bash-profile (находится в папке пользователя).

## 2. Сборка с помощью Maven
Открываем терминал по адресу .../horse
Компиляция maven-проекта
    ```
    mvn compile
    ```
Данная команда, выполненная в корне проекта скомпилирует все java-файлы и поместит class-файлы в папку target.

Сборка проекта в jar-архив:
    ```
    mvn package
    ```
Результирующий jar-архив будет размещен в папке target

## 3. Запуск
Переходим в папку /horse/target и запускаем с использованием команды:
    ```
    java -jar horse-0.0.1-SNAPSHOT.jar
    ```
Открыть браузер и ввести в адресную строку cледущие ссылки (можно просто перейти по ссылке):

* http://localhost/horse/rest/count?width=10&height=14&start=B1&end=A3 -- для REST endpoint в виде сервлета (Java Servlet);

* http://localhost/horse/servlet/count?width=10&height=14&start=B1&end=A3 -- для REST endpoint в виде Spring Controller (RestController)

При вызове их будет выведена 1, так как клетка A3 достижима из положения B1 за один ход.

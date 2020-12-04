# Encryption-Decryption
Мой проект в jetbrains academy (hyperskill.org)

Описание проекта: https://hyperskill.org/projects/46?track=1

Мой профиль на сайте: https://hyperskill.org/profile/35824705

# Краткое описание:
Шифрование и дешифровка текстовых данных. 
Поддерживаются 2 варианта шифра. 
Система ввода вывода консольная (+ параметры командной строки) и файловая. 

# Структура проекта
Путь к проекту: Encryption-Decryption/task

В папке Problems решённые задачи не относящиеся к проекту (мелкие учебные задачи по различным разделам java core, которые я решал параллельно с проектом)

## пакеты в src
* data - инкасуляция и парсинг данных
* encryption - шифрование
* decryption - дешифрование
* io - система ввода/вывода

# Запуск программы
Через параметры командной строки! [Run -> Edit Configurations -> Program arguments] 

Параметры можно указывать в любом порядке. Если какой-то параметр не задан, будет автоматически установлен параметр по умолчанию.

> Пример параметров: java Main -key 5 -alg shift -data "Bjqhtrj yt mdujwxpnqq!" -mode dec
>
> Должно быть выведено: Welcome to hyperskill!

## общий синтаксис параметров 
* -mode - Режим работы шифрование\дешифровка (enc, dec)
* -key - ключ для шифрования
* -data - входная строка
* -out - файл для вывода (по умолчанию поток установлен в консоль System.out)
* -in - если надо читать из файла (затирает параметр -data)
* -alg - алгоритм шифрования (шифр Цезаря - shift, шифр сдвига в кодировке - unicode)

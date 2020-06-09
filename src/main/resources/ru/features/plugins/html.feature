#language:ru
@html-plugin
Функционал: Пример использования html-plugin

  @html
  Сценарий: Пример использования html-plugin
    * пользователь находится на странице "Test Automation Gears HTML 2"
    * пользователь в блоке "List of repos 2" (ищет репозиторий) с параметром "page-factory-2-example 2"
    * пользователь нажимает кнопку "page-factory-2-example 2"
    * пользователь находится на странице "Page-factory-2 example HTML 2"
    * пользователь в блоке "List of branches 2" (выбирает тестовую ветку)
    * пользователь нажимает кнопку "example.txt 2"
    * пользователь находится на странице "Example HTML 2"
    * пользователь проверяет что в поле "Text 2" значение "Тестовый текст для примера"
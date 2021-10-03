# Andersen_movie

Основной ресурс для API: https://www.omdbapi.com/

Приложение должно поддерживать кэширование и иметь возможность работать без интернета. Весь функционал по поиску и фильтрации, также должен поддерживать работу без интернета. 	Приложение должно поддерживать навигацию назад. На всех экранах, кроме главного, необходимо отображать стрелку назад. 	Если после выполнения запроса, данных не оказалось, то необходимо показывать соответствующий текст пользователю. В момент загрузки данных необходимо отображать прогресс-индикатор.
	
## Базовый функционал приложения:
+	Поиск фильмов и сериалов по названию и году
+	Показ детальной информации по выбранному фильму
+	Добавление фильмов в избранное 
  
## Стек технологий
-	Kotlin
-	MVVM
-	Okhttp + Retrofit
-	Glide
-	SQLite/Room
-	Coroutines
-	LiveData

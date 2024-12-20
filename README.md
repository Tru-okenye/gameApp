# GameApp
 **🚧 Project Status: Under Active Development 🚧** 
 <br> Android App that uses Retrofit and Jetpack Compose to easily consume a gaming API and display information about popular games. 
The app allows users to browse a list of games and view detailed information about each one. 
The app has a clean, intuitive user interface built with Jetpack Compose, making it easy to use and navigate. </br>

## Libraries

- Retrofit2
- Coil
- Compose Navigation : 
- Hilt Navigation
- LiveData : A lifecycle-aware data holder with observer pattern 
- ViewModel : The viewModel class is designed to store and manage UI-related data in a lifecycle  concious way 
- Dagger-Hilt : A dependency injection library for Android that reduces the boilerplate of doing manual dependency injection in your Project
- Kotlin Coroutines : A Concurrency design pattern that you can use on Android to simplify code that executes asynchronously
 
- Material Library : Modular and customizable Material Design UI Components for Android


## Features

- Show a list of games
- See the details of each game


## API Reference

#### Live games list

```http
  GET https://www.freetogame.com/api/games
```

| Base Url                          | Parameter | Type     |
|:----------------------------------|:----------|:---------|
| `https://www.freetogame.com/api/` | `games`   | `string` |

#### Return details from a specific game

```http
  GET https://www.freetogame.com/api/game?id=452
```

| Base Url                          | Parameter     | Type  | Description              |
|:----------------------------------|:--------------|:------|:-------------------------|
| `https://www.freetogame.com/api/` | `game?id=452` | `int` | **Required**. id of game |

## Documentation
[Documentation](https://www.freetogame.com/api-doc)

![App Screenshot]
![img.png](img.png)
![img_1.png](img_1.png)


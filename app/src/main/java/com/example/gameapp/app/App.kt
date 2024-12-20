package com.example.gameapp.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/*
marking the application class in android with @HiltAndroidApp allows
application to use hilt for dependency injection automatic without setting up
the dependency injection framework manually
*/

@HiltAndroidApp
class App : Application()
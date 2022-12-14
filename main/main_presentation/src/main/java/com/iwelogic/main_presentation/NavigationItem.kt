package com.iwelogic.main_presentation

import com.iwelogic.core.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home", R.drawable.ic_home, "Home")
    object Statistics : NavigationItem("statistics", R.drawable.ic_home, "Statistics")
    object Settings : NavigationItem("settings", R.drawable.ic_home, "Settings")
}

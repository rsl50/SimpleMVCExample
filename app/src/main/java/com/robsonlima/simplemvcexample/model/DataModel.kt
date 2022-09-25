package com.robsonlima.simplemvcexample.model

/**
 * The Model provides data (e.g. parsin JSON data, fetch data from database, etc).
 * Contains the data we want to show on UI (in MainFragment).
 */
data class DataModel(val textForUI: String) {
    fun getUpdatedTextFromModel() : String {
        return textForUI
    }
}

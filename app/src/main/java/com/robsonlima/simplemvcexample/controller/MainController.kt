package com.robsonlima.simplemvcexample.controller

import com.robsonlima.simplemvcexample.model.DataModel

/**
 * The Controller Interface the interaction between the View (MainFragment) and Model (DataModel)
 */
class MainController() {
    // Instantiate the Model with the new data
    private val model = DataModel(textForUI = "Here's the updated text!")

    fun getUpdatedTextFromModel() : String {
        return model.getUpdatedTextFromModel()
    }
}
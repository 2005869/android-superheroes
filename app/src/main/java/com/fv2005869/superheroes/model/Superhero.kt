package com.fv2005869.superheroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Superhero (
    @DrawableRes val imageResourceId:Int,
    @StringRes val nameStringId:Int,
    @StringRes val descriptionStringId:Int
)
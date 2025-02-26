package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.IdRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourceIdRes: Int,
    @DrawableRes val imageResourceId: Int
)

package org.iesch.superheroes.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

// 1 - Me creo el objeto superheroe y lo hago parcelizable

@Parcelize
data class SuperHeroe(
    val nombre: String,
    val alterEgo: String,
    val bio: String,
    val power: Float
) : Parcelable
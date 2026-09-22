package org.iesch.superheroes.model

// 1 - Me creo el objeto superheroe y lo hago parcelizable
// 2 -

data class SuperHeroe(
    val nombre: String,
    val alterEgo: String,
    val bio: String,
    val power: Float
)
package com.example.composerecyclerview.model

import java.io.Serializable

/*** Serializable is interface. >> Serializable is required when we are using intent to transform tv show objects from one activity to another
 */

data class TvShow(
    val id: Int,
    val name: String,
    val year: Int,
    val rating : Double,
    val imageId : Int,
    val overview : String
    ) : Serializable
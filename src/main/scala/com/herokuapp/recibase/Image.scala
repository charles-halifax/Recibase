package com.herokuapp.recibase

import io.circe.generic.JsonCodec

@JsonCodec
case class Image(src: String, width: Int = 1080, height: Int = 1080)

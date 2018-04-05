package isee.ja.kodlin_photo_app.models

import java.io.Serializable

data class Photo (val id : String,
                  val likes : Int,
                  val tags : String,
                  val favorites : Int,
                  val previewURL : String,
                  val webformatURL : String) : Serializable{
    
}
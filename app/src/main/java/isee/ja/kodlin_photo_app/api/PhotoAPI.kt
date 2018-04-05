package isee.ja.kodlin_photo_app.api

import isee.ja.kodlin_photo_app.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

interface PhotoAPI {
    @GET("?8576682-2fff0088b5a297956f084c64f&q=nature&image_type=photo")
    fun getPhotos() : Call<PhotoList>
}
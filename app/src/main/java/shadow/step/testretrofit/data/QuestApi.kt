package shadow.step.testretrofit.data

import io.reactivex.Single
import retrofit2.http.*

interface QuestApi {

    @GET("./getQuestList")
    @Headers("Content-Type: application/json")
    fun getQuestList(): Single<QuestListResponse>

}
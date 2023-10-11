package github.preeti5sharon.githubrepos

import github.preeti5sharon.githubrepos.model.RepoResponseItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RepoService {
    @GET("repos")
    suspend fun getRepos(
        @Query("page") page: Int = 1,
        @Query("per_page") perPage: Int = 5,
    ): Response<List<RepoResponseItem>>
}

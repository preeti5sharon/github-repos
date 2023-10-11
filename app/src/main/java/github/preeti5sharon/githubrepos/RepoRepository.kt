package github.preeti5sharon.githubrepos

class RepoRepository(private val service: RepoService) {
    suspend fun getRepos(page: Int, perPage: Int) = service.getRepos(page, perPage)
}

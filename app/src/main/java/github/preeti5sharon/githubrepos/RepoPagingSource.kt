package github.preeti5sharon.githubrepos

import android.graphics.pdf.PdfDocument.Page
import androidx.paging.PagingSource
import androidx.paging.PagingState
import github.preeti5sharon.githubrepos.model.RepoResponseItem

class RepoPagingSource(private val repoRepository: RepoRepository) :
    PagingSource<Int, RepoResponseItem>() {
    override fun getRefreshKey(state: PagingState<Int, RepoResponseItem>): Int? {
        return null
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, RepoResponseItem> {
        val offset = params.key ?: 0
        val limit = params.loadSize
        val response = repoRepository.getRepos(offset, limit).body()
        return LoadResult.Page(response.orEmpty(), null, offset + 1)
    }
}

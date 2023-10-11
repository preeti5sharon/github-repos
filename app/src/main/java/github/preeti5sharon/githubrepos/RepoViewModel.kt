package github.preeti5sharon.githubrepos

import androidx.lifecycle.ViewModel
import androidx.paging.Pager
import androidx.paging.PagingConfig
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RepoViewModel @Inject constructor(private val repository: RepoRepository) : ViewModel() {
    private val pagingConfig = PagingConfig(5, 5, false, 5)
    fun getRepoList() = Pager(pagingConfig, 1) {
        RepoPagingSource(repository)
    }.flow
}

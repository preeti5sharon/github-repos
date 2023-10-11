package github.preeti5sharon.githubrepos

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import github.preeti5sharon.githubrepos.databinding.FragmentMainBinding
import github.preeti5sharon.githubrepos.model.RepoResponseItem
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainFragment : Fragment(), onClickListener {
    private var binding: FragmentMainBinding? = null
    private val viewModel: RepoViewModel by viewModels()
    private val adapter = RvAdapter(this)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentMainBinding.inflate(inflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycleScope.launch {
            viewModel.getRepoList().collectLatest {
                adapter.submitData(it)
            }
        }
        binding?.recyclerView?.adapter = adapter
    }

    override fun onClickListener(response: RepoResponseItem?) {
        val intent = Intent(Intent.ACTION_VIEW)
        val url = response?.htmlUrl
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}

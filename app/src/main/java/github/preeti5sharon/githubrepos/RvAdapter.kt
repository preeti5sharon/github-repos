package github.preeti5sharon.githubrepos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import github.preeti5sharon.githubrepos.databinding.RvItemBinding
import github.preeti5sharon.githubrepos.model.RepoResponseItem

class RvAdapter(private val itemClick: onClickListener) :
    PagingDataAdapter<RepoResponseItem, RecyclerView.ViewHolder>(RepoListDiffer()) {

    class RepoListDiffer : DiffUtil.ItemCallback<RepoResponseItem>() {
        override fun areItemsTheSame(
            oldItem: RepoResponseItem,
            newItem: RepoResponseItem,
        ): Boolean {
            return newItem === oldItem
        }

        override fun areContentsTheSame(
            oldItem: RepoResponseItem,
            newItem: RepoResponseItem,
        ): Boolean {
            return newItem == oldItem
        }
    }

    class RepoViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = RvItemBinding.bind(holder.itemView)
        val item = getItem(position)
        binding.rvText.text = item?.fullName
        binding.rvText.setOnClickListener {
            itemClick.onClickListener(item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        return RepoViewHolder(view)
    }
}

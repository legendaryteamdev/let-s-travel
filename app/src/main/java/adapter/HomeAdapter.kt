package adapter

import android.content.Intent
import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.legendaryteamdev.derleng.R
import com.legendaryteamdev.derleng.ui.province_detail_activity.ProvinceDetailActivity

class HomeAdapter(private val  mDataset: Array<String>, @param:LayoutRes @field:LayoutRes
private val layout_id: Int) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {



     class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var title: TextView

        init {
            title = v.findViewById(R.id.title)
            v.setOnClickListener {
                var intent = Intent(v.context ,ProvinceDetailActivity()::class.java)
                v.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeAdapter.ViewHolder {
        val vh: RecyclerView.ViewHolder
        val v = LayoutInflater.from(parent.context).inflate(layout_id, parent, false)
        vh = ViewHolder(v)
        return vh
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: HomeAdapter.ViewHolder, position: Int) {
        holder.title.text = mDataset[position]
    }



    override fun getItemCount(): Int {
        return mDataset.size
    }

}
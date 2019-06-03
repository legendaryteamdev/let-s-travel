package adapter

import android.content.Intent
import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.legendaryteamdev.derleng.R
import com.legendaryteamdev.derleng.ui.visiting_place_detail.VisitingPlaceDetail

class DestinyAdapter(private val items: ArrayList<String>, @param:LayoutRes @field:LayoutRes
private val layout_id: Int) : RecyclerView.Adapter<DestinyAdapter.ViewHolder>() {


     class ViewHolder(v: View): RecyclerView.ViewHolder(v) {
        var image: ImageView
        var title: TextView
        var subtitle: TextView
        var lyt_parent: View

        init {
            image = v.findViewById(R.id.image)
            title = v.findViewById(R.id.title)
            subtitle = v.findViewById(R.id.subtitle)
            lyt_parent = v.findViewById(R.id.lyt_parent)

            v.setOnClickListener {
                var intent = Intent(v.context ,VisitingPlaceDetail::class.java)
                v.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vh: RecyclerView.ViewHolder
        val v = LayoutInflater.from(parent.context).inflate(layout_id, parent, false)
        vh = ViewHolder(v)
        return vh
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: DestinyAdapter.ViewHolder, position: Int) {
            val n = items[position]
            holder.title.text = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }

}
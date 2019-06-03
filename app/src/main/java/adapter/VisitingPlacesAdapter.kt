package adapter

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.legendaryteamdev.derleng.R
import com.legendaryteamdev.derleng.ui.visiting_place_detail.VisitingPlaceDetail

class VisitingPlacesAdapter(private val myDataset: Array<String>) :
    RecyclerView.Adapter<VisitingPlacesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): VisitingPlacesAdapter.ViewHolder {
        val v = LayoutInflater.from(p0.context).inflate(R.layout.visiting_places_list, p0, false)
        return VisitingPlacesAdapter.ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return myDataset.size
    }

    override fun onBindViewHolder(holder: VisitingPlacesAdapter.ViewHolder, position: Int) {
        holder.mProvinceName?.text = myDataset[position]
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val mProvinceName = itemView.findViewById<TextView>(R.id.visiting_detail_txt)
        init {
            itemView.setOnClickListener(View.OnClickListener {
                val intent = Intent(itemView.context, VisitingPlaceDetail()::class.java)
                itemView.context.startActivity(intent)
            })
        }
    }

}
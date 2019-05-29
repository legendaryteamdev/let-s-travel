package adapter

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.lets_travel.R
import com.example.lets_travel.ui.province_detail_activity.ProvinceDetailActivity
import com.example.lets_travel.ui.visiting_place_detail.VisitingPlaceDetail

class HomeAdapter(private val myDataset: Array<String>) :
    RecyclerView.Adapter<HomeAdapter.ViewHolder>() {


     class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {

        var name: TextView


        init {
            name = v.findViewById<View>(R.id.name) as TextView
            v.setOnClickListener {
                val intent = Intent(itemView.context, ProvinceDetailActivity()::class.java)
                itemView.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeAdapter.ViewHolder {
        val vh: RecyclerView.ViewHolder
        val v = LayoutInflater.from(parent.context).inflate(R.layout.home_recycler_list, parent, false)
        vh = ViewHolder(v)
        return vh
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: HomeAdapter.ViewHolder, position: Int) {
            holder.name.text = myDataset[position]
            holder.name.setOnClickListener {



        }
    }

    override fun getItemCount(): Int {
        return myDataset.size
    }


}
package adapter

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.lets_travel.ui.province_detail_activity.ProvinceDetailActivity
import com.example.lets_travel.R

const val PROVINCE_NAME = "province_name"

class HomeAdapter(private val myDataset: Array<String>) :
    RecyclerView.Adapter<HomeAdapter.ViewHolder>() {



    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): HomeAdapter.ViewHolder {
        val v = LayoutInflater.from(p0.context).inflate(R.layout.home_recycler_list, p0, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return myDataset.size
    }

    override fun onBindViewHolder(holder: HomeAdapter.ViewHolder, position: Int) {
        holder.mProvinceName?.text = myDataset[position]


    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val mProvinceName = itemView.findViewById<TextView>(R.id.recycler_text)

        init {
            itemView.setOnClickListener(View.OnClickListener {
                val intent = Intent(itemView.context, ProvinceDetailActivity()::class.java)
                intent.putExtra(PROVINCE_NAME , mProvinceName.text)
                itemView.context.startActivity(intent)

            })
        }
    }

}
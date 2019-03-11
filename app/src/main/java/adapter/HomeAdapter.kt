package adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.lets_travel.R

class HomeAdapter(private val myDataset: Array<String>) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textViews = itemView.findViewById<TextView>(R.id.recycler_text)
    }


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): HomeAdapter.ViewHolder {
        val v = LayoutInflater.from(p0?.context).inflate(R.layout.home_recycler_list, p0, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return myDataset.size
    }

    override fun onBindViewHolder(p0: HomeAdapter.ViewHolder, p1: Int) {
            p0?.textViews?.text  = myDataset[p1]
    }

}
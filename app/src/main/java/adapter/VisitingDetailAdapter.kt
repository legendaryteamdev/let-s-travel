package adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lets_travel.R

class VisitingDetailAdapter(private val mDataSet: Array<String>) :

    RecyclerView.Adapter<VisitingDetailAdapter.ViewHolder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val mView = LayoutInflater.from(p0.context).inflate(R.layout.custom_visiting_detail_list, p0, false)
        return ViewHolder(mView)

    }

    override fun getItemCount(): Int {
        return mDataSet.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

}
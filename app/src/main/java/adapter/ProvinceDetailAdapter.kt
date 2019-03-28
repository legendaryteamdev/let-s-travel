package adapter


import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lets_travel.R

class ProvinceDetailAdapter(private val mDataset: Array<String>) :
    RecyclerView.Adapter<ProvinceDetailAdapter.ViewHolder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val mView = LayoutInflater.from(p0.context).inflate(R.layout.province_detail_recycler_list, p0, false)
        return ViewHolder(mView)
    }

    override fun getItemCount(): Int {
        return mDataset.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        init {
//            itemView.setOnClickListener(View.OnClickListener {
//                val intent = Intent(itemView.context, VisitingPlaceDetail()::class.java)
//                itemView.context.startActivity(intent)
//            })
//        }
    }
}
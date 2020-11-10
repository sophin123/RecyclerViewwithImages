import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewui.Model.Places
import com.example.recyclerviewui.R
import com.squareup.picasso.Picasso
import com.squareup.picasso.Target;

class TourAdapter(private val context: Context?, private val arrayPlaces: ArrayList<Places>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_layout, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
      Picasso.get().load(arrayPlaces[position].url).into(holder.itemView.findViewById(R.id.mainImage))
        //Stuck over here help me out
        TODO("Overload resolution ambiguity. All these functions match.")



    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class ViewHolder(v: View?) : RecyclerView.ViewHolder(v!!), View.OnClickListener{
        override fun onClick(v: View?) {
            TODO("Not yet implemented")
        }



    }

}
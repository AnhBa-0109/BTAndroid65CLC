package thigk1.nguyenquockhanh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CongTrinhAdapter extends RecyclerView.Adapter<CongTrinhAdapter.ItemCongTrinhHolder> {
    Context context;
    ArrayList<CongTrinh> dsCongTrinh;

    public CongTrinhAdapter(Context context, ArrayList<CongTrinh> dsCongTrinh) {
        this.context = context;
        this.dsCongTrinh = dsCongTrinh;
    }

    @NonNull
    @Override
    public ItemCongTrinhHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater tho = LayoutInflater.from(context);
        View vItem= tho.inflate(R.layout.item_congtrinh, parent, false);
        ItemCongTrinhHolder viewholderCreated = new ItemCongTrinhHolder(vItem);
        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemCongTrinhHolder holder, int position) {
        CongTrinh CongTrinhHienThi = dsCongTrinh.get(position);

        String mainContent = CongTrinhHienThi.getMaincontent();
        String ngaydang = CongTrinhHienThi.getNgaydang();
        String image = CongTrinhHienThi.getImage();

        holder.tv_maincontent.setText(mainContent);
        holder.tv_ngaydang.setText(ngaydang);

        String packageName = holder.itemView.getContext().getPackageName();
        int imageID = holder.itemView.getResources().getIdentifier(image, "mipmap",packageName);
        holder.imageFile.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return dsCongTrinh.size();
    }
    class ItemCongTrinhHolder extends RecyclerView.ViewHolder{
        TextView tv_maincontent, tv_ngaydang;
        ImageView imageFile;

        public ItemCongTrinhHolder(@NonNull View itemView) {
            super(itemView);
            tv_maincontent = itemView.findViewById(R.id.maincontent);
            tv_ngaydang = itemView.findViewById(R.id.ngaydang);
            imageFile = itemView.findViewById(R.id.image);
        }
    }
}

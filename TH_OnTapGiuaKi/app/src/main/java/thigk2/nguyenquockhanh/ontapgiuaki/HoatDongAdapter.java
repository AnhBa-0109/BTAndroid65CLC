package thigk2.nguyenquockhanh.ontapgiuaki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HoatDongAdapter extends RecyclerView.Adapter<HoatDongAdapter.ItemHoatDongHolder> {
    Context context;
    ArrayList<HoatDong> dsHoatDong;

    public HoatDongAdapter(Context context, ArrayList<HoatDong> dsHoatDong) {
        this.context = context;
        this.dsHoatDong = dsHoatDong;
    }

    @NonNull
    @Override
    public ItemHoatDongHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater tho = LayoutInflater.from(context);
        View vItem= tho.inflate(R.layout.item_hoatdong, parent, false);
        ItemHoatDongHolder viewholderCreated = new ItemHoatDongHolder(vItem);
        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHoatDongHolder holder, int position) {
        HoatDong hoatdongHienThi = dsHoatDong.get(position);

        String mainContent = hoatdongHienThi.getMainContent();
        String subContent = hoatdongHienThi.getSubContent();
        String image = hoatdongHienThi.getImages();

        holder.tv_MainContent.setText(mainContent);
        holder.tv_SubContent.setText(subContent);

        String packageName = holder.itemView.getContext().getPackageName();
        int imageID = holder.itemView.getResources().getIdentifier(image, "mipmap",packageName);
        holder.ImageFile.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return dsHoatDong.size();
    }

    class ItemHoatDongHolder extends RecyclerView.ViewHolder{
        TextView tv_MainContent, tv_SubContent;
        ImageView ImageFile;

        public ItemHoatDongHolder(@NonNull View itemView) {
            super(itemView);
            tv_MainContent = itemView.findViewById(R.id.maincontent);
            tv_SubContent = itemView.findViewById(R.id.subcontent);
            ImageFile = itemView.findViewById(R.id.image);
        }
    }

}

package inggitsemut.submission51gitadiaz;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ListViewHolder>{

    private ArrayList<Song> listSong;

    public SongAdapter(ArrayList<Song> list) {
        this.listSong = list;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_playlist, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Song song = listSong.get(position);

        Glide.with(holder.itemView.getContext())
                .load(song.getImg())
                .apply(new RequestOptions())
                .into(holder.img);

        holder.title.setText(song.getTitle());
        holder.singer.setText(song.getSinger());
    }

    @Override
    public int getItemCount() {
        return listSong.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView title, singer;

        public ListViewHolder (View itemView){
            super(itemView);

            img = itemView.findViewById(R.id.img_song);
            title = itemView.findViewById(R.id.title_song);
            singer = itemView.findViewById(R.id.singer_song);
        }

    }
}

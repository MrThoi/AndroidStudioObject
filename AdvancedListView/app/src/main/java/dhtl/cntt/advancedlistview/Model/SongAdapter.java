package dhtl.cntt.advancedlistview.Model;

import static android.content.ContentValues.TAG;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import dhtl.cntt.advancedlistview.R;

public class SongAdapter extends ArrayAdapter<Song>
{
    private static final String TAG = "SongAdapter";
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private List<Song> mSongs;

    public SongAdapter(Context context, List<Song> objects) {
        super(context, 0, objects);
        mContext = context;
        mSongs = objects;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Song song = mSongs.get(position);
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.row_song, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.tvCode = (TextView) convertView.findViewById(R.id.tv_code);
            viewHolder.tvTitle = (TextView) convertView.findViewById(R.id.tv_title);
            viewHolder.tvLyric = (TextView) convertView.findViewById(R.id.tv_lyric);
            viewHolder.tvArtist = (TextView) convertView.findViewById(R.id.tv_artist);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.tvCode.setText(song.getCode());
        viewHolder.tvTitle.setText(song.getTitle());
        viewHolder.tvLyric.setText(song.getLyric());
        viewHolder.tvArtist.setText(song.getArtist());
        return convertView;
    }

    class ViewHolder {
        private TextView tvCode;
        private TextView tvTitle;
        private TextView tvLyric;
        private TextView tvArtist;
    }
}

package dhtl.cntt.advancedlistview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

import dhtl.cntt.advancedlistview.Model.Song;
import dhtl.cntt.advancedlistview.Model.SongAdapter;

public class MainActivity extends AppCompatActivity {
    private ListView lvSongs;
    private List<Song> mSongs;
    private SongAdapter mSongAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        lvSongs = (ListView) findViewById(R.id.lv_songs);

        // Create song data
        mSongs = new ArrayList<>();
        mSongs.add(new Song("60696", "NẾU EM CÒN TỒN TẠI", "Khi anh bắt đầu 1 tình yêu Là lúc anh tự thay", "Trịnh Đình Quang"));
        mSongs.add(new Song("60701", "NGỐC", "Có rất nhiều những câu chuyện Em dấu riêng mình em biết", "Khắc Việt"));
        mSongs.add(new Song("60650", "HÃY TIN ANH LẦN NỮA", "Dẫu cho ta đã sai khi ở bên nhau Cô yêu thương", "Thiên Dũng"));
        mSongs.add(new Song("60610", "CHUỖI NGÀY VẮNG EM", "Từ khi em bước ra đi cõi lòng anh ngập tràng bao", "Duy Cường"));
        mSongs.add(new Song("60656", "KHI NGƯỜI MÌNH YÊU KHÓC", "Nước mắt em đang rơi trên những ngón tay Nước mắt em", "Phạm Mạnh Quỳnh"));
        mSongs.add(new Song("60685", "MỞ", "Anh mơ gặp em anh mơ được ôm anh mơ được gần", "Trịnh Thăng Bình"));
        mSongs.add(new Song("60752", "TÌNH YÊU CHẮP VÁ", "Muốn đi xa nơi yêu thương mình từng có Để không nghe", "Mr. Siro"));
        mSongs.add(new Song("60608", "CHỜ NGÀY MƯA TAN", "1 ngày mưa và em khuất xa nơi anh bóng dáng cứ", "Trung Đức"));
        mSongs.add(new Song("60603", "CÂU HỎI EM CHƯA TRẢ LỜI", "Cần nơi em 1 lời giải thích thật lòng Đừng lặng im", "Yuki Huy Nam"));
        mSongs.add(new Song("60720", "QUA ĐI LẶNG LẼ", "Đôi khi đến với nhau yêu thương chẳng được lâu nhưng khi", "Phan Mạnh Quỳnh"));
        mSongs.add(new Song("605872", "SAU LỜI TỪ KHƯỚC - REMIX", "Mình à sao đôi ta", "Phan Mạnh Quỳnh"));
        mSongs.add(new Song("60856", "NGƯỜI TA - REMIX", "Chẳng thể nào bằng được người mà trái tim của anh đã chọn, người bấy lâu anh giữ trong lòng", "Marked Singer"));
        mSongs.add(new Song("60856", "QUÊN ANH LÀ ĐIỀU EM KHÔNG THỂ - REMIX", "Cần thêm bao lâu để em quên đi niềm đâu Cần thêm", "Thiện Ngôn"));

        // Create adapter
        mSongAdapter = new SongAdapter(this, mSongs);

        // Set adapter for ListView
        lvSongs.setAdapter(mSongAdapter);
    }
}
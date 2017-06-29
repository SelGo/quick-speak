package selgo.com.quickspeak;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WordListContainer extends AppCompatActivity {

    private String[] titles = EnglishCategory.getWordsCategories();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list_container);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        EnglishWordFragment englishWordFragment =
                (EnglishWordFragment) getFragmentManager().findFragmentById(R.id.english_list_frag);
        int wordId = (int) getIntent().getExtras().get("id");

        switch (wordId) {
            case 0:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#2196F3")));
                getSupportActionBar().setTitle(titles[0]);
                break;
            case 1:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0091EA")));
                getSupportActionBar().setTitle(titles[1]);
                break;
            case 2:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F44336")));
                getSupportActionBar().setTitle(titles[2]);
                break;
            case 3:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#689F38")));
                getSupportActionBar().setTitle(titles[3]);
                break;
            case 4:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#689F38")));
                getSupportActionBar().setTitle(titles[4]);
                break;
            case 5:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#558B2F")));
                getSupportActionBar().setTitle(titles[5]);
                break;
            case 6:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0277BD")));
                getSupportActionBar().setTitle(titles[6]);
                break;
            default:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#039BE5")));
                getSupportActionBar().setTitle(R.string.app_name);
                break;
        }

        englishWordFragment.setWordId(wordId);

    }
}

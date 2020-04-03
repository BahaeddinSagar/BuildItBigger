package ly.bsagar.displayjoke;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import ly.bsagar.displayjoke.databinding.ActivityJokesBinding;

public class JokesActivity extends AppCompatActivity {


    ActivityJokesBinding binding ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityJokesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String joke = intent.getStringExtra("joke");
        binding.textView.setText(joke);
    }
}

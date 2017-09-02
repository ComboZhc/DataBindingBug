
package com.databinding.chao.databindingbug;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.databinding.chao.databindingbug.databinding.ParentLayoutBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ParentLayoutBinding
            binding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.parent_layout, null, false);
        if (binding.hihi == binding.getRoot()) {
            TextView textView = findViewById(R.id.helloworld);
            textView.setText("Bad world");
        }
    }
}

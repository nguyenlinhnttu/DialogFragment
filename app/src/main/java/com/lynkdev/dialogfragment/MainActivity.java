package com.lynkdev.dialogfragment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnShowDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShowDialog = (Button) findViewById(R.id.btn_show_dialog);
        btnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Show Dialog và truyền giá trị vào dialog
                // Các bạn có thể truyền cả object nếu muốn.
                FragmentManager fm = getSupportFragmentManager();
                UserInfoDialog userInfoDialog = UserInfoDialog.newInstance("Nguyễn Văn Linh");
                userInfoDialog.show(fm, null);
            }
        });
    }
}

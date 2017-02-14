package com.lynkdev.dialogfragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by LynkMieu on 2/14/2017.
 */

public class UserInfoDialog extends DialogFragment {
    TextView tvName;
    TextView tvClass;
    TextView tvMSSV;
    Button btnUpdate;
    Button btnClose;

    //Được dùng khi khởi tạo dialog mục đích nhận giá trị
    public static UserInfoDialog newInstance(String data) {
        UserInfoDialog dialog = new UserInfoDialog();
        Bundle args = new Bundle();
        args.putString("data", data);
        dialog.setArguments(args);
        return dialog;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_user_info, container);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // lấy giá trị tự bundle
        String data = getArguments().getString("data", "");
        tvName = (TextView) view.findViewById(R.id.tv_name);
        tvMSSV = (TextView) view.findViewById(R.id.tv_mssv);
        tvClass = (TextView) view.findViewById(R.id.tv_class);
        btnClose = (Button) view.findViewById(R.id.btn_close);
        btnUpdate = (Button) view.findViewById(R.id.btn_update);
        tvName.setText(data);
        tvClass.setText("13DTH02");
        tvMSSV.setText("131151XXX");
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Update clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog().dismiss();
            }
        });
    }

}

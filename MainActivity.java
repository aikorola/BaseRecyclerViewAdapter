package com.cqw.baserecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.cqw.base_adapter.BaseBean;
import com.cqw.base_adapter.BaseRecyclerAdapter;
import com.cqw.base_adapter.BaseViewHolder;
import com.cqw.base_adapter.UserBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        mRecyclerView.setLayoutManager(lm);

        final List<UserBean> data = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            data.add(new UserBean("我是第" + i + "个item"));
        }
        BaseRecyclerAdapter adapter = new BaseRecyclerAdapter(R.layout.main_recycle_item, data) {
            @Override
            protected <T extends BaseBean> void convert(BaseViewHolder holder, T baseBean) {
                UserBean user = (UserBean) baseBean;
//                TextView name = holder.itemView.findViewById(R.id.textView);
//                name.setText(user.getName());
                holder.setText(R.id.textView, user.getName());
            }
        };
        adapter.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Log.i(TAG, "onItemClick: " + data.get(position).getName());
                ToastUtils.showToast("单击：" + data.get(position).getName());
            }
        });
        adapter.setOnItemLongClickListener(new BaseRecyclerAdapter.OnItemLongClickListener() {
            @Override
            public void onItemLongClick(View v, int position) {
                Log.i(TAG, "onItemLongClick: " + data.get(position).getName());
                ToastUtils.showToast("长按：" + data.get(position).getName());
            }
        });
        mRecyclerView.setAdapter(adapter);
    }

}

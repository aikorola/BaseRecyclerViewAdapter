# BaseRecyclerViewAdapter
# 使用

```Java
        BaseRecyclerAdapter adapter = new BaseRecyclerAdapter(R.layout.main_recycle_item, data) {
            @Override
            protected <T extends BaseBean> void convert(BaseViewHolder holder, T baseBean) {
                UserBean user = (UserBean) baseBean;
                // TextView name = holder.itemView.findViewById(R.id.textView);
                // name.setText(user.getName());
                holder.setText(R.id.textView, user.getName());
            }
        };
        adapter.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Log.i(TAG, "onItemClick: " + data.get(position).getName());
            }
        });
        adapter.setOnItemLongClickListener(new BaseRecyclerAdapter.OnItemLongClickListener() {
            @Override
            public void onItemLongClick(View v, int position) {
                Log.i(TAG, "onItemLongClick: " + data.get(position).getName());
            }
        });
        mRecyclerView.setAdapter(adapter);
```

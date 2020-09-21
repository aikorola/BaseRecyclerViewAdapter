# BaseRecyclerViewAdapter
# 使用

```Kotlin
        // for activity
        val data = mutableListOf<UserInfo>()

        (1..100).forEach { data.add(UserInfo("张三$it", it)) }

        userRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        userRecyclerView.adapter = UserAdapter(data)
        
        
        
        // for adapter
        class UserAdapter(val data: MutableList<UserInfo>) : BaseRecyclerAdapter<UserInfo>(android.R.layout.activity_list_item, data) {
                override fun <T : Any?> convert(holder: BaseViewHolder?, baseBean: T) {
                        if (holder == null) return
                        val userInfo = baseBean as UserInfo
                        holder.setText(android.R.id.text1, userInfo.userName)
                }
        }
```

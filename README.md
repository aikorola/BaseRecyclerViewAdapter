# BaseRecyclerViewAdapter
# 使用

```Kotlin
        val data = mutableListOf<UserInfo>()

        (1..100).forEach { data.add(UserInfo("张三$it", it)) }

        userRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        userRecyclerView.adapter = UserAdapter(data)
```

# BaseRecyclerViewAdapter
# 使用

```Kotlin
        val data = mutableListOf<UserInfo>()

        (1..100).forEach {
            val value = it.plus(1)
            data.add(UserInfo("张三$value", value))
        }

        userRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        userRecyclerView.adapter = UserAdapter(data)
```

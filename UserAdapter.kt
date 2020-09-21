package com.testAdapter

import com.example.v6v10_adapter.baseAdapter.BaseRecyclerAdapter
import com.example.v6v10_adapter.baseAdapter.BaseViewHolder

class UserAdapter(val data: MutableList<UserInfo>) : BaseRecyclerAdapter<UserInfo>(android.R.layout.activity_list_item, data) {
    override fun <T : Any?> convert(holder: BaseViewHolder?, baseBean: T) {
        if (holder == null) return
        val userInfo = baseBean as UserInfo
        holder.setText(android.R.id.text1, userInfo.userName)
    }
}
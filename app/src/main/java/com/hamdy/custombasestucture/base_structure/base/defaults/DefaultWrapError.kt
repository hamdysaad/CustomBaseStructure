package com.hamdy.custombasestucture.base_structure.base.defaults

import android.content.Context
import android.view.*
import androidx.databinding.DataBindingUtil
import com.hamdy.custombasestucture.R
import com.hamdy.custombasestucture.base_structure.base.base_activity.IWrapError
import com.hamdy.custombasestucture.base_structure.base.base_activity.OnRetryClick
import com.hamdy.custombasestucture.databinding.DefaultErrorLayoutBinding

class DefaultWrapError(val context: Context , val retryText : String? ="Retry") : IWrapError {

    private var databinding: DefaultErrorLayoutBinding? = null

    var layoutId : Int = R.layout.default_error_layout

    override fun addErrorView(root: ViewGroup?, msge: String?, onRetryClick: OnRetryClick) {
        databinding =  DataBindingUtil.bind(LayoutInflater.from(context).inflate(layoutId , null) )
        root?.removeAllViews()
        databinding?.text = msge
        databinding?.tryAgainText = retryText
        databinding?.iTryClick = onRetryClick
        root?.addView(databinding?.root)
    }
}
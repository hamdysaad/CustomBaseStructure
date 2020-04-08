package com.hamdy.custombasestucture.base_structure.base.base_activity
import android.view.ViewGroup
interface IWrapError {

    fun addErrorView(root: ViewGroup?, msge: String?, onRetryClick: OnRetryClick)
}
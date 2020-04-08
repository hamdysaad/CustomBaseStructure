package com.hamdy.custombasestucture.base_structure.data.source.remote



abstract class BaseResponseModel{

   abstract fun getSuccess() : Any?
   abstract fun getError() : String?
}
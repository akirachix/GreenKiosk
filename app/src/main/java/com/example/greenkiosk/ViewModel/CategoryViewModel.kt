package com.example.greenkiosk.ViewModel

import androidx.lifecycle.MutableLiveData
import com.example.greenkiosk.Models.CategoriesResponse
import com.example.greenkiosk.Repository.CategoryRepository

class CategoryViewModel {
    var registrationLiveData = MutableLiveData<CategoriesResponse>()
    var regError = MutableLiveData<String>()
    var categoryRepository = CategoryRepository()
}
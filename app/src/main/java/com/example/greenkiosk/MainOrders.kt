package com.example.greenkiosk

import android.content.ClipData
import android.os.Bundle
import android.view.View.inflate
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.core.content.res.ComplexColorCompat.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.greenkiosk.R.id.updateFragment
import com.example.greenkiosk.R.id.updateOrders

import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlin.properties.ReadOnlyProperty

abstract class MainOrders : AppCompatActivity() {
    abstract val position: Any
    abstract val bottomNavView: BottomNavigationView
    lateinit var navController: NavController
    lateinit var binding: MainOrders
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupViews()
    }

    fun setupViews() : Any {
        val bottomNavView: BottomNavigationView = binding.bottomNavView;
        navController = Navigation.findNavController(this@MainOrders,R.id.updateOrders)
        NavigationUI.setupWithNavController(bottomNavView,navController)
        when (position) {
            1 -> return PendingOrder()
            2 -> return CompleteOrders()
        }
        return UpdateOrders()
    }
}
//    class ItemViewModel : ViewModel() {
//        private val mutableSelectedItem = MutableLiveData<ClipData.Item>()
//        val selectedItem: LiveData<ClipData.Item> get() = mutableSelectedItem
//
//        fun selectItem(item: ClipData.Item) {
//            mutableSelectedItem.value = item
//        }
//    }
//
//    private val viewModel: ItemViewModel by viewModels()
//        override fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)
//            viewModel.selectedItem.observe(this, Observer { item ->
//            })
//        }
//}
//    private val viewModel: MainOrders.ItemViewModel by activityViewModels()
//
//    fun activityViewModels(): ReadOnlyProperty<Nothing? , MainOrders.ItemViewModel> {
//        fun onCreate(savedInstanceState: Bundle?) {
////            setContentView(R.layout.activity_complete_orders)
//            return
//        }
//
//        fun onItemClicked(item: ClipData.Item) {
//            viewModel(updateFragment)
//        }
//        return (updateOrders)
//    }
package com.example.greenkiosk

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.annotation.Nullable
import androidx.navigation.Navigation


class PendingOrder : Fragment() , View.OnClickListener {
    var gotoFragment2: Button? = null
    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @Nullable
    override fun onCreateView(
        inflater: LayoutInflater ,
        @Nullable container: ViewGroup? ,
        @Nullable savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_update_orders , container , false)
        gotoFragment2 = view.findViewById(R.id.pendingOrder)
        return view
    }

    override fun onClick(view: View) {
        Navigation.findNavController(view).navigate(R.id.pendingOrder)
    }
}
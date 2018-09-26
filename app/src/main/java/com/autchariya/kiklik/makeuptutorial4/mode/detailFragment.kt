//package com.autchariya.kiklik.makeuptutorial4.mode
//
//
//import android.os.Bundle
//import android.support.v4.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//
//import com.autchariya.kiklik.makeuptutorial4.R
//import com.autchariya.kiklik.makeuptutorial4.dialog.SelectDialog
//import kotlinx.android.synthetic.main.fragment_mode1.*
//
//// TODO: Rename parameter arguments, choose names that match
//// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"
//
///**
// * A simple [Fragment] subclass.
// *
// */
//class detailFragment : Fragment() {
//
//    var TexeTu1 : String = "แต่งหน้าสวยเปรี้ยว"
//    var TexeTu2 : String = "แต่งหน้าสวยเหวาน"
//    var TexeTu3 : String = "แต่งหน้าสวยแซ่บ"
//
//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
//                              savedInstanceState: Bundle?): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_detail, container, false)
//    }
//
////    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
////        super.onViewCreated(view, savedInstanceState)
////
////        btn_tutorial.setOnClickListener { Dialog1()}
////        btn_tutorial1.setOnClickListener { Dialog2() }
////        btn_tutorial2.setOnClickListener { Dialog3() }
////
////    }
//
//
//    private fun Dialog1() {
//        SelectDialog.newInstance(TexeTu1).show(fragmentManager, "select")
//
//    }
//    private fun Dialog2() {
//
//        SelectDialog.newInstance(TexeTu2).show(fragmentManager, "select")
//    }
//    private fun Dialog3() {
//
//        SelectDialog.newInstance(TexeTu3).show(fragmentManager, "select")
//    }
//
//}

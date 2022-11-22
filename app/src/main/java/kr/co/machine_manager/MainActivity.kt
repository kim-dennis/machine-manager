package kr.co.machine_manager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)   //액션바 업버튼 visible
    }

    /**
     * 액션바 업버튼 실행
     */
    override fun onSupportNavigateUp(): Boolean {

        /**
         * 액션바 업버튼 전처리
         */
        Log.d("onSupportNavigateUp", "up button click")

        onBackPressed()
        return super.onSupportNavigateUp()
    }
}

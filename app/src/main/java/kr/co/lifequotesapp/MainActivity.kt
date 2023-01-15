package kr.co.lifequotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import kr.co.lifequotesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menuList = mutableListOf<String>()
        menuList.add("닭볶음탕")
        menuList.add("삼겹살")
        menuList.add("불닭볶음면")
        menuList.add("짜장면")
        menuList.add("탕수육")
        menuList.add("파스타")
        menuList.add("곱창")
        menuList.add("치킨")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAll.setOnClickListener {

            val intent = Intent(this, SentenceActivity::class.java)

            startActivity(intent)
        }

        binding.menuTextSpace.setText(menuList.random())
    }
}
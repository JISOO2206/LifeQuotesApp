package kr.co.lifequotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.databinding.DataBindingUtil
import kr.co.lifequotesapp.databinding.ActivityMainBinding

class SentenceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val menuList = mutableListOf<String>()
        menuList.add("닭볶음탕")
        menuList.add("삼겹살")
        menuList.add("불닭볶음면")
        menuList.add("짜장면")
        menuList.add("탕수육")
        menuList.add("파스타")
        menuList.add("곱창")
        menuList.add("치킨")

        val menuAdapter = ListViewAdapter(menuList)

        val listViw = findViewById<ListView>(R.id.menuListView)

        listViw.adapter = menuAdapter

    }
}
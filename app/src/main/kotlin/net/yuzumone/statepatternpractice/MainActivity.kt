package net.yuzumone.statepatternpractice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import net.yuzumone.statepatternpractice.fragment.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fragment = MainFragment()
        supportFragmentManager.beginTransaction().add(android.R.id.content, fragment).commit()
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount != 0) {
            supportFragmentManager.popBackStack()
        } else {
            super.onBackPressed()
        }
    }
}

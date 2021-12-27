package com.hareshnayak.azurelock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hareshnayak.azurelock.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val button = binding.lockButton
        val lockState = binding.lockState
        val lockImage = binding.lockImage



        button.setOnClickListener{
            if(lockState.text == getString(R.string.lockStateLock)){
                button.text = getString(R.string.buttonPress2Lock)
                lockState.text = getString(R.string.lockStateOpen)
                lockImage.setImageResource(R.drawable.ic_launcher_background)
            }
            else {
                button.text = getString(R.string.buttonPress2Unlock)
                lockState.text = getString(R.string.lockStateLock)
                lockImage.setImageResource(R.drawable.ic_launcher_foreground)
            }
        }
    }
}
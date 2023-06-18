package com.example.b58

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.b58.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculate.setOnClickListener { calculateM() }
    }

    private fun calculateM()
    {


            var mem1 = binding.firstTextView.text.toString().toDouble()
            if (binding.firstMem.text.isNotEmpty()) {
                mem1 = binding.firstMem.text.toString().toDouble()
                binding.firstMem.setText("")
            }

            var mem2 = binding.secondTextView.text.toString().toDouble()
            if (binding.secondMem.text.isNotEmpty()) {
                mem2 = binding.secondMem.text.toString().toDouble()
                binding.secondMem.setText("")
            }

            var mem3 = binding.thirdTextView.text.toString().toDouble()
            if (binding.thirdMem.text.isNotEmpty()) {
                mem3 = binding.thirdMem.text.toString().toDouble()
                binding.thirdMem.setText("")
            }

            var mem4 = binding.fourthTextView.text.toString().toDouble()
            if (binding.fourthMem.text.isNotEmpty()) {
                mem4 = binding.fourthMem.text.toString().toDouble()
                binding.fourthMem.setText("")
            }

        binding.firstTextView.text = mem1.toString()
        binding.secondTextView.text = mem2.toString()
        binding.thirdTextView.text = mem3.toString()
        binding.fourthTextView.text = mem4.toString()



                val first = when (binding.firstRg.checkedRadioButtonId)
                {
                    R.id.first_rg_1->mem1
                    R.id.first_rg_2->mem2
                    R.id.first_rg_3->mem3
                    R.id.first_rg_4->mem4
                    else -> mem1
                }

                val second = when (binding.secondRg.checkedRadioButtonId)
                {
                    R.id.second_rg_1->mem1
                    R.id.second_rg_2->mem2
                    R.id.second_rg_3->mem3
                    R.id.second_rg_4->mem4
                    else -> mem1
                }

                val third = when (binding.thirdRg.checkedRadioButtonId)
                {
                    R.id.third_rg_1->first+second
                    R.id.third_rg_2->first-second
                    R.id.third_rg_3->first*second
                    R.id.third_rg_4->first/second
                    else -> 0.0
                }
                when (binding.fourthRg.checkedRadioButtonId)
                {
                    R.id.fourth_rg_1-> mem1 = third
                    R.id.fourth_rg_2-> mem2 = third
                    R.id.fourth_rg_3-> mem3 = third
                    R.id.fourth_rg_4-> mem4 = third
                    else -> mem1 = third
                }

        binding.firstTextView.text = mem1.toString()
        binding.secondTextView.text = mem2.toString()
        binding.thirdTextView.text = mem3.toString()
        binding.fourthTextView.text = mem4.toString()


    }
}
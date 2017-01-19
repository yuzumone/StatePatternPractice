package net.yuzumone.statepatternpractice.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.yuzumone.statepatternpractice.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        initView()
        return binding.root
    }

    fun initView() {
        binding.buttonConnection.setOnClickListener {
            val fragment = ConnectionFragment()
            fragmentManager.beginTransaction().replace(android.R.id.content, fragment)
                    .addToBackStack(null).commit()
        }
        binding.buttonRest.setOnClickListener {
            val fragment = RestFragment()
            fragmentManager.beginTransaction().replace(android.R.id.content, fragment)
                    .addToBackStack(null).commit()
        }
        binding.buttonRouting.setOnClickListener {
            val fragment = RoutingFragment()
            fragmentManager.beginTransaction().replace(android.R.id.content, fragment)
                    .addToBackStack(null).commit()
        }
        binding.buttonMonitor.setOnClickListener {
            val fragment = MonitorFragment()
            fragmentManager.beginTransaction().replace(android.R.id.content, fragment)
                    .addToBackStack(null).commit()
        }
        binding.buttonPriority.setOnClickListener {
            val fragment = PriorityFragment()
            fragmentManager.beginTransaction().replace(android.R.id.content, fragment)
                    .addToBackStack(null).commit()
        }
        binding.buttonBandwidth.setOnClickListener {
            val fragment = BandwidthFragment()
            fragmentManager.beginTransaction().replace(android.R.id.content, fragment)
                    .addToBackStack(null).commit()
        }
        binding.buttonCooperated.setOnClickListener {
            val fragment = CooperatedFragment()
            fragmentManager.beginTransaction().replace(android.R.id.content, fragment)
                    .addToBackStack(null).commit()
        }
    }
}
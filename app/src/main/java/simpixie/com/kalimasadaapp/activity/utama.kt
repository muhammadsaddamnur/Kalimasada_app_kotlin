package simpixie.com.kalimasadaapp.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.design.internal.BottomNavigationItemView
import android.support.design.internal.BottomNavigationMenuView
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import junit.framework.Test
import kotlinx.android.synthetic.main.activity_utama.*
import simpixie.com.kalimasadaapp.*
import java.util.ArrayList
import ss.com.bannerslider.banners.Banner
import ss.com.bannerslider.banners.RemoteBanner
import ss.com.bannerslider.views.BannerSlider
import java.util.logging.Logger

class utama : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                val berandafg = beranda_fg()
                // Get the support fragment manager instance
                val manager = supportFragmentManager
                // Begin the fragment transition using support fragment manager
                val transaction = manager.beginTransaction()
                // Replace the fragment on container
                transaction.replace(R.id.container,berandafg)
                transaction.addToBackStack(null)
                // Finishing the transition
                transaction.commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_pesanan -> {
                val pesananfg = pesanan_fg()
                // Get the support fragment manager instance
                val manager = supportFragmentManager
                // Begin the fragment transition using support fragment manager
                val transaction = manager.beginTransaction()
                // Replace the fragment on container
                transaction.replace(R.id.container,pesananfg)
                transaction.addToBackStack(null)
                // Finishing the transition
                transaction.commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                val notifikasifg = notifikasi_fg()
                // Get the support fragment manager instance
                val manager = supportFragmentManager
                // Begin the fragment transition using support fragment manager
                val transaction = manager.beginTransaction()
                // Replace the fragment on container
                transaction.replace(R.id.container,notifikasifg)
                transaction.addToBackStack(null)
                // Finishing the transition
                transaction.commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_favorite -> {
                val disukaifg = disukai_fg()
                // Get the support fragment manager instance
                val manager = supportFragmentManager
                // Begin the fragment transition using support fragment manager
                val transaction = manager.beginTransaction()
                // Replace the fragment on container
                transaction.replace(R.id.container,disukaifg)
                transaction.addToBackStack(null)
                // Finishing the transition
                transaction.commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_account -> {
                val akunfg = akun_fg()
                // Get the support fragment manager instance
                val manager = supportFragmentManager
                // Begin the fragment transition using support fragment manager
                val transaction = manager.beginTransaction()
                // Replace the fragment on container
                transaction.replace(R.id.container,akunfg)
                transaction.addToBackStack(null)
                // Finishing the transition
                transaction.commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_utama)

//        val bannerSlider = findViewById(R.id.banner_slider1) as BannerSlider
//        val banners = ArrayList<Banner>()
//        //add banner using image url
//        banners.add(RemoteBanner("https://2.bp.blogspot.com/-FmWjzrULjYw/Vhpq8pW1fhI/AAAAAAAAB_k/t_HFSSzDyUM/s1600/Membuat%2Bkelas%2BDataKaryawan%2Bdi%2Bpaket%2Bpertemuan2%2B-%2Blab%2Bjava%2Bpetani%2Bkode.png"))
//        banners.add(RemoteBanner("https://1.bp.blogspot.com/-SZK84ux2_ic/VhpyyY7R3eI/AAAAAAAAB_0/BC6M4FtlG0s/s1600/Hasil%2Boutput%2Bprogram%2BDataKaryawan%2B-%2Blab%2Bjava%2Bpetani%2Bkode.png"))
//        //add banner using resource drawable
//        //.add(new DrawableBanner(R.drawable.yourDrawable));
//        bannerSlider.setBanners(banners)




        val berandafg = beranda_fg()
        // Get the support fragment manager instance
        val manager = supportFragmentManager
        // Begin the fragment transition using support fragment manager
        val transaction = manager.beginTransaction()
        // Replace the fragment on container
        transaction.replace(R.id.container,berandafg)
        transaction.addToBackStack(null)
        // Finishing the transition
        transaction.commit()


        navigation.disableShiftMode()

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }


    @SuppressLint("RestrictedApi")
    private fun BottomNavigationView.disableShiftMode() {
        val menuView = getChildAt(0) as BottomNavigationMenuView
        try {
            val shiftingMode = menuView::class.java.getDeclaredField("mShiftingMode")
            shiftingMode.isAccessible = true
            shiftingMode.setBoolean(menuView, false)
            shiftingMode.isAccessible = false
            for (i in 0 until menuView.childCount) {
                val item = menuView.getChildAt(i) as BottomNavigationItemView
                item.setShiftingMode(false)
                // set once again checked value, so view will be updated
                item.setChecked(item.itemData.isChecked)
            }
        } catch (e: NoSuchFieldException) {
            Logger.getLogger(Test::class.java.name).warning("Unable to get shift mode field")
        } catch (e: IllegalStateException) {
            Logger.getLogger(Test::class.java.name).warning("Unable to change value of shift mode")
        }
    }

}

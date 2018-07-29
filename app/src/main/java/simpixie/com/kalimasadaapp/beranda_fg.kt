package simpixie.com.kalimasadaapp


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ss.com.bannerslider.banners.Banner
import ss.com.bannerslider.banners.RemoteBanner
import ss.com.bannerslider.views.BannerSlider
import java.util.ArrayList


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class beranda_fg : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_beranda_fg, container, false)
        val bannerSlider = view!!.findViewById<BannerSlider>(R.id.banner_slider1)

        //val bannerSlider = findViewById(R.id.banner_slider1) as BannerSlider
        val banners = ArrayList<Banner>()
        //add banner using image url
        banners.add(RemoteBanner("https://2.bp.blogspot.com/-FmWjzrULjYw/Vhpq8pW1fhI/AAAAAAAAB_k/t_HFSSzDyUM/s1600/Membuat%2Bkelas%2BDataKaryawan%2Bdi%2Bpaket%2Bpertemuan2%2B-%2Blab%2Bjava%2Bpetani%2Bkode.png"))
        banners.add(RemoteBanner("https://1.bp.blogspot.com/-SZK84ux2_ic/VhpyyY7R3eI/AAAAAAAAB_0/BC6M4FtlG0s/s1600/Hasil%2Boutput%2Bprogram%2BDataKaryawan%2B-%2Blab%2Bjava%2Bpetani%2Bkode.png"))
        //add banner using resource drawable
        //.add(new DrawableBanner(R.drawable.yourDrawable));
        bannerSlider!!.setBanners(banners)

        return view
    }


}

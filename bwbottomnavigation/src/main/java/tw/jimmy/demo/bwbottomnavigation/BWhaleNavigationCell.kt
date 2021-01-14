package tw.jimmy.demo.bwbottomnavigation

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import androidx.databinding.DataBindingUtil
import tw.jimmy.demo.bwbottomnavigation.databinding.BwhaleNavigationCellBinding

class BWhaleNavigationCell
    @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttrs: Int):
    RelativeLayout(context, attrs, defStyleAttrs) {

        private val binding = DataBindingUtil.inflate<BwhaleNavigationCellBinding>(
            LayoutInflater.from(context),
            R.layout.bwhale_navigation_cell,
            this,
            true
        )



}
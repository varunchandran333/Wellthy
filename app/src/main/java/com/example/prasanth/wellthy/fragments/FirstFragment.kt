package com.example.prasanth.wellthy.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import com.example.prasanth.wellthy.R


class FirstFragment : Fragment() {
    var windowwidth: Int = 0
    var screenCenter: Int = 0
    internal var Likes = 0
    private var x: Int = 0
    private var y: Int = 0
    var mainRelativeLayout: RelativeLayout? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        windowwidth = activity!!.getWindowManager().getDefaultDisplay().getWidth()
        screenCenter = windowwidth / 2
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        mainRelativeLayout = view.findViewById(R.id.draggable) as RelativeLayout

        onCreateDynamicView()
    }


    fun onCreateDynamicView() {
        var j = 8;
        for (i in 1..8) {

            j--;
            val inflate = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

            val containerView = inflate.inflate(R.layout.tinderview, null)


            val relativeLayoutContainer = containerView!!.findViewById(R.id.relative_container) as RelativeLayout
            val textViewContainer = containerView!!.findViewById(R.id.txt_view) as TextView
            textViewContainer.text = j.toString()
            val layoutParams = RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT)

            containerView!!.setLayoutParams(layoutParams)
            containerView!!.setTag(i)
            mainRelativeLayout!!.addView(containerView)

            relativeLayoutContainer!!.setOnTouchListener(object : View.OnTouchListener {
                override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                    var x_cord = event!!.getRawX().toInt()
                    var y_cord = event!!.getRawY().toInt()

                    containerView.setX(0f)
                    containerView.setY(0f)

                    when (event.getAction()) {
                        MotionEvent.ACTION_DOWN -> {
                            Log.e("XACTION", "ACTION_DOWN")
                            x = event.getX().toInt()
                            y = event.getY().toInt()


                            Log.v("On touch", x.toString() + " " + y)
                        }
                        MotionEvent.ACTION_MOVE -> {
                            Log.e("XACTION", "ACTION_MOVE")
                            x_cord = event.getRawX().toInt()
                            // smoother animation.
                            y_cord = event.getRawY().toInt()

                            containerView.setX((x_cord - (x * 1.5)).toFloat())
                            containerView.setY((y_cord - (y * 1.5)).toFloat())


                            if (x_cord >= screenCenter) {
                                containerView.setRotation((((x_cord - screenCenter) * (Math.PI / 32)).toFloat()));
                                if (x_cord > screenCenter + screenCenter / 2) {
                                    if (x_cord > windowwidth - screenCenter / 4) {
                                        Likes = 2
                                    } else {
                                        Likes = 0
                                    }
                                } else {
                                    Likes = 0
                                }
                            } else {
                                // rotate image while moving
                                containerView.setRotation((((x_cord - screenCenter) * (Math.PI / 32)).toFloat()));
                                if (x_cord < screenCenter / 2) {

                                    if (x_cord < screenCenter / 4) {
                                        Likes = 1
                                    } else {
                                        Likes = 0
                                    }
                                } else {
                                    Likes = 0

                                }

                            }
                        }
                        MotionEvent.ACTION_UP -> {
                            Log.e("XACTION", "ACTION_UP")
                            x_cord = event.getRawX().toInt()
                            y_cord = event.getRawY().toInt()

                            Log.e("X Point", "$x_cord , Y $y_cord")


                            if (Likes == 0) {
                                Toast.makeText(context, "NOTHING", Toast.LENGTH_SHORT).show()
                                Log.e("Event_Status :-> ", "Nothing")
                                containerView.setX(0f)
                                containerView.setY(0f)
                                containerView.setRotation(0f)
                            } else if (Likes == 1) {
                                Toast.makeText(context, "UNLIKE", Toast.LENGTH_SHORT).show()
                                Log.e("Event_Status :-> ", "UNLIKE")
                                mainRelativeLayout!!.removeView(containerView)
                            } else if (Likes == 2) {
                                Toast.makeText(context, "LIKED", Toast.LENGTH_SHORT).show()
                                Log.e("Event_Status :-> ", "Liked")
                                mainRelativeLayout!!.removeView(containerView)
                            }
                        }
                        else -> {
                        }
                    }
                    return true
                }

            })

        }

    }


}
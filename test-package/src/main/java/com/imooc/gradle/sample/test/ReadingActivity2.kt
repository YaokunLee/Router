package com.imooc.gradle.sample.test

import android.app.Activity
import com.imooc.router.annotations.Destination

@Destination(
        url = "router://reading2",
        description = "阅读页"
)
class ReadingActivity2 : Activity() {

}
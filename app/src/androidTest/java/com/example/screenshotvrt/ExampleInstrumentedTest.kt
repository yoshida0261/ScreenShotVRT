package com.example.screenshotvrt

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.internal.platform.util.TestOutputEmitter.takeScreenshot
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        //assertEquals("com.example.screenshotvrt", appContext.packageName)

        ActivityScenario.launch(MainActivity::class.java)
        takeScreenshot("MainActivity")
    }
}
# example-anko-kotlin-android

####Step to Create a Kotlin Android Project
1. New project with Android Studio. (My Android Studio version is 2.1.3 )
2. Install Kotlin plugin. (Android Studio -> Preferences -> Plugins -> Browse Repositories)
3. Open MainActivity.java file. Then press "CMD + Shift + A" and typing "Convert Java File to Kotlin File" to convert class.
4. Press "CMD + Shift + A" and typing "Configuring Kotlin in the project" to automatically convert configuration in gradle file
5. Click "Sync Now" in gradle

Read more : https://kotlinlang.org/docs/tutorials/kotlin-android.html

####Reducing "findViewById" with Kotlin extension
1. Add dependency 'classpath "org.jetbrains.kotlin:kotlin-android-extensions:$kotlin_version" ' into your project build.gradle
2. Enable the Android Extensions Gradle plugin in your module build.gradle file with "apply plugin: 'kotlin-android-extensions' "
3. Add "import kotlinx.android.synthetic.main.activity_main.*" in Activity class according to your UI xml name (I use activity_main for MainActivity class)
4. Example, you can set text in Activity with 'this.text_main1.setText(“”)'. (given <TextView android:id="@+id/text_main1 />")

Read more : https://kotlinlang.org/docs/tutorials/android-plugin.html

####Using Anko('s IntelliJ) to help program UI
1. Add gradle dependencies on our build.gradle with "compile 'org.jetbrains.anko:anko-sdk23:0.9'"
2. Example, you can go to other activity with "startActivity(intentFor<Main2Activity>())"
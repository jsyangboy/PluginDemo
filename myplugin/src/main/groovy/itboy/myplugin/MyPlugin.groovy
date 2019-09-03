package itboy.myplugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * 插件
 */
class MyPlugin implements Plugin<Project> {

    final static String TAG = "MyPlugin : ";

    @Override
    void apply(Project project) {
        /**
         * 这里没有做任何处理，仅仅是打印
         */
        System.out.println(TAG + "start ")
        System.out.println(TAG + "hello my gradle plugin")
        System.out.println(TAG + "end")
    }
}

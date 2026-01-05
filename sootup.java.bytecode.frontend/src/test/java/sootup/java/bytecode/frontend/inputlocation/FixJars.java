package sootup.java.bytecode.frontend.inputlocation;

import categories.TestCategories;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import sootup.java.core.views.JavaView;

public class FixJars extends BaseFixJarsTest {

@Test
public void executetribuoregressionlibsvmjar(){
	String jarDownloadUrl = "https://repo1.maven.org/maven2/org/tribuo/tribuo-regression-libsvm/4.3.2/tribuo-regression-libsvm-4.3.2.jar";
    String methodSignature = "";
    JavaView javaView = supplyJavaView(jarDownloadUrl);
    assertMethodConversion(javaView,methodSignature);
    assertJar(javaView);
}

}
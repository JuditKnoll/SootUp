package sootup.java.bytecode.frontend.inputlocation;

import categories.TestCategories;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import sootup.java.core.views.JavaView;

public class FixJars extends BaseFixJarsTest {

@Test
public void executescalazmetricsjar(){
	String jarDownloadUrl = "https://repo1.maven.org/maven2/dev/zio/scalaz-metrics_2.11/0.0.1/scalaz-metrics_2.11-0.0.1.jar";
    String methodSignature = "<zio.metrics.VoidZ$: boolean equals$extension(scala.runtime.BoxedUnit,java.lang.Object)>";
    JavaView javaView = supplyJavaView(jarDownloadUrl);
    assertMethodConversion(javaView,methodSignature);
    assertJar(javaView);
}

}
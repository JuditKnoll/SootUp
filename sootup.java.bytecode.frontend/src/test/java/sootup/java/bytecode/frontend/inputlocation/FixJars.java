package sootup.java.bytecode.frontend.inputlocation;

import categories.TestCategories;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import sootup.java.core.views.JavaView;

public class FixJars extends BaseFixJarsTest {

@Test
public void executejtransccorejar(){
	String jarDownloadUrl = "https://repo1.maven.org/maven2/com/jtransc/jtransc-core/0.6.8/jtransc-core-0.6.8.jar";
    String methodSignature = "<com.jtransc.backend.asm1.BasicBlockBuilder: com.jtransc.backend.asm1.BasicBlock call(com.jtransc.org.objectweb.asm.tree.AbstractInsnNode,com.jtransc.backend.asm1.BasicBlock$Frame)>";
    JavaView javaView = supplyJavaView(jarDownloadUrl);
    assertMethodConversion(javaView,methodSignature);
    assertJar(javaView);
}

}
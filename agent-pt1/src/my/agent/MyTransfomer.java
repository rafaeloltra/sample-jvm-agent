package my.agent;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

/**
 * Dummy sample ClassFileTransformer
 * @author rafael oltra
 *
 */

public class MyTransfomer implements ClassFileTransformer {

	@Override
	public byte[] transform(ClassLoader loader, String className,
			Class<?> klass, ProtectionDomain domain, byte[] klassFileBuffer)
			throws IllegalClassFormatException {
		System.out.println(className + " is about to get loaded by the ClassLoader");

		return null;
	}

}

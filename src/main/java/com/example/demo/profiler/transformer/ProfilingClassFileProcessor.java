package com.example.demo.profiler.transformer;


import de.icongmbh.oss.maven.plugin.javassist.ClassTransformer;
import javassist.CtClass;

public class ProfilingClassFileProcessor extends ClassTransformer {

    private ProfilingClassFileTransformer transformer = new ProfilingClassFileTransformer();

    protected void applyTransformations(CtClass classToTransform) throws Exception {
        transformer.applyTransformations(classToTransform, classToTransform.getName());
    }

    protected boolean filter(CtClass candidateClass) throws Exception {
        return true;
    }
}

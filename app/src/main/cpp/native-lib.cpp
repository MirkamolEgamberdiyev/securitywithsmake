#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring

JNICALL
Java_com_mirkamol_securitywithcimake_MainActivity_stringFromJNI(JNIEnv *env, jobject object) {
    std::string hello = "Hello from Mirkamol";
    return env->NewStringUTF(hello.c_str());
}
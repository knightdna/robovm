#ifndef ROBOVM_ATTRIBUTE_H
#define ROBOVM_ATTRIBUTE_H

extern jboolean nvmInitAttributes(Env* env);
extern Class* nvmAttributeGetDeclaringClass(Env* env, Class* clazz);
extern Class* nvmAttributeGetEnclosingClass(Env* env, Class* clazz);
extern Method* nvmAttributeGetEnclosingMethod(Env* env, Class* clazz);
extern jboolean nvmAttributeIsAnonymousClass(Env* env, Class* clazz);
extern Object* nvmAttributeGetClassSignature(Env* env, Class* clazz);
extern Object* nvmAttributeGetMethodSignature(Env* env, Method* method);
extern Object* nvmAttributeGetFieldSignature(Env* env, Field* field);
extern Object* nvmAttributeGetAnnotationDefault(Env* env, Method* method);
extern ObjectArray* nvmAttributeGetExceptions(Env* env, Method* method);
extern ObjectArray* nvmAttributeGetClassRuntimeVisibleAnnotations(Env* env, Class* clazz);
extern ObjectArray* nvmAttributeGetMethodRuntimeVisibleAnnotations(Env* env, Method* method);
extern ObjectArray* nvmAttributeGetFieldRuntimeVisibleAnnotations(Env* env, Field* field);
extern ObjectArray* nvmAttributeGetMethodRuntimeVisibleParameterAnnotations(Env* env, Method* method);
extern ObjectArray* nvmAttributeGetDeclaredClasses(Env* env, Class* clazz);
extern Object* nvmAttributeGetInnerClassName(Env* env, Class* clazz);

#endif

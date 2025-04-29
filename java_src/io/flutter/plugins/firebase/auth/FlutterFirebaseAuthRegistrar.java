package io.flutter.plugins.firebase.auth;

import androidx.annotation.Keep;
import b6.c;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import v6.h;
@Keep
/* loaded from: classes.dex */
public class FlutterFirebaseAuthRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Collections.singletonList(h.b("flutter-fire-auth", "4.6.2"));
    }
}

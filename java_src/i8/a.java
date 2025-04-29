package i8;

import android.content.Context;
import io.flutter.embedding.engine.d;
import io.flutter.plugin.platform.h;
import io.flutter.view.e;
import r8.c;
/* loaded from: classes.dex */
public interface a {

    /* renamed from: i8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0159a {
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f9790a;

        /* renamed from: b  reason: collision with root package name */
        private final io.flutter.embedding.engine.a f9791b;

        /* renamed from: c  reason: collision with root package name */
        private final c f9792c;

        /* renamed from: d  reason: collision with root package name */
        private final e f9793d;

        /* renamed from: e  reason: collision with root package name */
        private final h f9794e;

        /* renamed from: f  reason: collision with root package name */
        private final InterfaceC0159a f9795f;

        /* renamed from: g  reason: collision with root package name */
        private final d f9796g;

        public b(Context context, io.flutter.embedding.engine.a aVar, c cVar, e eVar, h hVar, InterfaceC0159a interfaceC0159a, d dVar) {
            this.f9790a = context;
            this.f9791b = aVar;
            this.f9792c = cVar;
            this.f9793d = eVar;
            this.f9794e = hVar;
            this.f9795f = interfaceC0159a;
            this.f9796g = dVar;
        }

        public Context a() {
            return this.f9790a;
        }

        public c b() {
            return this.f9792c;
        }

        public h c() {
            return this.f9794e;
        }

        public e d() {
            return this.f9793d;
        }
    }

    void d(b bVar);

    void m(b bVar);
}

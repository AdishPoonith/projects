package io.flutter.embedding.engine;

import android.content.Context;
import e8.a;
import io.flutter.embedding.engine.a;
import io.flutter.plugin.platform.q;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    final List<io.flutter.embedding.engine.a> f10327a = new ArrayList();

    /* loaded from: classes.dex */
    class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ io.flutter.embedding.engine.a f10328a;

        a(io.flutter.embedding.engine.a aVar) {
            this.f10328a = aVar;
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
            d.this.f10327a.remove(this.f10328a);
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private Context f10330a;

        /* renamed from: b  reason: collision with root package name */
        private a.b f10331b;

        /* renamed from: c  reason: collision with root package name */
        private String f10332c;

        /* renamed from: d  reason: collision with root package name */
        private List<String> f10333d;

        /* renamed from: e  reason: collision with root package name */
        private q f10334e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f10335f = true;

        /* renamed from: g  reason: collision with root package name */
        private boolean f10336g = false;

        public b(Context context) {
            this.f10330a = context;
        }

        public boolean a() {
            return this.f10335f;
        }

        public Context b() {
            return this.f10330a;
        }

        public a.b c() {
            return this.f10331b;
        }

        public List<String> d() {
            return this.f10333d;
        }

        public String e() {
            return this.f10332c;
        }

        public q f() {
            return this.f10334e;
        }

        public boolean g() {
            return this.f10336g;
        }

        public b h(boolean z10) {
            this.f10335f = z10;
            return this;
        }

        public b i(a.b bVar) {
            this.f10331b = bVar;
            return this;
        }

        public b j(List<String> list) {
            this.f10333d = list;
            return this;
        }

        public b k(String str) {
            this.f10332c = str;
            return this;
        }

        public b l(boolean z10) {
            this.f10336g = z10;
            return this;
        }
    }

    public d(Context context, String[] strArr) {
        g8.d c10 = d8.a.e().c();
        if (c10.k()) {
            return;
        }
        c10.m(context.getApplicationContext());
        c10.e(context.getApplicationContext(), strArr);
    }

    public io.flutter.embedding.engine.a a(b bVar) {
        io.flutter.embedding.engine.a x10;
        Context b10 = bVar.b();
        a.b c10 = bVar.c();
        String e10 = bVar.e();
        List<String> d10 = bVar.d();
        q f10 = bVar.f();
        if (f10 == null) {
            f10 = new q();
        }
        q qVar = f10;
        boolean a10 = bVar.a();
        boolean g10 = bVar.g();
        a.b a11 = c10 == null ? a.b.a() : c10;
        if (this.f10327a.size() == 0) {
            x10 = b(b10, qVar, a10, g10);
            if (e10 != null) {
                x10.m().c(e10);
            }
            x10.i().j(a11, d10);
        } else {
            x10 = this.f10327a.get(0).x(b10, a11, e10, d10, qVar, a10, g10);
        }
        this.f10327a.add(x10);
        x10.d(new a(x10));
        return x10;
    }

    io.flutter.embedding.engine.a b(Context context, q qVar, boolean z10, boolean z11) {
        return new io.flutter.embedding.engine.a(context, null, null, qVar, null, z10, z11, this);
    }
}

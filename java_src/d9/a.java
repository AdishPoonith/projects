package d9;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import r8.r;
/* loaded from: classes.dex */
public class a {

    /* renamed from: d9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0127a extends RuntimeException {

        /* renamed from: j  reason: collision with root package name */
        public final String f7941j;

        /* renamed from: k  reason: collision with root package name */
        public final Object f7942k;

        public C0127a(String str, String str2, Object obj) {
            super(str2);
            this.f7941j = str;
            this.f7942k = obj;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        Boolean a(String str);

        void b();

        Boolean c(String str, Map<String, String> map);

        Boolean d(String str, d dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends r {

        /* renamed from: d  reason: collision with root package name */
        public static final c f7943d = new c();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // r8.r
        public Object g(byte b10, ByteBuffer byteBuffer) {
            return b10 != Byte.MIN_VALUE ? super.g(b10, byteBuffer) : d.a((ArrayList) f(byteBuffer));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // r8.r
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof d)) {
                super.p(byteArrayOutputStream, obj);
                return;
            }
            byteArrayOutputStream.write(128);
            p(byteArrayOutputStream, ((d) obj).h());
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private Boolean f7944a;

        /* renamed from: b  reason: collision with root package name */
        private Boolean f7945b;

        /* renamed from: c  reason: collision with root package name */
        private Map<String, String> f7946c;

        d() {
        }

        static d a(ArrayList<Object> arrayList) {
            d dVar = new d();
            dVar.f((Boolean) arrayList.get(0));
            dVar.e((Boolean) arrayList.get(1));
            dVar.g((Map) arrayList.get(2));
            return dVar;
        }

        public Boolean b() {
            return this.f7945b;
        }

        public Boolean c() {
            return this.f7944a;
        }

        public Map<String, String> d() {
            return this.f7946c;
        }

        public void e(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
            }
            this.f7945b = bool;
        }

        public void f(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
            }
            this.f7944a = bool;
        }

        public void g(Map<String, String> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"headers\" is null.");
            }
            this.f7946c = map;
        }

        ArrayList<Object> h() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.f7944a);
            arrayList.add(this.f7945b);
            arrayList.add(this.f7946c);
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof C0127a) {
            C0127a c0127a = (C0127a) th;
            arrayList.add(c0127a.f7941j);
            arrayList.add(c0127a.getMessage());
            obj = c0127a.f7942k;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}

package e1;

import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import f1.i0;
import f1.l0;
import f1.r;
import f1.v;
import i7.c;
import i7.e;
import i7.h;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import ka.p;
import kotlin.jvm.internal.l;
import l7.b;
import org.json.JSONObject;
import p0.f0;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7982a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final String f7983b = a.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private static final HashMap<String, NsdManager.RegistrationListener> f7984c = new HashMap<>();

    /* renamed from: e1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0131a implements NsdManager.RegistrationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f7985a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f7986b;

        C0131a(String str, String str2) {
            this.f7985a = str;
            this.f7986b = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo serviceInfo, int i10) {
            l.e(serviceInfo, "serviceInfo");
            a aVar = a.f7982a;
            a.a(this.f7986b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo NsdServiceInfo) {
            l.e(NsdServiceInfo, "NsdServiceInfo");
            if (l.a(this.f7985a, NsdServiceInfo.getServiceName())) {
                return;
            }
            a aVar = a.f7982a;
            a.a(this.f7986b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo serviceInfo) {
            l.e(serviceInfo, "serviceInfo");
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo serviceInfo, int i10) {
            l.e(serviceInfo, "serviceInfo");
        }
    }

    private a() {
    }

    public static final void a(String str) {
        if (k1.a.d(a.class)) {
            return;
        }
        try {
            f7982a.b(str);
        } catch (Throwable th) {
            k1.a.b(th, a.class);
        }
    }

    private final void b(String str) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            NsdManager.RegistrationListener registrationListener = f7984c.get(str);
            if (registrationListener != null) {
                f0 f0Var = f0.f14852a;
                Object systemService = f0.l().getSystemService("servicediscovery");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
                }
                try {
                    ((NsdManager) systemService).unregisterService(registrationListener);
                } catch (IllegalArgumentException e10) {
                    l0 l0Var = l0.f8470a;
                    l0.d0(f7983b, e10);
                }
                f7984c.remove(str);
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public static final Bitmap c(String str) {
        Bitmap bitmap = null;
        if (k1.a.d(a.class)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(c.class);
            enumMap.put((EnumMap) c.MARGIN, (c) 2);
            try {
                b a10 = new e().a(str, i7.a.QR_CODE, 200, 200, enumMap);
                int g10 = a10.g();
                int h10 = a10.h();
                int[] iArr = new int[g10 * h10];
                if (g10 > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        int i12 = i10 * h10;
                        if (h10 > 0) {
                            int i13 = 0;
                            while (true) {
                                int i14 = i13 + 1;
                                iArr[i12 + i13] = a10.f(i13, i10) ? -16777216 : -1;
                                if (i14 >= h10) {
                                    break;
                                }
                                i13 = i14;
                            }
                        }
                        if (i11 >= g10) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                Bitmap createBitmap = Bitmap.createBitmap(h10, g10, Bitmap.Config.ARGB_8888);
                try {
                    createBitmap.setPixels(iArr, 0, h10, 0, 0, h10, g10);
                    return createBitmap;
                } catch (h unused) {
                    bitmap = createBitmap;
                    return bitmap;
                }
            } catch (h unused2) {
            }
        } catch (Throwable th) {
            k1.a.b(th, a.class);
            return null;
        }
    }

    public static final String d(Map<String, String> map) {
        if (k1.a.d(a.class)) {
            return null;
        }
        if (map == null) {
            try {
                map = new HashMap<>();
            } catch (Throwable th) {
                k1.a.b(th, a.class);
                return null;
            }
        }
        String DEVICE = Build.DEVICE;
        l.d(DEVICE, "DEVICE");
        map.put("device", DEVICE);
        String MODEL = Build.MODEL;
        l.d(MODEL, "MODEL");
        map.put("model", MODEL);
        String jSONObject = new JSONObject(map).toString();
        l.d(jSONObject, "JSONObject(deviceInfo as Map<*, *>).toString()");
        return jSONObject;
    }

    public static final boolean e() {
        if (k1.a.d(a.class)) {
            return false;
        }
        try {
            v vVar = v.f8582a;
            f0 f0Var = f0.f14852a;
            r f10 = v.f(f0.m());
            if (f10 != null) {
                return f10.j().contains(i0.Enabled);
            }
            return false;
        } catch (Throwable th) {
            k1.a.b(th, a.class);
            return false;
        }
    }

    public static final boolean f(String str) {
        if (k1.a.d(a.class)) {
            return false;
        }
        try {
            a aVar = f7982a;
            if (e()) {
                return aVar.g(str);
            }
            return false;
        } catch (Throwable th) {
            k1.a.b(th, a.class);
            return false;
        }
    }

    private final boolean g(String str) {
        String q10;
        if (k1.a.d(this)) {
            return false;
        }
        try {
            HashMap<String, NsdManager.RegistrationListener> hashMap = f7984c;
            if (hashMap.containsKey(str)) {
                return true;
            }
            f0 f0Var = f0.f14852a;
            q10 = p.q(f0.B(), '.', '|', false, 4, null);
            String str2 = "fbsdk_" + l.k("android-", q10) + '_' + ((Object) str);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = f0.l().getSystemService("servicediscovery");
            if (systemService != null) {
                C0131a c0131a = new C0131a(str2, str);
                hashMap.put(str, c0131a);
                ((NsdManager) systemService).registerService(nsdServiceInfo, 1, c0131a);
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
        } catch (Throwable th) {
            k1.a.b(th, this);
            return false;
        }
    }
}

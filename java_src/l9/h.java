package l9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public class h {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f13530b = Logger.getLogger(h.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f13531c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: d  reason: collision with root package name */
    private static final h f13532d = d();

    /* renamed from: a  reason: collision with root package name */
    private final Provider f13533a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements PrivilegedExceptionAction<Method> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Method run() {
            return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements PrivilegedExceptionAction<Method> {
        b() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Method run() {
            return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements PrivilegedExceptionAction<Method> {
        c() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Method run() {
            return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends h {

        /* renamed from: e  reason: collision with root package name */
        private final l9.g<Socket> f13534e;

        /* renamed from: f  reason: collision with root package name */
        private final l9.g<Socket> f13535f;

        /* renamed from: g  reason: collision with root package name */
        private final Method f13536g;

        /* renamed from: h  reason: collision with root package name */
        private final Method f13537h;

        /* renamed from: i  reason: collision with root package name */
        private final l9.g<Socket> f13538i;

        /* renamed from: j  reason: collision with root package name */
        private final l9.g<Socket> f13539j;

        /* renamed from: k  reason: collision with root package name */
        private final EnumC0198h f13540k;

        public d(l9.g<Socket> gVar, l9.g<Socket> gVar2, Method method, Method method2, l9.g<Socket> gVar3, l9.g<Socket> gVar4, Provider provider, EnumC0198h enumC0198h) {
            super(provider);
            this.f13534e = gVar;
            this.f13535f = gVar2;
            this.f13536g = method;
            this.f13537h = method2;
            this.f13538i = gVar3;
            this.f13539j = gVar4;
            this.f13540k = enumC0198h;
        }

        @Override // l9.h
        public void c(SSLSocket sSLSocket, String str, List<i> list) {
            if (str != null) {
                this.f13534e.e(sSLSocket, Boolean.TRUE);
                this.f13535f.e(sSLSocket, str);
            }
            if (this.f13539j.g(sSLSocket)) {
                this.f13539j.f(sSLSocket, h.b(list));
            }
        }

        @Override // l9.h
        public String h(SSLSocket sSLSocket) {
            byte[] bArr;
            if (this.f13538i.g(sSLSocket) && (bArr = (byte[]) this.f13538i.f(sSLSocket, new Object[0])) != null) {
                return new String(bArr, l.f13572b);
            }
            return null;
        }

        @Override // l9.h
        public EnumC0198h i() {
            return this.f13540k;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e extends h {

        /* renamed from: e  reason: collision with root package name */
        private final Method f13541e;

        /* renamed from: f  reason: collision with root package name */
        private final Method f13542f;

        private e(Provider provider, Method method, Method method2) {
            super(provider);
            this.f13541e = method;
            this.f13542f = method2;
        }

        /* synthetic */ e(Provider provider, Method method, Method method2, a aVar) {
            this(provider, method, method2);
        }

        @Override // l9.h
        public void c(SSLSocket sSLSocket, String str, List<i> list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            for (i iVar : list) {
                if (iVar != i.HTTP_1_0) {
                    arrayList.add(iVar.toString());
                }
            }
            try {
                this.f13541e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // l9.h
        public String h(SSLSocket sSLSocket) {
            try {
                return (String) this.f13542f.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // l9.h
        public EnumC0198h i() {
            return EnumC0198h.ALPN_AND_NPN;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f extends h {

        /* renamed from: e  reason: collision with root package name */
        private final Method f13543e;

        /* renamed from: f  reason: collision with root package name */
        private final Method f13544f;

        /* renamed from: g  reason: collision with root package name */
        private final Method f13545g;

        /* renamed from: h  reason: collision with root package name */
        private final Class<?> f13546h;

        /* renamed from: i  reason: collision with root package name */
        private final Class<?> f13547i;

        public f(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2, Provider provider) {
            super(provider);
            this.f13543e = method;
            this.f13544f = method2;
            this.f13545g = method3;
            this.f13546h = cls;
            this.f13547i = cls2;
        }

        @Override // l9.h
        public void a(SSLSocket sSLSocket) {
            try {
                this.f13545g.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e10) {
                h.f13530b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e10);
            }
        }

        @Override // l9.h
        public void c(SSLSocket sSLSocket, String str, List<i> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                i iVar = list.get(i10);
                if (iVar != i.HTTP_1_0) {
                    arrayList.add(iVar.toString());
                }
            }
            try {
                this.f13543e.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f13546h, this.f13547i}, new g(arrayList)));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // l9.h
        public String h(SSLSocket sSLSocket) {
            try {
                g gVar = (g) Proxy.getInvocationHandler(this.f13544f.invoke(null, sSLSocket));
                if (!gVar.f13549b && gVar.f13550c == null) {
                    h.f13530b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                } else if (gVar.f13549b) {
                    return null;
                } else {
                    return gVar.f13550c;
                }
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // l9.h
        public EnumC0198h i() {
            return EnumC0198h.ALPN_AND_NPN;
        }
    }

    /* loaded from: classes.dex */
    private static class g implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f13548a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f13549b;

        /* renamed from: c  reason: collision with root package name */
        private String f13550c;

        public g(List<String> list) {
            this.f13548a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = l.f13571a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f13549b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f13548a;
            } else {
                if ((!name.equals("selectProtocol") && !name.equals("select")) || String.class != returnType || objArr.length != 1 || !(objArr[0] instanceof List)) {
                    if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
                        this.f13550c = (String) objArr[0];
                        return null;
                    }
                    return method.invoke(this, objArr);
                }
                List list = (List) objArr[0];
                int size = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        obj2 = this.f13548a.get(0);
                        break;
                    } else if (this.f13548a.contains(list.get(i10))) {
                        obj2 = list.get(i10);
                        break;
                    } else {
                        i10++;
                    }
                }
                String str = (String) obj2;
                this.f13550c = str;
                return str;
            }
        }
    }

    /* renamed from: l9.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0198h {
        ALPN_AND_NPN,
        NPN,
        NONE
    }

    public h(Provider provider) {
        this.f13533a = provider;
    }

    public static byte[] b(List<i> list) {
        okio.c cVar = new okio.c();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = list.get(i10);
            if (iVar != i.HTTP_1_0) {
                cVar.D(iVar.toString().length());
                cVar.a0(iVar.toString());
            }
        }
        return cVar.y();
    }

    private static h d() {
        Method method;
        Method method2;
        Provider f10 = f();
        if (f10 != null) {
            l9.g gVar = new l9.g(null, "setUseSessionTickets", Boolean.TYPE);
            l9.g gVar2 = new l9.g(null, "setHostname", String.class);
            l9.g gVar3 = new l9.g(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            l9.g gVar4 = new l9.g(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                method = cls.getMethod("tagSocket", Socket.class);
                try {
                    method2 = cls.getMethod("untagSocket", Socket.class);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    method2 = null;
                    return new d(gVar, gVar2, method, method2, gVar3, gVar4, f10, (!f10.getName().equals("GmsCore_OpenSSL") || f10.getName().equals("Conscrypt") || f10.getName().equals("Ssl_Guard") || k()) ? EnumC0198h.ALPN_AND_NPN : j() ? EnumC0198h.NPN : EnumC0198h.NONE);
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method = null;
            }
            return new d(gVar, gVar2, method, method2, gVar3, gVar4, f10, (!f10.getName().equals("GmsCore_OpenSSL") || f10.getName().equals("Conscrypt") || f10.getName().equals("Ssl_Guard") || k()) ? EnumC0198h.ALPN_AND_NPN : j() ? EnumC0198h.NPN : EnumC0198h.NONE);
        }
        try {
            Provider provider = SSLContext.getDefault().getProvider();
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS", provider);
                sSLContext.init(null, null, null);
                ((Method) AccessController.doPrivileged(new a())).invoke(sSLContext.createSSLEngine(), new Object[0]);
                return new e(provider, (Method) AccessController.doPrivileged(new b()), (Method) AccessController.doPrivileged(new c()), null);
            } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused3) {
                try {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                    return new f(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider);
                } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    return new h(provider);
                }
            }
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static h e() {
        return f13532d;
    }

    private static Provider f() {
        Provider[] providers;
        String[] strArr;
        for (Provider provider : Security.getProviders()) {
            for (String str : f13531c) {
                if (str.equals(provider.getClass().getName())) {
                    f13530b.log(Level.FINE, "Found registered provider {0}", str);
                    return provider;
                }
            }
        }
        f13530b.log(Level.WARNING, "Unable to find Conscrypt");
        return null;
    }

    private static boolean j() {
        try {
            h.class.getClassLoader().loadClass("android.app.ActivityOptions");
            return true;
        } catch (ClassNotFoundException e10) {
            f13530b.log(Level.FINE, "Can't find class", (Throwable) e10);
            return false;
        }
    }

    private static boolean k() {
        try {
            h.class.getClassLoader().loadClass("android.net.Network");
            return true;
        } catch (ClassNotFoundException e10) {
            f13530b.log(Level.FINE, "Can't find class", (Throwable) e10);
            return false;
        }
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List<i> list) {
    }

    public Provider g() {
        return this.f13533a;
    }

    public String h(SSLSocket sSLSocket) {
        return null;
    }

    public EnumC0198h i() {
        return EnumC0198h.NONE;
    }
}

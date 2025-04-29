package k9;

import io.grpc.internal.r0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import l9.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f12768b = Logger.getLogger(k.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private static final l9.h f12769c = l9.h.e();

    /* renamed from: d  reason: collision with root package name */
    private static k f12770d = d(k.class.getClassLoader());

    /* renamed from: a  reason: collision with root package name */
    protected final l9.h f12771a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends k {

        /* renamed from: e  reason: collision with root package name */
        private static final l9.g<Socket> f12772e;

        /* renamed from: f  reason: collision with root package name */
        private static final l9.g<Socket> f12773f;

        /* renamed from: g  reason: collision with root package name */
        private static final l9.g<Socket> f12774g;

        /* renamed from: h  reason: collision with root package name */
        private static final l9.g<Socket> f12775h;

        /* renamed from: i  reason: collision with root package name */
        private static final l9.g<Socket> f12776i;

        /* renamed from: j  reason: collision with root package name */
        private static final l9.g<Socket> f12777j;

        /* renamed from: k  reason: collision with root package name */
        private static final Method f12778k;

        /* renamed from: l  reason: collision with root package name */
        private static final Method f12779l;

        /* renamed from: m  reason: collision with root package name */
        private static final Method f12780m;

        /* renamed from: n  reason: collision with root package name */
        private static final Method f12781n;

        /* renamed from: o  reason: collision with root package name */
        private static final Method f12782o;

        /* renamed from: p  reason: collision with root package name */
        private static final Method f12783p;

        /* renamed from: q  reason: collision with root package name */
        private static final Constructor<?> f12784q;

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            Method method6;
            Class<?> cls;
            Class<?> cls2 = Boolean.TYPE;
            Constructor<?> constructor = null;
            f12772e = new l9.g<>(null, "setUseSessionTickets", cls2);
            f12773f = new l9.g<>(null, "setHostname", String.class);
            f12774g = new l9.g<>(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            f12775h = new l9.g<>(null, "setAlpnProtocols", byte[].class);
            f12776i = new l9.g<>(byte[].class, "getNpnSelectedProtocol", new Class[0]);
            f12777j = new l9.g<>(null, "setNpnProtocols", byte[].class);
            try {
                method2 = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
                try {
                    method = SSLParameters.class.getMethod("getApplicationProtocols", new Class[0]);
                    try {
                        method3 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                        try {
                            cls = Class.forName("android.net.ssl.SSLSockets");
                            method4 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                        } catch (ClassNotFoundException | NoSuchMethodException e10) {
                            e = e10;
                            method4 = null;
                        }
                    } catch (ClassNotFoundException e11) {
                        e = e11;
                        method3 = null;
                        method4 = method3;
                        k.f12768b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                        method5 = null;
                        f12780m = method2;
                        f12781n = method;
                        f12782o = method3;
                        f12778k = method4;
                        f12779l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        try {
                            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        } catch (ClassNotFoundException e12) {
                            e = e12;
                            k.f12768b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
                            f12783p = method6;
                            f12784q = constructor;
                        } catch (NoSuchMethodException e13) {
                            e = e13;
                            k.f12768b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
                            f12783p = method6;
                            f12784q = constructor;
                        }
                        f12783p = method6;
                        f12784q = constructor;
                    } catch (NoSuchMethodException e14) {
                        e = e14;
                        method3 = null;
                        method4 = method3;
                        k.f12768b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                        method5 = null;
                        f12780m = method2;
                        f12781n = method;
                        f12782o = method3;
                        f12778k = method4;
                        f12779l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f12783p = method6;
                        f12784q = constructor;
                    }
                    try {
                        method5 = cls.getMethod("setUseSessionTickets", SSLSocket.class, cls2);
                    } catch (ClassNotFoundException e15) {
                        e = e15;
                        k.f12768b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                        method5 = null;
                        f12780m = method2;
                        f12781n = method;
                        f12782o = method3;
                        f12778k = method4;
                        f12779l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f12783p = method6;
                        f12784q = constructor;
                    } catch (NoSuchMethodException e16) {
                        e = e16;
                        k.f12768b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                        method5 = null;
                        f12780m = method2;
                        f12781n = method;
                        f12782o = method3;
                        f12778k = method4;
                        f12779l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f12783p = method6;
                        f12784q = constructor;
                    }
                } catch (ClassNotFoundException e17) {
                    e = e17;
                    method = null;
                    method3 = null;
                } catch (NoSuchMethodException e18) {
                    e = e18;
                    method = null;
                    method3 = null;
                }
            } catch (ClassNotFoundException e19) {
                e = e19;
                method = null;
                method2 = null;
                method3 = null;
            } catch (NoSuchMethodException e20) {
                e = e20;
                method = null;
                method2 = null;
                method3 = null;
            }
            f12780m = method2;
            f12781n = method;
            f12782o = method3;
            f12778k = method4;
            f12779l = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException | NoSuchMethodException e21) {
                e = e21;
                method6 = null;
            }
            f12783p = method6;
            f12784q = constructor;
        }

        a(l9.h hVar) {
            super(hVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
        @Override // k9.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected void c(javax.net.ssl.SSLSocket r9, java.lang.String r10, java.util.List<l9.i> r11) {
            /*
                Method dump skipped, instructions count: 241
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: k9.k.a.c(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
        }

        @Override // k9.k
        public String f(SSLSocket sSLSocket) {
            Method method = f12782o;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, new Object[0]);
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    if (!(e11.getTargetException() instanceof UnsupportedOperationException)) {
                        throw new RuntimeException(e11);
                    }
                    k.f12768b.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                }
            }
            if (this.f12771a.i() == h.EnumC0198h.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) f12774g.f(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, l9.l.f13572b);
                    }
                } catch (Exception e12) {
                    k.f12768b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e12);
                }
            }
            if (this.f12771a.i() != h.EnumC0198h.NONE) {
                try {
                    byte[] bArr2 = (byte[]) f12776i.f(sSLSocket, new Object[0]);
                    if (bArr2 != null) {
                        return new String(bArr2, l9.l.f13572b);
                    }
                    return null;
                } catch (Exception e13) {
                    k.f12768b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e13);
                    return null;
                }
            }
            return null;
        }

        @Override // k9.k
        public String h(SSLSocket sSLSocket, String str, List<l9.i> list) {
            String f10 = f(sSLSocket);
            return f10 == null ? super.h(sSLSocket, str, list) : f10;
        }
    }

    k(l9.h hVar) {
        this.f12771a = (l9.h) b5.n.o(hVar, "platform");
    }

    static k d(ClassLoader classLoader) {
        boolean z10;
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e10) {
            f12768b.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e10);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e11) {
                f12768b.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e11);
                z10 = false;
            }
        }
        z10 = true;
        return z10 ? new a(f12769c) : new k(f12769c);
    }

    public static k e() {
        return f12770d;
    }

    static boolean g(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            r0.c(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] i(List<l9.i> list) {
        ArrayList arrayList = new ArrayList();
        for (l9.i iVar : list) {
            arrayList.add(iVar.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    protected void c(SSLSocket sSLSocket, String str, List<l9.i> list) {
        this.f12771a.c(sSLSocket, str, list);
    }

    public String f(SSLSocket sSLSocket) {
        return this.f12771a.h(sSLSocket);
    }

    public String h(SSLSocket sSLSocket, String str, List<l9.i> list) {
        if (list != null) {
            c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String f10 = f(sSLSocket);
            if (f10 != null) {
                return f10;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            this.f12771a.a(sSLSocket);
        }
    }
}

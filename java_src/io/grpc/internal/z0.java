package io.grpc.internal;

import io.grpc.internal.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z0 implements c0.g {

    /* renamed from: a  reason: collision with root package name */
    private static final Throwable f11820a = d();

    /* loaded from: classes.dex */
    static final class a implements c {
        a() {
        }

        private static void b() {
            if (z0.f11820a != null) {
                throw new UnsupportedOperationException("JNDI is not currently available", z0.f11820a);
            }
        }

        private static void c(NamingEnumeration<?> namingEnumeration, NamingException namingException) {
            try {
                namingEnumeration.close();
            } catch (NamingException unused) {
            }
            throw namingException;
        }

        private static void d(DirContext dirContext, NamingException namingException) {
            try {
                dirContext.close();
            } catch (NamingException unused) {
            }
            throw namingException;
        }

        @Override // io.grpc.internal.z0.c
        public List<String> a(String str, String str2) {
            b();
            String[] strArr = {str};
            ArrayList arrayList = new ArrayList();
            Hashtable hashtable = new Hashtable();
            hashtable.put("com.sun.jndi.ldap.connect.timeout", "5000");
            hashtable.put("com.sun.jndi.ldap.read.timeout", "5000");
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            try {
                NamingEnumeration all = initialDirContext.getAttributes(str2, strArr).getAll();
                while (all.hasMore()) {
                    try {
                        NamingEnumeration all2 = ((Attribute) all.next()).getAll();
                        while (all2.hasMore()) {
                            try {
                                arrayList.add(String.valueOf(all2.next()));
                            } catch (NamingException e10) {
                                c(all2, e10);
                            }
                        }
                        all2.close();
                    } catch (NamingException e11) {
                        c(all, e11);
                    }
                }
                all.close();
            } catch (NamingException e12) {
                d(initialDirContext, e12);
            }
            initialDirContext.close();
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    static final class b implements c0.f {

        /* renamed from: b  reason: collision with root package name */
        private static final Logger f11821b = Logger.getLogger(b.class.getName());

        /* renamed from: c  reason: collision with root package name */
        private static final Pattern f11822c = Pattern.compile("\\s+");

        /* renamed from: a  reason: collision with root package name */
        private final c f11823a;

        public b(c cVar) {
            this.f11823a = cVar;
        }

        static String b(String str) {
            StringBuilder sb = new StringBuilder(str.length());
            int i10 = 0;
            boolean z10 = false;
            while (i10 < str.length()) {
                char charAt = str.charAt(i10);
                if (z10) {
                    if (charAt == '\"') {
                        z10 = false;
                    } else {
                        if (charAt == '\\') {
                            i10++;
                            charAt = str.charAt(i10);
                        }
                        sb.append(charAt);
                    }
                } else if (charAt != ' ') {
                    if (charAt == '\"') {
                        z10 = true;
                    }
                    sb.append(charAt);
                }
                i10++;
            }
            return sb.toString();
        }

        @Override // io.grpc.internal.c0.f
        public List<String> a(String str) {
            Logger logger = f11821b;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                logger.log(level, "About to query TXT records for {0}", new Object[]{str});
            }
            c cVar = this.f11823a;
            List<String> a10 = cVar.a("TXT", "dns:///" + str);
            if (logger.isLoggable(level)) {
                logger.log(level, "Found {0} TXT records", new Object[]{Integer.valueOf(a10.size())});
            }
            ArrayList arrayList = new ArrayList(a10.size());
            for (String str2 : a10) {
                arrayList.add(b(str2));
            }
            return Collections.unmodifiableList(arrayList);
        }
    }

    /* loaded from: classes.dex */
    interface c {
        List<String> a(String str, String str2);
    }

    private static Throwable d() {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            return null;
        } catch (ClassNotFoundException e10) {
            return e10;
        } catch (Error e11) {
            return e11;
        } catch (RuntimeException e12) {
            return e12;
        }
    }

    @Override // io.grpc.internal.c0.g
    public c0.f a() {
        if (b() != null) {
            return null;
        }
        return new b(new a());
    }

    @Override // io.grpc.internal.c0.g
    public Throwable b() {
        return f11820a;
    }
}

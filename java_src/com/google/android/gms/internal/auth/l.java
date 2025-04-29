package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: f  reason: collision with root package name */
    static HashMap f4159f;

    /* renamed from: k  reason: collision with root package name */
    private static Object f4164k;

    /* renamed from: l  reason: collision with root package name */
    private static boolean f4165l;

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f4154a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b  reason: collision with root package name */
    public static final Uri f4155b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f4156c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f4157d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicBoolean f4158e = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    static final HashMap f4160g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    static final HashMap f4161h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    static final HashMap f4162i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    static final HashMap f4163j = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    static final String[] f4166m = new String[0];

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (l.class) {
            if (f4159f == null) {
                f4158e.set(false);
                f4159f = new HashMap();
                f4164k = new Object();
                f4165l = false;
                contentResolver.registerContentObserver(f4154a, true, new k(null));
            } else if (f4158e.getAndSet(false)) {
                f4159f.clear();
                f4160g.clear();
                f4161h.clear();
                f4162i.clear();
                f4163j.clear();
                f4164k = new Object();
                f4165l = false;
            }
            Object obj = f4164k;
            if (f4159f.containsKey(str)) {
                String str3 = (String) f4159f.get(str);
                if (str3 != null) {
                    r3 = str3;
                }
                return r3;
            }
            int length = f4166m.length;
            Cursor query = contentResolver.query(f4154a, null, null, new String[]{str}, null);
            if (query == null) {
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    c(obj, str, null);
                    return null;
                }
                String string = query.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                c(obj, str, string);
                return string != null ? string : null;
            } finally {
                query.close();
            }
        }
    }

    private static void c(Object obj, String str, String str2) {
        synchronized (l.class) {
            if (obj == f4164k) {
                f4159f.put(str, str2);
            }
        }
    }
}

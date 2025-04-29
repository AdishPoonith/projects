package com.mr.flutter.plugin.filepicker;

import android.net.Uri;
import java.util.HashMap;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    final String f7525a;

    /* renamed from: b  reason: collision with root package name */
    final String f7526b;

    /* renamed from: c  reason: collision with root package name */
    final Uri f7527c;

    /* renamed from: d  reason: collision with root package name */
    final long f7528d;

    /* renamed from: e  reason: collision with root package name */
    final byte[] f7529e;

    /* renamed from: com.mr.flutter.plugin.filepicker.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0109a {

        /* renamed from: a  reason: collision with root package name */
        private String f7530a;

        /* renamed from: b  reason: collision with root package name */
        private String f7531b;

        /* renamed from: c  reason: collision with root package name */
        private Uri f7532c;

        /* renamed from: d  reason: collision with root package name */
        private long f7533d;

        /* renamed from: e  reason: collision with root package name */
        private byte[] f7534e;

        public a a() {
            return new a(this.f7530a, this.f7531b, this.f7532c, this.f7533d, this.f7534e);
        }

        public C0109a b(byte[] bArr) {
            this.f7534e = bArr;
            return this;
        }

        public C0109a c(String str) {
            this.f7531b = str;
            return this;
        }

        public C0109a d(String str) {
            this.f7530a = str;
            return this;
        }

        public C0109a e(long j10) {
            this.f7533d = j10;
            return this;
        }

        public C0109a f(Uri uri) {
            this.f7532c = uri;
            return this;
        }
    }

    public a(String str, String str2, Uri uri, long j10, byte[] bArr) {
        this.f7525a = str;
        this.f7526b = str2;
        this.f7528d = j10;
        this.f7529e = bArr;
        this.f7527c = uri;
    }

    public HashMap<String, Object> a() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("path", this.f7525a);
        hashMap.put("name", this.f7526b);
        hashMap.put("size", Long.valueOf(this.f7528d));
        hashMap.put("bytes", this.f7529e);
        hashMap.put("identifier", this.f7527c.toString());
        return hashMap;
    }
}

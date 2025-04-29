package com.google.firebase.firestore;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f6810b = Pattern.compile("[~*/\\[\\]]");

    /* renamed from: c  reason: collision with root package name */
    private static final q f6811c = new q(m6.r.f13822k);

    /* renamed from: a  reason: collision with root package name */
    private final m6.r f6812a;

    private q(List<String> list) {
        this.f6812a = m6.r.u(list);
    }

    private q(m6.r rVar) {
        this.f6812a = rVar;
    }

    public static q a() {
        return f6811c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q b(String str) {
        q6.x.c(str, "Provided field path must not be null.");
        q6.x.a(!f6810b.matcher(str).find(), "Use FieldPath.of() for field names containing '~*/[]'.", new Object[0]);
        try {
            return d(str.split("\\.", -1));
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
        }
    }

    public static q d(String... strArr) {
        q6.x.a(strArr.length > 0, "Invalid field path. Provided path must not be empty.", new Object[0]);
        int i10 = 0;
        while (i10 < strArr.length) {
            boolean z10 = (strArr[i10] == null || strArr[i10].isEmpty()) ? false : true;
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid field name at argument ");
            i10++;
            sb.append(i10);
            sb.append(". Field names must not be null or empty.");
            q6.x.a(z10, sb.toString(), new Object[0]);
        }
        return new q(Arrays.asList(strArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m6.r c() {
        return this.f6812a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        return this.f6812a.equals(((q) obj).f6812a);
    }

    public int hashCode() {
        return this.f6812a.hashCode();
    }

    public String toString() {
        return this.f6812a.toString();
    }
}

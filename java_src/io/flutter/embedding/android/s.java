package io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import io.flutter.plugin.editing.b;
import java.util.HashSet;
/* loaded from: classes.dex */
public class s implements b.a {

    /* renamed from: a  reason: collision with root package name */
    protected final d[] f10249a;

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<KeyEvent> f10250b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private final e f10251c;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private int f10252a = 0;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Character a(int i10) {
            char c10 = (char) i10;
            if ((Integer.MIN_VALUE & i10) != 0) {
                int i11 = i10 & Integer.MAX_VALUE;
                int i12 = this.f10252a;
                if (i12 != 0) {
                    i11 = KeyCharacterMap.getDeadChar(i12, i11);
                }
                this.f10252a = i11;
            } else {
                int i13 = this.f10252a;
                if (i13 != 0) {
                    int deadChar = KeyCharacterMap.getDeadChar(i13, i10);
                    if (deadChar > 0) {
                        c10 = (char) deadChar;
                    }
                    this.f10252a = 0;
                }
            }
            return Character.valueOf(c10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        final KeyEvent f10253a;

        /* renamed from: b  reason: collision with root package name */
        int f10254b;

        /* renamed from: c  reason: collision with root package name */
        boolean f10255c = false;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public class a implements d.a {

            /* renamed from: a  reason: collision with root package name */
            boolean f10257a;

            private a() {
                this.f10257a = false;
            }

            @Override // io.flutter.embedding.android.s.d.a
            public void a(boolean z10) {
                if (this.f10257a) {
                    throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
                }
                this.f10257a = true;
                c cVar = c.this;
                int i10 = cVar.f10254b - 1;
                cVar.f10254b = i10;
                boolean z11 = z10 | cVar.f10255c;
                cVar.f10255c = z11;
                if (i10 != 0 || z11) {
                    return;
                }
                s.this.d(cVar.f10253a);
            }
        }

        c(KeyEvent keyEvent) {
            this.f10254b = s.this.f10249a.length;
            this.f10253a = keyEvent;
        }

        public d.a a() {
            return new a();
        }
    }

    /* loaded from: classes.dex */
    public interface d {

        /* loaded from: classes.dex */
        public interface a {
            void a(boolean z10);
        }

        void a(KeyEvent keyEvent, a aVar);
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(KeyEvent keyEvent);

        boolean c(KeyEvent keyEvent);

        r8.c getBinaryMessenger();
    }

    public s(e eVar) {
        this.f10251c = eVar;
        this.f10249a = new d[]{new r(eVar.getBinaryMessenger()), new m(new q8.d(eVar.getBinaryMessenger()))};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(KeyEvent keyEvent) {
        e eVar = this.f10251c;
        if (eVar == null || eVar.c(keyEvent)) {
            return;
        }
        this.f10250b.add(keyEvent);
        this.f10251c.a(keyEvent);
        if (this.f10250b.remove(keyEvent)) {
            d8.b.g("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
        }
    }

    @Override // io.flutter.plugin.editing.b.a
    public boolean a(KeyEvent keyEvent) {
        if (this.f10250b.remove(keyEvent)) {
            return false;
        }
        if (this.f10249a.length <= 0) {
            d(keyEvent);
            return true;
        }
        c cVar = new c(keyEvent);
        for (d dVar : this.f10249a) {
            dVar.a(keyEvent, cVar.a());
        }
        return true;
    }

    public void c() {
        int size = this.f10250b.size();
        if (size > 0) {
            d8.b.g("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }
}

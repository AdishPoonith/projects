package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.e;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public abstract class c implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    final Object f449a = e.a(new a(this));

    /* renamed from: b  reason: collision with root package name */
    android.support.v4.media.session.a f450b;

    /* loaded from: classes.dex */
    private static class a implements e.a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f451a;

        a(c cVar) {
            this.f451a = new WeakReference<>(cVar);
        }

        @Override // android.support.v4.media.session.e.a
        public void a(Object obj) {
            c cVar = this.f451a.get();
            if (cVar != null) {
                cVar.c(MediaMetadataCompat.a(obj));
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void b(int i10, int i11, int i12, int i13, int i14) {
            c cVar = this.f451a.get();
            if (cVar != null) {
                cVar.a(new d(i10, i11, i12, i13, i14));
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void c(Object obj) {
            c cVar = this.f451a.get();
            if (cVar == null || cVar.f450b != null) {
                return;
            }
            cVar.d(PlaybackStateCompat.a(obj));
        }

        @Override // android.support.v4.media.session.e.a
        public void d(String str, Bundle bundle) {
            c cVar = this.f451a.get();
            if (cVar != null) {
                if (cVar.f450b == null || Build.VERSION.SDK_INT >= 23) {
                    cVar.h(str, bundle);
                }
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void h(CharSequence charSequence) {
            c cVar = this.f451a.get();
            if (cVar != null) {
                cVar.f(charSequence);
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void i() {
            c cVar = this.f451a.get();
            if (cVar != null) {
                cVar.g();
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void v(Bundle bundle) {
            c cVar = this.f451a.get();
            if (cVar != null) {
                cVar.b(bundle);
            }
        }

        @Override // android.support.v4.media.session.e.a
        public void y(List<?> list) {
            c cVar = this.f451a.get();
            if (cVar != null) {
                cVar.e(MediaSessionCompat.QueueItem.b(list));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends a.AbstractBinderC0007a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f452a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(c cVar) {
            this.f452a = new WeakReference<>(cVar);
        }

        @Override // android.support.v4.media.session.a
        public void P(boolean z10) {
        }

        @Override // android.support.v4.media.session.a
        public void S0(int i10) {
            c cVar = this.f452a.get();
            if (cVar != null) {
                cVar.i(12, Integer.valueOf(i10), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void T0() {
            c cVar = this.f452a.get();
            if (cVar != null) {
                cVar.i(13, null, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void a2(boolean z10) {
            c cVar = this.f452a.get();
            if (cVar != null) {
                cVar.i(11, Boolean.valueOf(z10), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void l(int i10) {
            c cVar = this.f452a.get();
            if (cVar != null) {
                cVar.i(9, Integer.valueOf(i10), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void w2(PlaybackStateCompat playbackStateCompat) {
            c cVar = this.f452a.get();
            if (cVar != null) {
                cVar.i(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void y2(String str, Bundle bundle) {
            c cVar = this.f452a.get();
            if (cVar != null) {
                cVar.i(1, str, bundle);
            }
        }
    }

    public void a(d dVar) {
    }

    public void b(Bundle bundle) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        i(8, null, null);
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void d(PlaybackStateCompat playbackStateCompat) {
    }

    public void e(List<MediaSessionCompat.QueueItem> list) {
    }

    public void f(CharSequence charSequence) {
    }

    public void g() {
    }

    public void h(String str, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(int i10, Object obj, Bundle bundle) {
    }
}

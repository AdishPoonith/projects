package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.g;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    final int f431j;

    /* renamed from: k  reason: collision with root package name */
    final long f432k;

    /* renamed from: l  reason: collision with root package name */
    final long f433l;

    /* renamed from: m  reason: collision with root package name */
    final float f434m;

    /* renamed from: n  reason: collision with root package name */
    final long f435n;

    /* renamed from: o  reason: collision with root package name */
    final int f436o;

    /* renamed from: p  reason: collision with root package name */
    final CharSequence f437p;

    /* renamed from: q  reason: collision with root package name */
    final long f438q;

    /* renamed from: r  reason: collision with root package name */
    List<CustomAction> f439r;

    /* renamed from: s  reason: collision with root package name */
    final long f440s;

    /* renamed from: t  reason: collision with root package name */
    final Bundle f441t;

    /* renamed from: u  reason: collision with root package name */
    private Object f442u;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        private final String f443j;

        /* renamed from: k  reason: collision with root package name */
        private final CharSequence f444k;

        /* renamed from: l  reason: collision with root package name */
        private final int f445l;

        /* renamed from: m  reason: collision with root package name */
        private final Bundle f446m;

        /* renamed from: n  reason: collision with root package name */
        private Object f447n;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(Parcel parcel) {
            this.f443j = parcel.readString();
            this.f444k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f445l = parcel.readInt();
            this.f446m = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f443j = str;
            this.f444k = charSequence;
            this.f445l = i10;
            this.f446m = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj != null) {
                CustomAction customAction = new CustomAction(g.a.a(obj), g.a.d(obj), g.a.c(obj), g.a.b(obj));
                customAction.f447n = obj;
                return customAction;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f444k) + ", mIcon=" + this.f445l + ", mExtras=" + this.f446m;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f443j);
            TextUtils.writeToParcel(this.f444k, parcel, i10);
            parcel.writeInt(this.f445l);
            parcel.writeBundle(this.f446m);
        }
    }

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, List<CustomAction> list, long j14, Bundle bundle) {
        this.f431j = i10;
        this.f432k = j10;
        this.f433l = j11;
        this.f434m = f10;
        this.f435n = j12;
        this.f436o = i11;
        this.f437p = charSequence;
        this.f438q = j13;
        this.f439r = new ArrayList(list);
        this.f440s = j14;
        this.f441t = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f431j = parcel.readInt();
        this.f432k = parcel.readLong();
        this.f434m = parcel.readFloat();
        this.f438q = parcel.readLong();
        this.f433l = parcel.readLong();
        this.f435n = parcel.readLong();
        this.f437p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f439r = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f440s = parcel.readLong();
        this.f441t = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f436o = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        if (obj != null) {
            List<Object> d10 = g.d(obj);
            if (d10 != null) {
                ArrayList arrayList2 = new ArrayList(d10.size());
                for (Object obj2 : d10) {
                    arrayList2.add(CustomAction.a(obj2));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(g.i(obj), g.h(obj), g.c(obj), g.g(obj), g.a(obj), 0, g.e(obj), g.f(obj), arrayList, g.b(obj), Build.VERSION.SDK_INT >= 22 ? h.a(obj) : null);
            playbackStateCompat.f442u = obj;
            return playbackStateCompat;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f431j + ", position=" + this.f432k + ", buffered position=" + this.f433l + ", speed=" + this.f434m + ", updated=" + this.f438q + ", actions=" + this.f435n + ", error code=" + this.f436o + ", error message=" + this.f437p + ", custom actions=" + this.f439r + ", active item id=" + this.f440s + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f431j);
        parcel.writeLong(this.f432k);
        parcel.writeFloat(this.f434m);
        parcel.writeLong(this.f438q);
        parcel.writeLong(this.f433l);
        parcel.writeLong(this.f435n);
        TextUtils.writeToParcel(this.f437p, parcel, i10);
        parcel.writeTypedList(this.f439r);
        parcel.writeLong(this.f440s);
        parcel.writeBundle(this.f441t);
        parcel.writeInt(this.f436o);
    }
}

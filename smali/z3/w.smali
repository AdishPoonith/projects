.class public final Lz3/w;
.super Lm4/a;
.source "SourceFile"


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.signin.internal.ISignInService"

    invoke-direct {p0, p1, v0}, Lm4/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final H2(Lz3/v;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    .locals 1

    invoke-virtual {p0}, Lm4/a;->p()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lm4/d;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lm4/d;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x66

    invoke-virtual {p0, p1, v0}, Lm4/a;->x(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final I2(Lz3/v;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    .locals 1

    invoke-virtual {p0}, Lm4/a;->p()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lm4/d;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lm4/d;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x65

    invoke-virtual {p0, p1, v0}, Lm4/a;->x(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final M(Lz3/v;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    .locals 1

    invoke-virtual {p0}, Lm4/a;->p()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lm4/d;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p2}, Lm4/d;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x67

    invoke-virtual {p0, p1, v0}, Lm4/a;->x(ILandroid/os/Parcel;)V

    return-void
.end method

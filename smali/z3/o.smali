.class final Lz3/o;
.super Lz3/p;
.source "SourceFile"


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lz3/p;-><init>(Lcom/google/android/gms/common/api/f;)V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 0

    return-object p1
.end method

.method protected final bridge synthetic l(Lcom/google/android/gms/common/api/a$b;)V
    .locals 2

    check-cast p1, Lz3/i;

    invoke-virtual {p1}, Lc4/c;->C()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lz3/w;

    new-instance v1, Lz3/n;

    invoke-direct {v1, p0}, Lz3/n;-><init>(Lz3/o;)V

    invoke-virtual {p1}, Lz3/i;->k0()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lz3/w;->M(Lz3/v;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    return-void
.end method
